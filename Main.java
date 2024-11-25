package com.crudapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== CRUD de Usuários com MySQL ===");

        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Atualizar usuário");
            System.out.println("4. Remover usuário");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    userDAO.addUser(new User(name, email));
                    System.out.println("Usuário adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Usuários:");
                    userDAO.listUsers();
                    break;

                case 3:
                    System.out.print("Digite o ID do usuário para atualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String newName = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String newEmail = scanner.nextLine();

                    userDAO.updateUser(new User(updateId, newName, newEmail));
                    System.out.println("Usuário atualizado com sucesso!");
                    break;

                case 4:
                    System.out.print("Digite o ID do usuário para remover: ");
                    int deleteId = scanner.nextInt();

                    userDAO.deleteUser(deleteId);
                    System.out.println("Usuário removido com sucesso!");
                    break;

                case 5:
                    running = false;
                    System.out.println("Encerrando aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
