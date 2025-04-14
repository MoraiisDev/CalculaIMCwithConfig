# CalculaIMC

Projeto desenvolvido em Java com Spring Boot que realiza o cálculo do IMC (Índice de Massa Corporal) com base no peso e altura informados pelo usuário. Após o cálculo, o sistema classifica o IMC e exibe o resultado em uma página HTML com uma mensagem positiva e educativa, além de permitir novo cálculo e acesso a informações sobre cada classificação.

## 🚀 Funcionalidades

- Entrada de **peso (kg)** e **altura (cm)** via formulário;
- Cálculo do IMC e classificação;
- Exibição dos dados na tela de resultado:
  - Nome
  - Peso
  - Altura
  - Classificação
  - Mensagem positiva
  - Botão para realizar um novo cálculo.

## 📊 Classificações de IMC

| Classificação          | IMC (kg/m²)      |
|------------------------|------------------|
| Abaixo do peso         | Menor que 18.5   |
| Peso normal            | 18.5 a 24.9      |
| Sobrepeso              | 25 a 29.9        |
| Obesidade              | 30 a 34.9        |
| Obesidade II           | 35 a 39.9        |
| Obesidade III          | Maior que 40     |

## 🛠 Tecnologias utilizadas

- Java 17
- Spring Boot
- Thymeleaf (template engine)
- HTML5, CSS e JavaScript (formatação dinâmica dos campos)
- Maven

## ▶️ Como executar

1. Clone o repositório:
   ```sh
   git clone (https://github.com/usuario/CalculaIMCwithConfig.git)
   ```
   
2. Acesse o diretório:
     ```sh
     cd calculaimcbeans
     ```

3. Execute o projeto:
     ```sh
     ./mvnw spring-boot:run
     ``` 
     ou rode 
      ```sh
      CalculaimcbeansApplication.java 
      ```
      via IDE

4. Acesse no navegador:
     ```sh
     http://localhost:5000
     ```