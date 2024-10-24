# AutoLogon
Este programa Java automatiza parte do processo de login em um sistema web utilizando o navegador Google Chrome. Ele foi desenvolvido como uma solução para um problema enfrentado em um computador utilizado para o painel de senha do sistema Tasy Web, onde o objetivo era evitar que o usuário tivesse que fazer login manualmente repetidas vezes.
O código realiza os seguintes passos:
Inicia o Chrome: Abre o Chrome com o perfil de usuário local do Windows, navegando automaticamente até a página de login do sistema Tasy.
Automação de Interações: O programa aguarda um tempo predefinido e utiliza a classe Robot para simular ações de teclado e mouse, como pressionar ENTER, ativar o modo tela cheia (F11) e clicar em uma área específica da tela.
Login Automático: Para que o login seja realizado automaticamente, o Chrome precisa ter o login e senha já salvos previamente, pois o programa não preenche os dados do formulário por conta própria.
Tratamento de Erros: Em caso de falha no processo, uma mensagem de erro é exibida em uma janela pop-up.
