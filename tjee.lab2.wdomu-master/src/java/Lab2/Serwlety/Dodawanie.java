/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Serwlety;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
@WebServlet(name = "Dodawanie", urlPatterns = {"/Dodawanie"})
public class Dodawanie extends HttpServlet {
    
    private boolean polaczenie = false;
    private String data;

private String addDataToDb(String id, String nazwa, String adres, String nip, String znizka, String osoba) {
    boolean czyZnizka = znizka.equals("on");
    boolean czyOsoba = osoba.equals("on");
    try {
        polaczenie = Solution.DbManager.Connect();
        if (polaczenie) {
        Solution.DbManager.insertData(id, nazwa, adres, nip, czyZnizka, czyOsoba);
        data = Solution.DbManager.getData();
        polaczenie = Solution.DbManager.Disconnect();
    }
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(Wypisywanie.class.getName()).log(Level.SEVERE, null, ex);
    }
return data;
}

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
        String znizka = "on";
        String osoba = "on";
        String id=request.getParameter("id");
        String nazwa=request.getParameter("nazwa");
        String adres=request.getParameter("adres");
        String nip=request.getParameter("nip");
        

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><meta><link rel='stylesheet' href='css/components.css'>");
            out.println("<link rel='stylesheet' href='css/icons.css'>");
            out.println("<link rel='stylesheet' href='css/responsee.css'>");
            out.println("<body>" + "Lista klientow " +"<br />");
            out.println(addDataToDb(id, nazwa, adres, nip, znizka, osoba));
            out.println("<a class=\'button rounded-full-btn reload-btn s-2 margin-bottom\' href=");
            out.println(request.getHeader("referer"));
            out.println("><i class='icon-sli-arrow-left'>Powrót</i></a>");
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
