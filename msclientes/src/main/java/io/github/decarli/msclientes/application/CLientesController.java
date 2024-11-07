package io.github.decarli.msclientes.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class CLientesController {

    @GetMapping
    public String status(){
        return "ok";
    }
}
