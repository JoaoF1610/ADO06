package com.ADO06.ADO06.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class StartResource {
    @RequestMapping ("/")
    @ResponseBody

    public String start() {
        return "Aplicação rodando.";
    }
}

