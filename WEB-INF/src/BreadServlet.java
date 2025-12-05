package survey;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BreadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        // ★ getParameter() の引数
        String name  = request.getParameter("customerName");
        String bread = request.getParameter("breadType");

        // ★ setAttribute() の引数
        request.setAttribute("nameAttr",  name);
        request.setAttribute("breadAttr", bread);

        // ★ getRequestDispatcher() の引数
        RequestDispatcher rd =
            request.getRequestDispatcher("/breadResult.jsp");

        rd.forward(request, response);
    }
}
