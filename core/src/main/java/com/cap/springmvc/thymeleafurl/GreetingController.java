package com.cap.springmvc.thymeleafurl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class GreetingController {

  @GetMapping("/start")
  public String hello(Model model) {

    model.addAttribute("greeting", new Greeting());
    return "th/sayhello";
  }

  @PostMapping("/message")
  public String goodbye(@ModelAttribute Greeting greeting) {

    return "th/messagesent";
  }

}
