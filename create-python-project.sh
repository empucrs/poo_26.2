#!/bin/bash

# Usage: ./create-python-project.sh my_project

set -e

PROJECT_NAME=$1

if [ -z "$PROJECT_NAME" ]; then
    echo "Uso: $0 <nome-projeto>"
    exit 1
fi

echo "Criando projeto Python '$PROJECT_NAME'..."

# Create diretório principal
mkdir -p "$PROJECT_NAME"
cd "$PROJECT_NAME"

# Inicializa pyproject.toml usando uv
uv init --name "$PROJECT_NAME"
uv venv
echo "Virtual environment criado em .venv/"

# Cria main.py
echo -e 'def main():\n    print("Olá do projeto '$PROJECT_NAME'!")\n\nif __name__ == "__main__":\n    main()\n' > main.py

# Opcionalmente cria README e .gitignore
echo "# $PROJECT_NAME" > README.md
echo -e "venv/\n__pycache__/\n*.pyc\n.env\n.venv\n" > .gitignore

echo "Project '$PROJECT_NAME' inicializado com sucesso."

