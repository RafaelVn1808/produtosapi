package io.github.RafaelVn1808.produtosapi.controller;

import io.github.RafaelVn1808.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indica que a classe vai receber requisições REST
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping//enviar dados/Criar recursos no setor
    public Produto salva(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);
        return produto;
    }
}
