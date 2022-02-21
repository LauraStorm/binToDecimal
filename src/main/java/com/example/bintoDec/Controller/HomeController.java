package com.example.bintoDec.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String binToBinary(){
        return "bin-to-decimal";             //referere til html filen, som den skal returnere. Skriv navnet på html filen
    }
}
