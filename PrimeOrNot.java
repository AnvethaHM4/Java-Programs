//6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeCheckServlet")
public class PrimeCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String numStr = request.getParameter("number");
        int num = Integer.parseInt(numStr);
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        out.println("<html><body>");
        if (isPrime) {
            out.println("<h2>" + num + " is a Prime Number.</h2>");
        } else {
            out.println("<h2>" + num + " is Not a Prime Number.</h2>");
        }
        out.println("<a href='input.html'>Try Another Number</a>");
        out.println("</body></html>");
    }
}
/HTML PROGRAM
<!DOCTYPE html>
<html>
<head>
    <title>Prime Number Checker</title>
</head>
<body>
    <h2>Check if a Number is Prime</h2>
    <form action="PrimeCheckServlet" method="post">
        Enter a number: <input type="text" name="number" required>
        <input type="submit" value="Check">
    </form>
</body>
</html>
