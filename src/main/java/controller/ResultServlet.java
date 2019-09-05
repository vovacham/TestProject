package controller;

import model.Services;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        req.setAttribute("message", Services.getValueFromMapId(id)[0]);
        req.setAttribute("sortArray", Services.getValueFromMapId(id)[1]);
        req.getRequestDispatcher("/view/result.jsp").forward(req, resp);
    }
}
