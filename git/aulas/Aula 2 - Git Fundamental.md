****************
### O que é um Repositório

* É o que armazena o código
* cada projeto tem apenas 1 Repositório na maioria das vezes
* Só o criamos na inicialização do projeto
* Estes são redirecionados para servidores especializados em sua manipulação: 'GitHub' e 'BitBucket'
* Cada um dos desenvolvedores pode baixar o repositório e criar versões diferentes em sua máquina

****************
### Criação de Repositórios

* Para a criação usamos o '*git init*'
* Git irá criar os arquivos necessários para inicializa-lo, localizados na pasta oculta '*.git*'
* Após, o diretório atual será reconhecido como um projeto pelo git, e poderá ser manipulado com os outros comandos

****************
### O que é o GitHub

- Serviço para gerenciar repositórios
- Podemos enviar os projetos para o github e disponibilizá-lo para outros devs
- Gratuito para projetos públicos ou privados

> Link GitHub em 'Anotações Git e GitHub'

****************
### Enviando repositórios para o GitHub

- Para isso precisamos criar o projeto  no GitHub, inicializar ele no git na maquina, e sincronizar com o GitHub e enviar
- Este fluxo so é realizado uma vez por projeto

> **Criação do Repositório no GitHub**
> 
> 1-  Criar o nome
> 2- Estabelecer o nome e descrição
> 3- Escolher o domínio (Público ou Privado)

Após criar o repositório vazio no GitHub você pode inicializa-lo a partir de sua máquina usando o bash

##### Passos para a Criação de um Repositório do zero
1. Criar algum arquivo
2. Iniciar o Git
3. Adicionar os arquivos criados para o controle de versão
4. Realizar um commit com uma mensagem
5. Criar a branch 'Main'
6. Sincronizar o repositório com o remote origin
7. Enviar as alterações para o repositório com o Push

Usando os comandos do git ficaria dessa forma (usando README.md como exemplo):
1. echo "*mensagem*" >> README.md
2. git init
3. git add README.md
4. git commit -m "*mensagem do commit*"
5. git branch -M main
6. git remote add origin -*link do repositório do GitHub*-
7. git push -u origin main

************
### Verificando Alterações no Projeto

- As mudanças podem ser verificadas via *git status* (Comando utilizado com frequência)
- Ai serão mapeadas todas as alterações do projeto como **Arquivos não Monitorados** e **Arquivos Modificados**
- Basicamente te retornara a diferença do que ja está enviado para o servidor e o salvo no projeto

O Status retornara para arquivos recém-criados
> Untracked files

e retornará para arquivos modificados
> not stagged for commit

***********
### Adicionando arquivos ao Projeto

- Para adicionar arquivos novos ao projeto usamos o *git add*
- Podemos adicionar apenas um ou diversos de uma vez só
- Somente adicionando eles os arquivos serão monitorados pelo Git
- É importante usado de tempos em tempos para não ter perda de recursos devido a um descuido

************
### Salvando alterações do Projeto

- Para salvar usamos o *git commit*
- Podemos commitar arquivos específicos ou vários de uma vez com a flag -a
- Enviar uma mensagem a cada commit usando a flag -m é uma boa Prática

***********
### Enviando código ao Repositório remoto

- Quando finalizamos uma funcionalidade enviamos o código ao Repositório remoto
- Usamos para isso o *git push* 
- Após isto o código do servidor será atualizado baseando-se no código enviado

*************
### Recebendo Mudanças do Repositório remoto

- É muito comum precisarmos sincronizar o local com o remoto e para isso usamos o *git pull* 
- O comando faz com que a máquina busque atualizações no Repositório remoto e se são encontradas, elas se unem ao Repositório local

**********
### Clonando Repositórios

-  Ato de baixar um repositório do servidor para a maquina, usamos para isso o *git clone*
-  Passando a Referência do repositório remoto podemos baixa-lo. Só é executado pela primeira vez para referenciá-lo 

**********
### Removendo arquivos do Repositório

- Arquivos podem ser deletados da monitoração do git
- o comando usado é o *git rm*
- Após a remoção o arquivo não terá mais suas atualizações monitoradas pelo git, apenas quando for adicionado pelo *git add*

*******

### Histórico de alterações

- Podemos acessar um *log* de modificações feitas no projeto
- Para isso usamos o *git log*
- Você receberá uma informação dos commits realizados no projeto até então

*****
### Renomeando Arquivo

- Podemos renomear o arquivo usando o *git mv*
- O mesmo também pode ser movido para outra pasta
- Isso fará com que este novo arquivo seja monitorado pelo git, e o antigo excluído

******
### Desfazendo alterações

- O arquivo modificado por ser retornado ao estado original
- Utilizamos para isso o *git checkout*
- Após a utilização do mesmo, o arquivo sai do staging
- Caso seja feita uma próxima alteração, ele entra em staging novamente

Basicamente o arquivo é retomado ao estado que estava no último *'pull'*

*******************
### Ignorando arquivos no projeto

- Uma técnica muito utilizada em projetos atualmente é ignorar arquivos do projeto
- Devemos inserir um arquivo chamado ***.gitignore*** na raiz do projeto
- Nele podemos inserir todos os arquivos que não devem entrar no versionamento
- É útil para arquivos gerados automaticamente ou arquivos que contêm informações sensíveis

***Adicionar primeiro o nome do arquivo no .gitignore e depois adicionar o arquivo***

### Resetando Todas as alterações da branch

- Com o comando git reset podemos resetar as mudanças feitas
- para isso usamos o *git reset*, com a flag *--hard*
- Todas as alterações commitadas e também as pendentes serão excluídas