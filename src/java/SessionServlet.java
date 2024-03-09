/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DARSHAN
 */
public class SessionServlet extends HttpServlet {

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
//            HttpSession session = request.getSession();
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            
            session.setAttribute("nm", request.getParameter("my_name"));
            String name = (String) session.getAttribute("nm");

            
            Date create_time = new Date(session.getCreationTime());
            Date last_access  = new Date(session.getLastAccessedTime());
            String session_id = new String(session.getId());
            int max_inactive = session.getMaxInactiveInterval();
            int visitCount = 0;
            String visitCountKey = new String("visitCount");
            String userIDKey = new String("userID");
            String userID = new String("ABCD");
            
            if(session.isNew()){
                session.setAttribute(userIDKey, userID);
                
            }else{
                visitCount = (Integer)session.getAttribute(visitCountKey);
                visitCount = visitCount + 1;
                userID = (String)session.getAttribute(userIDKey);
            }
            session.setAttribute(visitCountKey,  visitCount);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
//            out.println("<form method=\"POST\"><table><tr><td>Enter Name: </td><td><input type=\"text\" name=\"name\"></td></tr><tr><td><input type=\"submit\" value=\"Submit\"</td></tr> </table></form>");
            out.println("<h1>"+name+"</h1>");
            out.println("<h1>Create time: "+create_time+"</h1>");
            out.println("<h1>Last access: "+last_access+"</h1>");
            out.println("<h1>Session id: "+session_id+"</h1>");
            out.println("<h1>Max inactive: "+max_inactive+"</h1>");
            out.println("<h1>Visit: "+visitCount+"</h1>");
            out.println("<h1>Id: "+userID +"</h1>");
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
