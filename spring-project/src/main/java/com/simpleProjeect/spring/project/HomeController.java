package com.simpleProjeect.spring.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/home")
public String home(){
// System.out.println("Hey my good friend🙌 THis is my first web app for spring boot");
return "home.jsp";
}
}
