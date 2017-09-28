package com.cap.springmvc.jspurl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JspController {

  @RequestMapping(value = "/jspmessage", method = RequestMethod.GET)
  public String helloWorld(ModelMap model) {

    model.addAttribute("greeting", "Hi, I am a hardcoded message from your server.");
    return "jsp/jsphelloworld";
  }

}
