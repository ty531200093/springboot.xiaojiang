package com.tangyuan.springboot.xiaojiang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author:ty
 * @create:2019-07-10 09:20
 * */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name ="name")String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
    }
}
