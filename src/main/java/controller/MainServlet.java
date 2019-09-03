package controller;

import model.Services;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action.equals("sort")) {
            String mass = req.getParameter("mass").trim();
            String[] arrayStr = mass.split(" ");
            try {
                int[] arrayInt = new int[arrayStr.length];
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = Integer.parseInt(arrayStr[i]);
                }

                req.setAttribute("message", "Массив: " + mass);
                req.setAttribute("sortArray", "Отсортированный массив: " + Services.arrayToString(Services.sortArray(arrayInt)));
                req.getRequestDispatcher("/view/sort.jsp").forward(req, resp);
            } catch (Exception e) {
                req.setAttribute("message", "Некорректный ввод данных, повторите ввод");
                req.setAttribute("sortArray", mass);
                req.getRequestDispatcher("/view/sort.jsp").forward(req, resp);
            }
        }

        if (action.equals("random")) {
            int[] arrayInt = Services.newArray(20, 100);
            int[] arraySort = arrayInt.clone();

            req.setAttribute("message", "Случайный массив: " + Services.arrayToString(arrayInt));
            req.setAttribute("sortArray", "Отсортированный массив: " + Services.arrayToString(Services.sortArray(arraySort)));
            req.getRequestDispatcher("/view/sort.jsp").forward(req, resp);
        }
    }
}