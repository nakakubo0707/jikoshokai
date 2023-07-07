package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testservlet")
public class testServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        
        // データベースから基本情報を取得するためのクエリを実行し、結果を取得
        String name = "中久保柊磨";
        String birthday = "2000/11/27";
        int age = 22;
        String joinDate = "2023/07/01";
        int tenureMonths = 0; // 勤続月数を取得するロジックを追加
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"ja\">");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Profile</title>");
            out.println("<meta name=\"description\" content=\"テキストテキストテキストテキストテキストテキストテキストテキスト\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("<script>");
            out.println("function func1() {");
            out.println("var x = document.getElementById('test1');");
            out.println("x.innerHTML = '0か月';");
            out.println("}");
            out.println("</script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header id=\"header\" class=\"wrapper\"></header>");
            out.println("<main>");
            out.println("<section id=\"about\" class=\"wrapper\">");
            out.println("<h2 class=\"section-title\">基本情報</h2>");
            out.println("<div class=\"content\">");
            out.println("<img src=\"C:\\Users\\DEFTRIBE\\Desktop\\nakakubo\\apple.jpg\" alt=\"リンゴ\" style=\"width: 200px; height: 150px;\">");
            out.println("<div class=\"text\">");
            out.println("<h3 class=\"content-title\">" + name + "</h3>");
            out.println("<p>生年月日 " + birthday + "</p>");
            out.println("<p>年齢 " + age + "歳</p>");
            out.println("<p>入社日 " + joinDate + "</p>");
            out.println("<p>勤続年数<br>");
            out.println("<button type=\"button\" onclick=\"func1();\">表示</button>");
            out.println("<span id=\"test1\"></span></p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</section>");

            // フォームを追加
            out.println("<section id=\"contact\" class=\"wrapper\">");
            out.println("<h2 class=\"section-title\">お問い合わせ</h2>");
            out.println("<div class=\"content\">");
            out.println("<form action=\"processForm\" method=\"POST\">");
            out.println("<label for=\"name\">名前</label><br>");
            out.println("<input type=\"text\" id=\"name\" name=\"name\" required><br>");

            out.println("<label for=\"email\">メールアドレス</label><br>");
            out.println("<input type=\"email\" id=\"email\" name=\"email\" required><br>");

            out.println("<label for=\"message\">メッセージ</label><br>");
            out.println("<textarea id=\"message\" name=\"message\" rows=\"5\" required></textarea><br>");

            out.println("<input type=\"submit\" value=\"送信\">");
            out.println("</form>");
            out.println("</div>");
            out.println("</section>");
//テスト
            out.println("</main>");
            out.println("<footer id=\"footer\">");
            out.println("<p>&copy; 2023 Profile</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

