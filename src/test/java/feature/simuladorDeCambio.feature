Feature: Simulador de Câmbio
  Description: Testa cotações de câmbio


  Scenario: Preencher dados de compra no simulador
    Given O usuario esta na home
    When O usuario preencher os valores da compra
    Then O usuario deve ser redirecionado para o cadastro do ecommerce


  Scenario: Receber Alerta de Cambio por email
    Given O usuario esta na home
    When O usuario passar o mouse sobre o menu Para Você
    When O usuario clicar no submenu Alerta de Cambio
    When O usuario selecionar o serviço Moeda em Especie
    When O usuario selecionar a moeda dolar
    When O usuario selecionar receber todos os alertas
    When O usuario digitar seu email
    When O usuario clicar em cadastrar
    Then Um alerta com a mensagem Alerta salvo com sucesso! deve ser exibido


  Scenario: Não Informar email para alerta de recebimento
    Given O usuario esta na home
    When O usuario passar o mouse sobre o menu Para Você
    When O usuario clicar no submenu Alerta de Cambio
    When O usuario selecionar o serviço Moeda em Especie
    When O usuario selecionar a moeda dolar
    When O usuario selecionar receber todos os alertas
    When O usuario clicar em cadastrar
    Then um alerta com a mensagem Preencha o e-mail corretamente deve ser exibido

  Scenario: Não preencher nenhuma informação a ser recebida
    Given O usuario esta na home
    When O usuario passar o mouse sobre o menu Para Você
    When O usuario clicar no submenu Alerta de Cambio
    When O usuario selecionar o serviço Moeda em Especie
    When O usuario selecionar a moeda dolar
    When O usuario digitar seu email
    When O usuario clicar em cadastrar
    Then um alerta com a mensagem Escolha uma das opções disponiveis de alerta deve ser exibido
