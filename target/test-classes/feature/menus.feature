Feature: Menus
  Description: Valida menus da aplicação

  Scenario: Validar submenus do menu "Para Você"
    Given O usuario esta na home
    When O usuario passar o mouse sobre o menu Para Você
    Then Todos os submenus devem ser listados
