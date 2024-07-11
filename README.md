# Conversor de Moedas

## Introdução
O Projeto Conversor de Moedas, foi realizado para o curso de formação ONE Oracle + Alura, visando aplicar os conceitos obtidos durante o curso.

## Descrição
O Conversor de Moedas é uma aplicação Java baseada em console que converte valores entre diferentes moedas utilizando taxas de câmbio obtidas da API ExchangeRate. O programa foi desenvolvido para realizar conversões entre moedas da américa do sul e dólar e permite aos usuários realizar conversões de forma interativa.

## Funcionalidades
- Obtém taxas de câmbio em tempo real da API ExchangeRate.
- Suporta conversão entre moedas da américa do sul e dólar.
- Interface interativa de console para facilidade de uso.

## Requisitos
- Java 11 ou superior
- Biblioteca Gson (inclusa no projeto)
- Conexão com a Internet para acessar a API ExchangeRate

## Como Usar
1. **Clone o repositório** ou baixe os arquivos do projeto.
    ```sh
    (https://github.com/vmariath/ONE-desafio-conversor-moedas.git)
    ```
2. Abra o IntelliJ IDEA e selecione Open.

3. Navegue até o diretório do projeto clonado e clique em OK.

4. No painel lateral do Projeto, encontre a pasta src e encontre o arquivo Main, clique com o botão direito e selecione a opção run 'Main.main()'

5. Siga as instruções do programa no console.

## Exemplo de Uso
Ao executar o programa, você verá um menu com as seguintes opções:

1. Realizar conversão
2. Sair

### Passos para Conversão
1. Escolha a opção `1` para realizar uma conversão.
2. Escolha a opção `2` para sair do conversor.
3. Digite a moeda de entrada (por exemplo, `USD` para Dólar Americano).
4. Digite a moeda de saída (por exemplo, `BRL` para Real Brasileiro).
5. Digite o valor a ser convertido.
6. O programa exibirá o valor convertido.

## Estrutura do Projeto

- **src/Main.java**: Classe principal que contém o loop interativo para o usuário e gerencia a interação com o conversor de moedas.
- **src/CurrencyConverter.java**: Classe que faz as requisições HTTP para a API ExchangeRate e realiza a conversão de moedas e trata os possiveis erros.
- **src/ExchangeRateResponse.java**: Classe modelo para armazenar a resposta da API ExchangeRate.

## Tecnologias utilizadas

- Java
- POO
- Gson
- API ExchangeRate

