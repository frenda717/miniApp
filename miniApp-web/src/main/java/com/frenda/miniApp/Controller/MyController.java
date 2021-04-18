package com.frenda.miniApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/request")
    @ResponseBody
    public String out(){
        return "SUCCESS";
    }
}
