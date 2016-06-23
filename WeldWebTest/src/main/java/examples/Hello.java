package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.xebia.extras.selma.Selma;
import selma.BeanBo;
import selma.BeanDTO;
import selma.SelmaMapper;
import service.ServiceTest;

public class Hello extends HttpServlet {

	@Inject
	private ServiceTest service;
	
	@Override
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
	      // Set the response message's MIME type.
	      response.setContentType("text/html;charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket.
	      PrintWriter out = response.getWriter();
	 
	         try {
	         out.println("<!DOCTYPE html>");  // HTML 5
	         out.println("<html><head>");
	         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	         String title = service.test();
	         out.println("<title>" + title + "</title></head>");
	         out.println("<body>");
	         out.println("<h1>" + title + "</h1>");  // Prints "Hello, world!"
	         out.println("</body></html>");
	      } finally {
	         out.close();  // Always close the output writer
	      }
	         
	         
	      SelmaMapper mapper = Selma.builder(SelmaMapper.class).build();
	      BeanDTO beanDTO = new BeanDTO();
	      BeanBo res = mapper.asBo(beanDTO);

	         
	   }
}