#Author: Marconi Oliveira

@executa
Feature: Pages Tricentis
  Eu como usuario quero aprender pages 

  @tag1
  Scenario: Cotacao automobile
    Given que entre no site da empresa tricentis para cotacao 
    And clico na opcao desejada
    When preencho os dados do veiculo
    And preencho os dados do seguro
    And preencho os dados do produto
    And preencho os dados do preco
    And envio cotacao
    Then cotacao enviada com sucesso

  