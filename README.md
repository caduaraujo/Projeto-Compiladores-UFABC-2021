# Projeto-Compiladores-UFABC-2021

## Trabalho final da disciplina de compiladores na UFABC em 2021.2
### Integrantes
- Rafael Hajime Mori
- Carlos Eduardo de Araujo
- Lucas Almeida

Compilador da IsiLanguage para java, usando a ferramenta antlr4,
que implementa os seguintes recursos:
- Operadores relacionais: ==, >, <, >=, <=, !=
- Atribuição: =
- Operadores aritmétricos: +, -, *, /
- Condicional: se então, senão
- Entrada: leia
- Saida: escreva
- Warning de variaveis declaradas e não utilizadas
- Dois tipos de variáveis (Number e String)


### Exemplo de programa na Isilanguage
```
programa

	numero a, b;
	texto txt;
	numero g;

	leia(a);
	leia(b);
	
	
	a = 4/3*2-1+3;
	
	enquanto(a <= 182){
		escreva(a);
		b = 15;
	}
	
	se (a == b) entao
	{
	a = 185;
	b = 12;
	escreva(a);
	}
	
	escreva(a);
	escreva(b);
	
	
fimprog;
```
