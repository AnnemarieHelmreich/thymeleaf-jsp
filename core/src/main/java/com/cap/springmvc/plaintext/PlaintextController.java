package com.cap.springmvc.plaintext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlaintextController {

  @GetMapping("/plain")
  public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Set the response message's MIME type
    response.setContentType("text/html;charset=UTF-8");
    // Allocate a output writer to write the response message into the network socket
    PrintWriter out = response.getWriter();
    // Write the response message, in an HTML page
    try {
      out.println("<!DOCTYPE html>");
      out.println("<html><head>");
      out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
      out.println("<title>Plain text</title></head>");
      out.println("<body>");
      out.println("<h1>Hello there!</h1>"); // says Hello
      out.println("<h3>I am just a plain text - no .jsp, no template.</h3>");
      out.println("<br/><br/>");
      out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
      out.println(
          "<h4>If you prefer to talk to Thymeleaf...    <a href=\"/springmvc/thymeleaf/start\">this is the way</a></h4>");
      out.println("</html>");
    } finally {
      out.close(); // Always close the output writer
    }

  }

}
