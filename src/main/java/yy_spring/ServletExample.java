package yy_spring;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ServletExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Request incoming");
		Enumeration<String> it = req.getHeaderNames();
		while (it.hasMoreElements()) {
			String header = it.nextElement();
			System.out.println("Header:" + header + "  " + req.getHeader(header));
		}


		PrintWriter out = resp.getWriter();
		out.write("Hallo");

	}


	public static void main(String[] args) throws Exception {

		// Disable annoying debug log
		Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		root.setLevel(Level.INFO);

		Server server = new Server(8082);
		ServletHandler handler = new ServletHandler();
		server.setHandler(handler);

		handler.addServletWithMapping(ServletExample.class, "/*");

		server.start();
		server.join();

	}
}
