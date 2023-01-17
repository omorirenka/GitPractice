package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Account16DAO;
import dto.Account16;
import util.GenerateHashedPw;

/**
 * Servlet implementation class Kadai17LoginServlet
 */
@WebServlet("/Kadai17LoginServlet")
public class Kadai17LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai17LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("UTF-8");
		
		String mel = request.getParameter("mail");
		String pw = request.getParameter("pw");
		
		String salt = Account16DAO.getSalt(mel);
		
		if(salt == null) {
			String view = "WEB-INF/view/kadai17-login.jsp?error=1";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
			return;
		}
		String hashedPw = GenerateHashedPw.getSafetyPassword(pw, salt);
		
		System.out.println("ログイン時のソルト：" + salt);
		System.out.println("ログイン時のハッシュPW：" + hashedPw);
		
		Account16 ac = Account16DAO.login(mel, hashedPw);
		if(ac == null) {
			String view = "WEB-INF/view/kadai17-login.jsp?error=1";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		} else {
			String view = "WEB-INF/view/kadai17-menu.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
