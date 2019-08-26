package servlets;

import task1.Test1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class SortServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mass = req.getParameter("mass").trim();
        String[] arrayStr = mass.split(" ");
        try {
            int[] arrayInt = new int[arrayStr.length];
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = Integer.parseInt(arrayStr[i]);
            }

            String result = Arrays.toString(Test1.sortArray(arrayInt));
            result = result.substring(1, result.length() - 1);
            result = result.replaceAll(",", "");

            req.setAttribute("message", "Отсортированный массив");
            req.setAttribute("sortArray", result);
            doGet(req, resp);
        } catch (Exception e) {
            req.setAttribute("message", "Некорректный ввод данных, повторите ввод");
            req.setAttribute("sortArray", mass);
            doGet(req, resp);
        }
    }

}
