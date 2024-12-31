import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class HelloServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println("Hello world");*/
        PrintWriter out = resp.getWriter();

        String servletPath = req.getServletPath();
        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        String requestMethod = req.getMethod();
        String pathInfo = req.getPathInfo();
        String remoteUser = req.getRemoteUser();


       out.println("Servlet Path: " + servletPath); //Servlet Path: /hello
       out.println("Request URI: " + requestURI); //Request URI: /HelloServer_Web_exploded/hello
       out.println("Context Path: " + contextPath); //Context Path: /HelloServer_Web_exploded
       out.println("Request Method: " + requestMethod); //Request Method: GET
       out.println("Path Info: " + pathInfo);
       out.println("Remote User: " + remoteUser);
    }

}