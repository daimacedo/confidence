Feature: Menus
  Description: Valida menus da aplicação


  Scenario: Validar submenus do menu "Para Você"
    Given O usuario esta na home
    When O usuario passar o mouse sobre o menu Para Você
    Then Todos os submenus do Menu Para Voce devem ser listados


@run
  Scenario: Validar submenus do menu "Produtos > Pessoa Fisica"
    Given O usuario esta na home
    When O usuario passar o mouse sobre o menu Produtos > Pessoa Fisica
    Then Todos os submenus do menu Produtos > Pessoa Fisica devem ser listados
