package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fag.objetos.Funcionarios;
import fag.objetos.Construcao;

public class Principal {
    static List<Funcionarios> listFunc = new ArrayList<>();
    static List<Construcao> listCons = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
    popularLista();
    abrirMenu();
}
    public static void popularLista() {
        Funcionarios funcUm = new Funcionarios("Tiago", "Pedreiro", 3500);
        Funcionarios funcDois = new Funcionarios("Pedro", "Servente", 2600);
        Funcionarios funcTres = new Funcionarios("Marcos", "Engenheiro", 3006);
        Construcao consUm = new Construcao("Prédio comercial", "Av. Brasil, 700", "05/10/2025" );
        Construcao consDois = new Construcao("Faculdade", "Av. das Torres, 500", "12/06/1889");
        Construcao consTres = new Construcao("Gagarem", "R. Altemar Dutra Leste, 815", "08/12/2023");
        listFunc.add(funcUm);
        listFunc.add(funcDois);
        listFunc.add(funcTres);
        listCons.add(consUm);
        listCons.add(consDois);
        listCons.add(consTres);
    }
    public static void abrirMenu() {
    int escolha = 0;
        System.out.println("------------------- Bem Vindo -------------------");
        do {
            System.out.println("\n------------------- Menu -------------------");
            System.out.println("1 - Consultar funcionários!");
            System.out.println("2 - Cadastrar funcionários!");
            System.out.println("3 - Remover funcionários!");
            System.out.println("4 - Consultar construções!");
            System.out.println("5 - Cadastrar construções!");
            System.out.println("6 - Remover construções!");
            System.out.println("0 - Sair!");
            escolha = scan.nextInt();
            scan.nextLine();
            validarEscolha(escolha);
        } while (escolha != 0);
    }
    public static void validarEscolha(int escolha) {
    switch (escolha) {
        case 1:
            consultarFunc();
            break;
        case 2:
            cadastrarFunc();
            break;
        case 3:
            removerFunc();
            break;
        case 4:
            consultarCons();
            break;
        case 5:
            cadastrarCons();
            break;
        case 6:
            removerCons();
            break;
        case 0:
            System.out.println("Muito obrigado por utilizar o sistema!");
            break;
        default:
            System.out.println("Digite uma opção válida");
    }
    }
    private static void consultarFunc() {
            System.out.println("\n");
            for (Funcionarios funcionarios : listFunc) {
                System.out.printf("%d - ", listFunc.indexOf(funcionarios) + 1);
                funcionarios.mostrarFuncionario();
    }
}