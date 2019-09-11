package controller;

import model.TabDAO;
import model.TabEntity;
import model.Utility;

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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String action = req.getParameter("action");

        if (action.equals("sort")) {
            String mass = req.getParameter("mass").trim();
            String[] arrayStr = mass.split(" ");
            try {
                int[] arrayInt = new int[arrayStr.length];
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = Integer.parseInt(arrayStr[i]);
                }

                id++;
                TabEntity tabEntity = new TabEntity(id, "sort", mass.replaceAll(" ", ", "),
                        Utility.arrayToString(Utility.sortArray(arrayInt)));
                TabDAO.addToBase(tabEntity);

                resp.sendRedirect(req.getContextPath() + "/Result?id=" + id);
            } catch (Exception e) {
                req.setAttribute("error", "NumberFormatException");
                req.setAttribute("mass", mass);
                req.getRequestDispatcher("/view/error.jsp").forward(req, resp);
            }
        }

        if (action.equals("random")) {
            int[] arrayInt = Utility.newRandomArray(20, 100);

            id++;
            TabEntity tabEntity = new TabEntity(id, "random", Utility.arrayToString(arrayInt),
                    Utility.arrayToString(Utility.sortArray(arrayInt)));
            TabDAO.addToBase(tabEntity);
            resp.sendRedirect(req.getContextPath() + "/Result?id=" + id);
        }
    }
}