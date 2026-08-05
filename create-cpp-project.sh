#!/bin/bash

# Usage: ./create-cpp-project.sh my_cpp_project

set -e

PROJECT_NAME=$1

if [ -z "$PROJECT_NAME" ]; then
    echo "Uso: $0 <nome-projeto>"
    exit 1
fi

echo "Criando projeto C++ '$PROJECT_NAME'..."

# Cria estrutura do projeto
mkdir -p "$PROJECT_NAME"/{src,include,build,tests}
cd "$PROJECT_NAME"

# Cria main.cpp
cat > src/main.cpp <<EOF
#include <iostream>

int main() {
    std::cout << "Olá do projeto $PROJECT_NAME!" << std::endl;
    return 0;
}
EOF

# Cria CMakeLists.txt
cat > CMakeLists.txt <<EOF
cmake_minimum_required(VERSION 3.14)
project($PROJECT_NAME)

set(CMAKE_CXX_STANDARD 17)

# Ajusta source e include
include_directories(include)
add_executable(\${PROJECT_NAME} src/main.cpp)
EOF

# Opcional: Adiciona README e .gitignore
echo "# $PROJECT_NAME" > README.md
echo -e "build/\n*.o\n*.exe\n*.out\n" > .gitignore

echo "Projeto C++ '$PROJECT_NAME' criado com sucesso!"
echo "Para compilar:"
echo "   cd build"
echo "   cmake .."
echo "   make"
echo "   ./\$PROJECT_NAME"
