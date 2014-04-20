package servlet.Test01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(
		name="MyServlet", 
		urlPatterns ={"/my"},
		initParams = {
				@WebInitParam(name="admin", value="Song2"),
				@WebInitParam(name="email", value="fivesonglee@gmail.com")
		}
	)

public class MyServlet extends HttpServlet {
	ServletConfig ServletConfig;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {

		
		
		super.doGet(req, resp);
	}

}
