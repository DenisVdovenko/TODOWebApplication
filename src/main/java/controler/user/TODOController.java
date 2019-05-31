package controler;

import service.TODOService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user/todo")
public class TODOController extends HttpServlet {

    private TODOService todoService = new TODOService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("todoList", todoService.getUsersTodoList("user1"));
        req.getRequestDispatcher("/user/todo.jsp").forward(req, resp);
    }
}
