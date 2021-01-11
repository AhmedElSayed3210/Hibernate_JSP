/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Noah
 */
public class updat extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        jspMl j = new jspMl();
        JspPojo p = new JspPojo();
        if (request.getParameter("oper").equals("upd")) {
            p.setName(request.getParameter("name"));
            p.setPosition(request.getParameter("position"));
            p.setSalary(Double.parseDouble(request.getParameter("salary")));

            j.update(p);

            request.setAttribute("msg", "Data Updated");

        } else if (request.getParameter("oper").equals("ser")) {
            p = j.select(Integer.parseInt(request.getParameter("id")));

            request.setAttribute("id", p.getId());
            request.setAttribute("name", p.getName());
            request.setAttribute("position", p.getPosition());
            request.setAttribute("salary", p.getSalary());

            request.setAttribute("msg", "This is The Result of Search");
        } else {
            request.setAttribute("msg", request.getParameter("oper") + " vvvvvv");
        }

        RequestDispatcher dis = request.getRequestDispatcher("/update.jsp");
        dis.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
