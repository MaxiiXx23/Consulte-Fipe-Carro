package br.com.challengepipe.challengepipe.views;

import java.util.Scanner;

public class Menu {

    Scanner inputOpcoes = new Scanner(System.in);
    public void showMenu() {
        int option = 0;
        System.out.println("*** Bem-vindo, ao ConsulteFipe ***");

        System.out.println("Iniciar pesquisa?");
        System.out.println("""
                    *** Opções ***
                    1 - Sim;
                    4 - Fechar aplicação;
                """);

        option = this.inputOpcoes.nextInt();
        System.out.println("*******");

        System.out.println("Deseja fazer a buscar por qual tipo de veículo?");
        System.out.println("""
                    *** Opções ***
                    1 - Carros
                    2 - Motos
                    3 - Caminhões
                    4 - VOLTAR AO MENU ANTERIOR;
                """);
    }

}
