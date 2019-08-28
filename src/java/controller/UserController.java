/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;

public class UserController extends HttpServlet {

    private void populateUsers(HttpServletRequest request, HttpServletResponse response) {
        UserService usersManager = new UserService();
        List<Usuario> lu = usersManager.getAll();
        request.setAttribute("users", lu);
    }

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
        populateUsers(request, response);
        System.out.println("Procesing Get method");

        request.getRequestDispatcher("users.jsp").forward(request, response);
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
        System.out.println("Procesing Post method");

        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String contrasena = request.getParameter("contrasena");
        int dinero=0;
        int tipoUsuario=0;
        if(Integer.parseInt(request.getParameter("dinero")) >0){
        dinero = Integer.parseInt(request.getParameter("dinero"));
        }
        if(Integer.parseInt(request.getParameter("tipo")) >0){
         tipoUsuario = Integer.parseInt(request.getParameter("tipo"));
        }     

        if (null != rut &&
            null != nombre &&
            null != email && 
            null != contrasena &&
            dinero > 0 &&
            tipoUsuario >0) {
            Usuario u = new Usuario(rut,nombre, email, contrasena, dinero, tipoUsuario);
            UserService usersManager = new UserService();
            usersManager.create(u);
        } else {
            System.out.println("No se puede crear el usuario");
        }

       // populateUsers(request, response);
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
