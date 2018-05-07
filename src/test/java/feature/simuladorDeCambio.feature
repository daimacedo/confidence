Feature: Simulador de Câmbio
  Description: Testa cotações de câmbio

  Scenario: Preencher dados de compra no simulador
    Given O usuario esta na home
    When O usuario preencher os valores da compra
    Then O usuario deve ser redirecionado para o cadastro do ecommerce
