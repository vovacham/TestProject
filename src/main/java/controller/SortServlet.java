package controller;

import model.Services;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SortServlet extends HttpServlet {
    private static int id;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("action");
        id++;

        if (action.equals("sort")) {
            String mass = req.getParameter("mass").trim();
            String[] arrayStr = mass.split(" ");
            try {
                int[] arrayInt = new int[arrayStr.length];
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = Integer.parseInt(arrayStr[i]);
                }

                String[] strArray = {"Массив: " + mass.replaceAll(" ", ", "), "Отсортированный массив: " + Services.arrayToString(Services.sortArray(arrayInt))};
                Services.addMapId(id, strArray);
                resp.sendRedirect(req.getContextPath() + "/Result?id=" + id);
            } catch (Exception e) {
                String[] strArray = {"Некорректный ввод данных, повторите ввод", "Введенные данные: " + mass};
                Services.addMapId(id, strArray);
                resp.sendRedirect(req.getContextPath() + "/Result?id=" + id);
            }
        }

        if (action.equals("random")) {
            int[] arrayInt = Services.newRandomArray(20, 100);
            String[] strArray = {"Случайный массив: " + Services.arrayToString(arrayInt), "Отсортированный массив: " + Services.arrayToString(Services.sortArray(arrayInt))};
            Services.addMapId(id, strArray);
            resp.sendRedirect(req.getContextPath() + "/Result?id=" + id);
        }
    }
}