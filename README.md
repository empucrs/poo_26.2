# Desenvolvimento Java 25 / Python / C++
- Repositório base para uso em disciplinas de desenvolvimento de software
- Configurado para desenvolvimento em Java25, Python 3.13 e GCC/G++
- Pensado para ser usado como "Monorepo" para uma série de projetos de aula
- As instruções a seguir referem-se ao uso deste repositório em conjunto com o CodeSpaces

## Criação de Projetos Java
O script **create-java-project.sh** cria um projeto Maven/Java básico para ser usado em disciplinas de algoritmos e programação
- Para criar um projeto usando o script use o comando: `./create-java-project.sh br.pucrs meu-projeto`
- Para compilar e executar o projeto use as opções do VSCode, ou o terminal
  * Pelo terminal, compile e execute o projeto com:
    - ``mvn compile``
    - ``mvn exec:java -Dexec.mainClass="br.pucrs.App"``

## Criação de Projetos Python
O script **create-python-project.sh** cria um projeto Python3 para ser usado em disciplinas de algoritmos e programação
- Para criar um projeto usando o script use o comando: `./create-python-project.sh meu-projeto`
- O projeto é criado utilizando o [uv](https://docs.astral.sh/uv/), uma ferramenta moderna para gerenciamento de pacotes e projetos Python (substitui com vantagens o ``pip``)
- Para compilar e executar o projeto use as opções do VSCode, ou o terminal
  * Pelo terminal, execute o projeto com ``uv run main.py`` - esse comando instala a versão mais nova de Python, se necessário, e executa o seu programa com ela

## Criação de Projetos C++
O script **create-cpp-project.sh** cria um projeto C++ para ser usado em disciplinas de algoritmos e programação
- Para criar um projeto usando o script use o comando: `./create-cpp-project.sh meu-projeto`
- O projeto é criado utilizando o [CMake](https://cmake.org/), uma ferramenta moderna e eficiente para gerenciamento de projetos com vários módulos e dependências (alternativa ao ``Makefile`` criado manualmente)
- Antes de tentar compilar um projeto criado com esse script, execute os seguintes comandos no terminal:
   * ``sudo apt-get update``
   * ``sudo apt-get install cmake``
- Para compilar e executar o projeto use as opções do VSCode, ou o terminal
