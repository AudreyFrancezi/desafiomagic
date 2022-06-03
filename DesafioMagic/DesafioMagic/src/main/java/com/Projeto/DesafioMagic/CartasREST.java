package com.Projeto.DesafioMagic;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Magic")
@Component
@ComponentScan("com.Projeto.DesafioMagic")
public class CartasREST {
    
    private RepositorioCartas rCartas;

    @GetMapping
    public List<Cartas>listar(){
        return rCartas.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cartas cartas){
        rCartas.save(cartas);
    }

    @PutMapping
    public void alterar(@RequestBody Cartas cartas){
        if(cartas.getNome() != null )
        rCartas.save(cartas);
    }

    @DeleteMapping
    public void deletar(@RequestBody Cartas cartas){
        rCartas.delete(cartas);
    }
}
