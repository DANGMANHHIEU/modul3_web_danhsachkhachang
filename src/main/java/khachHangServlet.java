import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="servlet", value = "/khachHang")
public class khachHangServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<khachHang> khachHangs = ListCustomer.getKhacHang();
        req.setAttribute("khachHangs",khachHangs);
        req.getRequestDispatcher("demo.jsp").forward(req,resp);
    }
}
