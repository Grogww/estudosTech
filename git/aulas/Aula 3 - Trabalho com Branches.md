*************

### O que são as Branches

- Branch é a forma do git de **Separar as versões dos projetos**
- Quando um projeto é inicializado, ele se inicia na ***'Main'***
- Geralmente cada nova ***feature*** fica em um branch separado
- Após finalizar as alterações na feature, os branchs são unidos para ter o código-fonte final

### Criando e Visualizando os branches

- Para visualizar os branchs disponíveis usamos o ***git branch***
- Para criar um novo branch usamos o comando ***git branch -Nome-***


### Deletando branches

- Podemos deletar um branch com a flag *-d* ou *--delete*
- Não é comum deletarmos um branch, normalmente guardamos o histórico do trabalho
- Geralmente se usa o delete quando o branch foi criado errado


### Mudando de branch

- Podemos mudar para outro branch utilizando o comando ***git checkout  'nome'***
- Este comando é utilizado para dispensar mudanças de um arquivo
- Alterando o branch podemos levar alterações que não foram commitadas junto, **TOME CUIDADO!**


### Unindo Branches

- O código de dois branches podem ser unidos através do ***git merge 'nome'*** 
- Normalmente é por meio dele que recebemos atualizações dos outros devs
- Comando funciona da branch principal para a secundária
- Usado pelos Devs para enviar as alterações e pegar o código-fonte mais atual da ***main***

### Criando um Stash

- Podemos salvar as alterações atuais para **prosseguir com uma abordagem de solução nova**, e não perder o código
- Para isso é usado o comando ***git stash***
- Após o comando o branch será resetado para sua versão de acordo com o repositório

### Recuperando um stash

- Podemos verificar as stashs criadas pelo comando ***git stash list***
- E recuperar a stash pelo comando ***git stash apply 'nome'***
- Deste modo é possível continuar de onde paramos com os arquivos de determinada stash

### Removendo a Stash

- Para limpar totalmente as stashs de um branch podemos utilizar o ***git stash clear***
- Caso seja necessário deletar uma stash específica podemos utilizar ***git stash drop 'nome'***

### Utilizando Tags

- Podemos criar tags nos branches por meio do comando ***git tag -a 'nome' -m 'mensagem'***
- A tag é diferente do stash, serve como um **checkpoint** de um branch
- é utilizada para demarcar estágios do desenvolvimento de algum recurso

### Verificando e alterando Tags

- Podemos verificar uma tag usando o comando ***git show 'nome'***
- Podemos trocar de tags com o comando ***git checkout 'nome'***
- Desta maneira podemos retroceder ou avançar em checkpoints de um branch