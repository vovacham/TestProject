package controller;

import model.TabDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        req.setAttribute("TabEntity", TabDAO.getFromBase(id));
        req.getRequestDispatcher("/view/result.jsp").forward(req, resp);
    }
}
