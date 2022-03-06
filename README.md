# Desafio de Programação 02 - Academia Capgemini 2022

Esse projeto foi desenvolvido na linguagem java utilizando a IDE Eclipse, nele é apresentado a solução das questões listadas abaixo.
Os arquivos estão contidos em src/br/com/capgemini, onde, nele contém mais 3 pacotes cada um contendo a solução de suas referidas questões. 

Para que tenha exito na execução é necessario que tenha o pacote JDK/JRE instalado em sua máquina.

# Instalação

Instalando com git:

$ git clone https://github.com/fernandaoliverc/challenge-02

(OBS:O Arquivo pode ser baixado em sua máquina e ser adicionado de forma manual em sua IDE de preferência).

Importando projeto no Eclipse (OBS: Pode ser utilizada qualquer outra IDE)

File -> Import -> File System -> Selecione o diretório do projeto clonado.

# Questão 01

A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

Exemplo:

Entrada: 

arr = [9, 2, 1, 4, 6]

Saída:

4

# Saída da Solução - Questão 01:
![questao-01](https://user-images.githubusercontent.com/64935311/156937982-81129b32-5a9c-46de-bf8c-2eb8b23327a9.jpg)




# Questão 02

  Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

Exemplo:

Entrada: 

n = [1, 5, 3, 4, 2]
Saída: 

3

Explicação:

Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

# Saída da Solução - Questão 02:

![questao-02](https://user-images.githubusercontent.com/64935311/156936328-a0d71a80-f1ff-4169-9da7-599d13dcddeb.jpg)

# Questão 03

Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

√T<=linha<=coluna<=√T

Considere T, como o tamanho do texto.
Se certifique de que linhas x colunas >= .
Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.
Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

Exemplos:


Exemplo 1)

Entrada:

s = tenha um bom dia


Saída:

taoa eum nmd hbi


Explicação:

Depois de remover os espaços, a string tem 13 caracteres. √13 está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

tenh
aumb
omdi
a

O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.


Exemplo 2)

Entrada:

s = ola mundo


Saída:

omd luo an


Explicação:

Depois de remover os espaços a string tem 8 caracteres.  está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:

ola

mun

do

# Saída da Solução - Questão 03:

Exemplo 1

![questao-03-ex01](https://user-images.githubusercontent.com/64935311/156936514-aca77e8a-fb4e-4943-894e-c116e1cb49d5.jpg)

Ezxemplo 2

![questao-03-ex02](https://user-images.githubusercontent.com/64935311/156936589-a2cde8f0-4f18-4bd4-a7cb-322465f7b01d.jpg)
