#language: pt

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
 
Cenario: Aceitar o cookie LGPD
Dado que eu estou no site da accenture
E aceito os termos LGPD
Entao deve fechar a caixa de informacao
 
Cenario: Configuracoes do cookie
Dado que eu estou no site da accenture
E aceito os termos LGPD
E clico em configuracaes de cookie
Entao devo ver os itens
|sua privacidade|
|Cookies estritamente necessarias|
|Cookies Analiticos de Primeira Parte|
|Cookies de Desempenho e Cookies Funcionais|
|Cookies de Publicidade e Redes Sociais|