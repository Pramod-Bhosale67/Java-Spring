package com.codegreedy.SpringBootWebApp1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // mainly return the view technology i.e JSP file.
    // View mainly do the UI for the client, and it gets the JSP file from the controller.

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/add")
    //HttpSession session -> replaced by Model
    //HttpServletRequest req -> replaced by num1, num2
    public String add(int num1, int num2, Model model ){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;

        // printing the val on the console
        System.out.println(result);

        // passing the val to the JSP page
        // for this, we need a session to hold the values for multiple pages
        model.addAttribute("result", result);

        return "index";
    }


    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        return "index";
    }
}
