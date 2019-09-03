package controller;

import model.Services;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SortServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", Services.messageString);
        req.setAttribute("sortArray", Services.sortArrayString);
        req.getRequestDispatcher("/view/sort.jsp").forward(req, resp);
    }
}
