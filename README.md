# AutoLogon

Este programa Java automatiza parte do processo de login em um sistema web, utilizando o navegador Google Chrome. Ele foi desenvolvido como solução para um problema enfrentado em um computador usado no **Painel de Senhas do Sistema Tasy Web**, onde o objetivo era evitar que o usuário precisasse realizar login manualmente.

> **Nota:** O programa **não preenche automaticamente o login e senha**. Para que o login seja completado, é necessário que as credenciais já estejam salvas no Chrome. O programa apenas impede que o usuário precise clicar no botão "Logar".

## Funcionalidades

- **Inicia o Chrome**: O programa abre o Chrome usando o perfil do usuário local do Windows e navega automaticamente até a página de login do Tasy.
- **Automação de Interações**: Após um tempo de espera predefinido, utiliza a classe `Robot` para simular ações como:
  - Pressionar a tecla **ENTER**
  - Ativar o modo **tela cheia** (F11)
  - Clicar em uma área específica da tela
- **Login Automático**: Para o login ser completado automaticamente, é necessário que o **Chrome tenha as credenciais de login e senha salvas** previamente, pois o programa não preenche os campos de login por conta própria.
- **Tratamento de Erros**: Caso ocorra alguma falha no processo, o programa exibe uma mensagem de erro em uma caixa de diálogo.
