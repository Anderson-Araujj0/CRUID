# CRUD com MySQL em Java

Este é um projeto simples em Java para realizar operações CRUD (Create, Read, Update, Delete) em um banco de dados MySQL.

## Funcionalidades
- Adicionar usuários
- Listar usuários
- Atualizar usuários
- Remover usuários

## Pré-requisitos
1. MySQL instalado.
2. Banco de dados configurado:
   ```sql
   CREATE DATABASE Cruid;
   USE Cruid;
   CREATE TABLE users (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255) NOT NULL,
       email VARCHAR(255) NOT NULL
   );
