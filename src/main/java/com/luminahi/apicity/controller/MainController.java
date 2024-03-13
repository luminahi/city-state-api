package com.luminahi.apicity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final static Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String redirectTo() {
        log.info("user redirected to /cidades");
        return "redirect:/cidades";
    }
}
