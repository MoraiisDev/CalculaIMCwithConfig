package com.joao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.joao.classificacao.ClassificadorInterface;
import com.joao.classificacao.MensagemApoioInterface;
import com.joao.model.Pessoa;

import org.springframework.ui.Model;

@Controller
public class CalculaIMC {

    @Autowired
    private ClassificadorInterface classificador;

    @Autowired
    private MensagemApoioInterface mensagemApoio;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/formulario")
    public String formulario() {
        return "formulario";
    }

    @PostMapping("/calcular")
    public String calcular(Pessoa pessoa, Model model) {
        try {
            double peso = pessoa.getPeso();
            double alturaEmMetros = pessoa.getAltura() / 100;
            double imc = peso / (alturaEmMetros * alturaEmMetros);
            imc = Math.round(imc * 100.0) / 100.0; // arredondando para 2 casas decimais

            String classificacao = classificador.classificar(imc);
            String mensagem = mensagemApoio.getMensagem(classificacao);

            pessoa.setImc(imc);
            pessoa.setClassificacao(classificacao);
            pessoa.setMensagem(mensagem);

            model.addAttribute("pessoa", pessoa);
            model.addAttribute("mensagem", mensagem);
            
        } catch (NumberFormatException e) {
            model.addAttribute("erro", "Erro ao calcular IMC");
        }

        return "resultado";
    }
}