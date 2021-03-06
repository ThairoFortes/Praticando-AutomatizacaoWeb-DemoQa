#language: pt
#enconding: UTF-8

@Elements
Funcionalidade: TextBox, CheckBox, RadioButton, WebTablesAdd, WebTablesEdit, WebTablesDelete, WebTablesSearch
  

  @TextBox
  Esquema do Cenario: Preenchendo Formulário TextBox
  Dado que o usuário clique na opção Elements
  Quando escolher a opção Text Box
  E preencher o nome completo "<nome>"
  E preencher o email "<email>"
  E preencher o endereço atual "<endereço_atual>"
  E preencher o endereço permanente "<endereço_permanente>"
  E clicar no botão para enviar o retório
  Então é apresentado o que foi preenchido "<nome>", "<email>", "<endereço_atual>", "<endereço_permanente>"
  
  Exemplos: 
  		
| nome 			 										| email 																|	endereço_atual						| endereço_permanente 		|
| Márcio Ryan Sérgio Dias				| marcioryansergiodias@gmail.com				|	Quadra QL 4 Conjunto F		|	Conjunto CR							|
#| Evelyn Aparecida da Costa			| evelynaparecidadacosta@gmail.com			|	Quadra EQNN 3/5 Bloco A		|	Quadra QL 4 Conjunto F	|
#| Daniela Antonella Maya Araújo	| danielaantonellamayaaraujo@gmail.com	| Conjunto CR								|	Quadra EQNN 3/5 Bloco A |


 @CheckBox
 Esquema do Cenario: Selecionar check box do arquivo
 Dado que o usuário clique na opção Elements
 Quando escolher a opção Check Box
 E expandir a árvore do diretório
 E selecionar check box do arquivo Excel File.doc
 Então a mensagem "You have selected :" "excelFile" é apresentada
 
 @RadioButton
 Esquema do Cenario: Selecionar opção de Radio Button
 Dado que o usuário clique na opção Elements
 Quando escolher a opção Radio Button
 E selecionar a opção Yes	
 Então a mensagem "You have selected Yes" é exibida
 
 @WebTablesAdd
 Esquema do Cenario: Adicionar um registro
 Dado que o usuário clique na opção Elements
 Quando escolher a opção Web Tables
 E clicar no botão para adicionar um registro	
 E preencher o campo primeiro nome "<primeiro_nome>"
 E preencher o campo ultimo_nome "<ultimo_nome>"
 E preencher o campo email "<email>"
 E preencher o campo idade "<idade>"
 E preencher o campo salario "<salario>"
 E preencher o campo departamento "<departamento>"
 E clicar no botão para salvar o registro
 Então o registro salvo é encontrado na tabela de resultados "<primeiro_nome>", "<ultimo_nome>", "<email>", "<idade>", "<salario>" e "<departamento>"
 
 Exemplos: 
  		
| primeiro_nome	| ultimo_nome | email                    | idade | salario | departamento   |
| Márcio 				| Dias				| marcio.dias@gmail.com		 | 32		 | 4512		 | Administrativo |
#| Evelyn 				| Costa				| evelyn.costa@gmail.com	 | 46    | 5102    | Tecnologia			|
#| Daniela 			| Araújo			| daniela.araujo@gmail.com | 19    | 1632    | Financeiro			|

 @WebTablesEdit
 Esquema do Cenario: Editar um registro
 Dado que o usuário clique na opção Elements
 Quando escolher a opção Web Tables
 E clicar no botão para adicionar um registro	
 E preencher o campo primeiro nome "<primeiro_nome>"
 E preencher o campo ultimo_nome "<ultimo_nome>"
 E preencher o campo email "<email>"
 E preencher o campo idade "<idade>"
 E preencher o campo salario "<salario>"
 E preencher o campo departamento "<departamento>"
 E clicar no botão para salvar o registro
 E o registro salvo é encontrado na tabela de resultados "<primeiro_nome>", "<ultimo_nome>", "<email>", "<idade>", "<salario>" e "<departamento>"
 E clicar no botão para editar esse registro
 E preencher o campo primeiro nome "<editar_primeiro_nome>"
 E preencher o campo ultimo_nome "<editar_ultimo_nome>"
 E preencher o campo email "<editar_email>"
 E preencher o campo idade "<editar_idade>"
 E preencher o campo salario "<editar_salario>"
 E preencher o campo departamento "<editar_departamento>"
 E clicar no botão para salvar o registro
 Então o registro salvo é encontrado na tabela de resultados "<editar_primeiro_nome>", "<editar_ultimo_nome>", "<editar_email>", "<editar_idade>", "<editar_salario>" e "<editar_departamento>"
 
 Exemplos: 
  		
