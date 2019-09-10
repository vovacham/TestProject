package model;

import java.sql.*;

public class BDOperations {

    /**
     * Соединение с БД
     */
    public static Connection connection;

    /**
     * Добавление строки
     */
    public static void addToBase(int mesId, String mesType, String mes1, String mes2) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("INSERT INTO tab (id, mesType, mes1, mes2) " +
                    "VALUES (?, ?, ?, ?) ON CONFLICT (id) DO UPDATE SET mesType = ?, mes1 = ?, mes2 = ?");

            ps.setInt(1, mesId);
            ps.setString(2, mesType);
            ps.setString(3, mes1);
            ps.setString(4, mes2);
            ps.setString(5, mesType);
            ps.setString(6, mes1);
            ps.setString(7, mes2);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Получение строки по Id
     */
    public static String[] getFromBase(int mesId) {
        PreparedStatement ps = null;
        String[] array = new String[3];
        try {
            ps = connection.prepareStatement("SELECT * FROM tab WHERE id = ?");
            ps.setInt(1, mesId);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                array[0] = resultSet.getString(2);
                array[1] = resultSet.getString(3);
                array[2] = resultSet.getString(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return array;
    }

    /**
     * Удаление строки с заданным Id
     */
    public static void removeFromBase(int mesId) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("DELETE FROM tab WHERE id = ?");
            ps.setInt(1, mesId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
