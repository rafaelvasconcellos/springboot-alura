package br.com.alura.listaVip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Configuracao {

    @RequestMapping("/")
    @ResponseBody
    public String Ola(){
        return "Bão meus fi";
    }


    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class, args);
    }
}