| primeiro_nome	| ultimo_nome | email             | idade | salario | departamento   | editar_primeiro_nome | editar_ultimo_nome | editar_email			 | editar_idade | editar_salario  | editar_departamento |
| Márcio 				| Dias				| marcio@gmail.com	| 32		| 4512		| Administrativo | Gianna               | Porto							 | gianna@gmail.com	 |	22					| 2000						| Comercial						|
#| Mateus 				| Costa				| mateus@gmail.com	| 46    | 5102    | Tecnologia	   | Carol								| Moreira						 | carol@gmail.com	 | 18           | 1000						|	RH									|
#| Daniela 			| Araújo			| daniela@gmail.com | 19    | 1632    | Financeiro		 | Marcelo              | Duarte						 | marcelo@gmail.com | 28					 	| 2500						| Administrativo			|

@WebTablesDelete
 Esquema do Cenario: Deletar um registro
 Dado que o usuário clique na opção Elements
 Quando escolher a opção Web Tables
 E clicar no botão para adicionar um registro	
 E preencher o campo primeiro nome "<primeiro_nome>"
 E preencher o campo ultimo_nome "<ultimo_nome>"
 E preencher o campo email "<email>"
 E preencher o campo idade "<idade>"
 E preencher o campo salario "<salario>"
 E preencher o campo departamento "<departamento>"
 E clicar no botão para salvar o registro
 E o registro salvo é encontrado na tabela de resultados "<primeiro_nome>", "<ultimo_nome>", "<email>", "<idade>", "<salario>" e "<departamento>"
 E clicar no botão para excluir esse registro
 Então o registro excluído não é encontrado na tabela de resultados "<primeiro_nome>", "<ultimo_nome>", "<email>", "<idade>", "<salario>" e "<departamento>"
 
 Exemplos:
  
| primeiro_nome	| ultimo_nome | email             | idade | salario | departamento   | 
| Márcio 				| Dias				| marcio@gmail.com	| 32		| 4512		| Administrativo | 
#| Mateus 				| Costa				| mateus@gmail.com	| 46    | 5102    | Tecnologia	   | 
#| Daniela 			| Araújo			| daniela@gmail.com | 19    | 1632    | Financeiro		 | 

@WebTablesSearch
 Esquema do Cenario: Pesquisar um registro
 Dado que o usuário clique na opção Elements
 Quando escolher a opção Web Tables
 E clicar no botão para adicionar um registro	
 E preencher o campo primeiro nome "<primeiro_nome>"
 E preencher o campo ultimo_nome "<ultimo_nome>"
 E preencher o campo email "<email>"
 E preencher o campo idade "<idade>"
 E preencher o campo salario "<salario>"
 E preencher o campo departamento "<departamento>"
 E clicar no botão para salvar o registro
 E o registro salvo é encontrado na tabela de resultados "<primeiro_nome>", "<ultimo_nome>", "<email>", "<idade>", "<salario>" e "<departamento>"
 E pesquiar por "<primeiro_nome>"
 Então o registro é encontrado na pesquisa "<primeiro_nome>", "<ultimo_nome>", "<email>", "<idade>", "<salario>" e "<departamento>"
 
  Exemplos:
  
| primeiro_nome	| ultimo_nome | email             | idade | salario | departamento   | 
| Márcio 				| Dias				| marcio@gmail.com	| 32		| 4512		| Administrativo | 
#| Mateus 				| Costa				| mateus@gmail.com	| 46    | 5102    | Tecnologia	   | 
#| Daniela 			| Araújo			| daniela@gmail.com | 19    | 1632    | Financeiro		 | 

@Buttons
 Esquema do Cenario: Clicar em botões
 Dado que o usuário clique na opção Elements
 Quando escolher a opção Buttons
 E clicar no botão Double Click Me
 Então a mesangem "You have done a double click" é apresentada
 E clicar no botão Right Click Me
 Então a mesangem "You have done a right click" é apresentada
 E clicar no botão Click Me
 Então a mesangem "You have done a dynamic click" é apresentada