package com.joao.classificacao;

public class Config implements ClassificadorInterface,MensagemApoioInterface {

  @Override
  public String classificar(double imc) {
      if (imc < 18.6) return "Abaixo do peso";
      else if (imc < 25) return "Peso Ideal";
      else if (imc < 30) return "Sobrepeso";
      else if (imc < 35) return "Obesidade grau I";
      else if (imc < 40) return "Obesidade grau II";
      else return "Obesidade grau III";
  }

  @Override
    public String getMensagem(String classificacao) {
        switch (classificacao) {
            case "Abaixo do peso":
                return "Cuide da sua alimentação e procure orientação médica.";
            case "Peso Ideal":
                return "Parabéns! Continue mantendo hábitos saudáveis.";
            case "Sobrepeso":
                return "Fique atento à alimentação e pratique atividades físicas.";
            case "Obesidade grau I":
                return "Busque apoio profissional e comece mudanças graduais.";
            case "Obesidade grau II":
                return "É hora de cuidar da sua saúde com mais atenção.";
            case "Obesidade grau III":
                return "Procure acompanhamento médico para melhorar sua qualidade de vida.";
            default:
                return "Consulte um profissional para mais orientações.";
        }
    }
}