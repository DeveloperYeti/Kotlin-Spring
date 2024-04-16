package org.example.webapplication0404;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class controller {
    @GetMapping("/ex1")
    public void ex(){

    }
}
