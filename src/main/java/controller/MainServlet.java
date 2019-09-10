package controller;

import model.BDOperations;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainServlet extends HttpServlet {

    @Override
    public void init() {
        String url = "jdbc:postgresql://127.0.0.1:5432/test";
        String name = "postgres";
        String password = "postgres";

        try {
            Class.forName("org.postgresql.Driver");
            BDOperations.connection = DriverManager.getConnection(url, name, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
