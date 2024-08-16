### Comandos e suas Funções

Abaixo serão comando usados no GitBash , tanto integrado ao VSCode como pelo Prompt

# Snippets


## Fundamental

-  Comando para Criar Inicializar um repositório Git
~~~ Git
git init
~~~


- Comando para receber o status do repositório
~~~ Git
git status
~~~


- Comando para adicionar alteração no repositório
~~~ Git
git add 'arquivos a serem adicionados'
~~~

> O uso de '.' como parâmetro faz com que adicione todos os arquivos


- Comando para lançar as alterações no Repositório
~~~ Git
git commit
~~~

> -a  | Flag usada para commitar vários arquivos de uma vez
> -m | Flag para salvar uma mensagem com o commit


- Comando para criar um nova Branch no Repositório
~~~ Git
git branch
~~~



- Comando para Sincronização
~~~ Git
git remote
~~~

> add - Para adicionar um *remote*


- Comando para 'Empurrar' os commits da Branch para o Repositório
~~~ Git
git push
~~~


- Comando para 'Puxar' os commits da Branch para sua máquina
~~~ Git
git pull
~~~


- Comando para clonar o repositório remoto, e "starta-lo"
~~~ Git
git clone "https ou ssh"
~~~


- Comando para remover arquivo do Repositório
~~~ Git
git rm -arquivo-
~~~


- Comando para ver o Log de Commits
~~~ Git
git log
~~~

> Podemos sair usando o comando  *:q*


- Comando para renomear e mover arquivos
~~~ Git
git mv
~~~

- Comando para desfazer alterações
~~~ Git
git checkout 'nome do arquivo'
~~~

- Comando para resetar uma Branch
~~~ Git
git reset --hard 'origin/branch'
~~~



## Branches

- Comando para visualizar os branchs disponíveis
~~~ Git
git branch
~~~

- Comando para criar  um branch
~~~ Git
git branch 'nomeBranch'
~~~
> -d ou --delete | flag para deletar uma branch

- Comando para mudar de branch
~~~ Git
git checkout 'nomeBranch'
~~~
> -b | flag para criar a branch junto da mudança

- Comando para unir branches
~~~ Git
git mer 'nomeBranch'
~~~

- Comando para guardar as alterações atuais e prosseguir com novas
~~~ Git
git stash
~~~
> list                 | para listar as stashs da branch
> apply 'nome' | aplicar as alterações da stash na branch
> clear              | Limpar todas as stashs do código
> drop 'nome'  | para remover uma stash específica

- Comando para criar tags na branch
~~~ Git
git tag -a 'nome' -m 'mensagem'
~~~