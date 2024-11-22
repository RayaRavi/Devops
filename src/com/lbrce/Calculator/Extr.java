import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login") // URL mapping for the servlet
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Handles HTTP POST requests for login
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve parameters from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple static validation (Replace with DB validation or other logic)
        if ("admin".equals(username) && "password".equals(password)) {
            // Successful login response
            response.setContentType("text/html");
            response.getWriter().println("<h1>Login Successful</h1>");
            response.getWriter().println("<p>Welcome, " + username + "!</p>");
        } else {
            // Failure response
            response.setContentType("text/html");
            response.getWriter().println("<h1>Login Failed</h1>");
            response.getWriter().println("<p>Invalid username or password.</p>");
        }
    }

    /**
     * Handles HTTP GET requests for the servlet
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("GET method not supported. Please use POST.");
    }
}
