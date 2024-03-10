/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DARSHAN
 */
public class LogOut extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SessionServlet</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; }");
            out.println(".container { max-width: 90%; margin: 50px auto; padding: 20px; background-color: #fff; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }");
            out.println("h1 { text-align: center; }");
            out.println("p { font-size: 13px; }");
            out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
            out.println("table, th, td { border: 1px solid #ddd; padding: 10px; }");
            out.println("th { background-color: #f2f2f2; text-align: left; }");
            out.println(".form-group input[type=\"submit\"] {\n" +
                        "            width: 20%;\n" +
                        "            padding: 10px;\n" +
                        "            background-color: #007bff;\n" +
                        "            color: #fff;\n" +
                        "            border: none;\n" +
                        "            border-radius: 4px;\n" +
                        "            cursor: pointer;\n" +
                        "        }\n" +
                        "        .form-group input[type=\"submit\"]:hover {\n" +
                        "            background-color: #0056b3;\n" +
                        "        }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>Session Closed</h1>");
            out.println("<table>");
            String name = (String) session.getAttribute("nm");
            Integer visitCount = (Integer) session.getAttribute("visitCount");
            out.println("<p align='right'>Visit Count: "+visitCount+"</p>");
            out.println("<tr><td align='center'>Thank you " + name + "</td></tr>");
//            out.println("<tr><td class=\"form-group\" align='center'><form action=\"LogOut\" method=\"POST\"><input type='submit' value='Log Out'/></form></td></tr>");
//            out.println("<tr><td>Creation Time</td><td>" + createTime + "</td></tr>");
//            out.println("<tr><td>Last Access Time</td><td>" + lastAccess + "</td></tr>");
//            out.println("<tr><td>Session ID</td><td>" + sessionId + "</td></tr>");
//            out.println("<tr><td>Max Inactive Interval</td><td>" + maxInactive + " seconds</td></tr>");
//            out.println("<tr><td>Visit Count</td><td>" + visitCount + "</td></tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
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
