package guru.springframework.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

    @RequestMapping({"","/","index"})
    public String getIndexPage() {
        System.out.println("123 456");
        return "index";
    }
}
