package controller;

import dao.MySQLUserDAO;
import model.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = request.getParameter("rut");
        String pass = request.getParameter("contrasena");

        Login lo = new Login();
        MySQLUserDAO myDAO = new MySQLUserDAO();
        System.out.println("00");
        if (lo.autentificacion(user, pass)) {
            System.out.println("11");
            int a=0;
            HttpSession sesionOk = request.getSession();
            sesionOk.setAttribute("rut", user);
            System.out.println("ATRIBUTO: " + sesionOk.getAttribute("rut"));
            a=myDAO.obtUsuarioXrut(sesionOk.getAttribute("rut").toString()).getTipoUsuario();
            System.out.println("validacion: " + a);
            if (a == 1) {
                request.getRequestDispatcher("adminSolicitante.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("adminPrestador.jsp").forward(request, response);
            }
            // redireccion al home.jsp
            // request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {

            // en caso de usuario y contraseña invalido
            String error = "usuario o contraseña incorrecta";
            request.setAttribute("error", error);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
