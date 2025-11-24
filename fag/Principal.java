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

        Construcao consUm = new Construcao("Prédio comercial", "Av. Brasil, 700", "05/10/2025");
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
            System.out.println("3 - Editar funcionários!");
            System.out.println("4 - Remover funcionários!");
            System.out.println("5 - Consultar construções!");
            System.out.println("6 - Cadastrar construções!");
            System.out.println("7 - Editar construção!");
            System.out.println("8 - Remover construções!");
            System.out.println("9 - Relações funcionário x construção!");
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
                editarFunc();
                break;
            case 4:
                removerFunc();
                break;
            case 5:
                consultarCons();
                break;
            case 6:
                cadastrarCons();
                break;
            /*case 7:
                editarCons();
                break;*/
            case 8:
                removerCons();
                break;
            /*case 9:
                relacoes();
                break;*/
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
            if (listFunc.size()==0){
                System.out.println("Não há funcionarios");
            }

    }
    private static void cadastrarFunc() {
        Funcionarios funcionarios = new Funcionarios();
        System.out.println("Informe o nome do funcionário: ");
        funcionarios.setNome(scan.nextLine());
        System.out.println("Informe o cargo: ");
        funcionarios.setCargo(scan.nextLine());
        System.out.println("Informe o salário: ");
        funcionarios.setSalario(scan.nextDouble());
        scan.nextLine();
        listFunc.add(funcionarios);
        System.out.println("Funcionário adicionado com sucesso!");
    }
    private static void editarFunc() {
        consultarFunc();
        System.out.println("Escolha o funcionário que deseja editar ");
        System.out.println("Digite 0 para cancelar: ");
        int escolha = scan.nextInt();
        scan.nextLine();
        if (escolha == 0) {
            return;
        }
        if (listFunc.size() >= escolha && escolha > 0) {
            mostrarMenuEdicaoFunc();
            int escolhaEdicao = scan.nextInt();
            scan.nextLine();
            if (escolhaEdicao > listFunc.size() || escolhaEdicao < 0) {
                System.out.println("Escolha uma opção válida: ");
                editarFunc();
            } else {
                alterarDadosFunc(escolhaEdicao, escolha);
            }

        }
    }
    private static void mostrarMenuEdicaoFunc() {
        System.out.println("Selecione uma opção para editar: ");
        System.out.println("1 - Nome");
        System.out.println("2 - Cargo");
        System.out.println("3 - Salário");
    }
    private static void alterarDadosFunc(int escolha, int escolhaEdicao) {
        if (escolhaEdicao == 1) {
            System.out.println("Informe o nome: ");
            listFunc.get(escolha - 1).setNome(scan.nextLine());
        } else if (escolhaEdicao == 2) {
            System.out.println("Informe o novo cargo: ");
            listFunc.get(escolha - 1).setCargo(scan.nextLine());
        } else if (escolhaEdicao == 3) {
            System.out.println("Informe o novo salário: ");
            double salario = scan.nextDouble();
            scan.nextLine();
            listFunc.get(escolha - 1).setSalario(salario);
        }
        System.out.println("Funcionário alterado com sucesso! ");
    }
    private static void removerFunc() {
        consultarFunc();
        System.out.println("Escolha o funcionário que deseja remover ");
        System.out.println("Digite 0 para cancelar: ");
        int escolha = scan.nextInt();
        scan.nextLine();
        if (escolha == 0) {
            return;
        }
        if (listFunc.size() >= escolha && escolha > 0) {
            listFunc.remove(escolha - 1);
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Escolha uma opção válida!");
            removerFunc();
        }
    }
    private static void consultarCons() {
        System.out.println("\n");
        for (Construcao construcao : listCons) {
            System.out.printf("%d - ", listCons.indexOf(construcao) + 1);
            construcao.mostrarConstrucao();
        }
        if (listFunc.size()==0){
            System.out.println("Não há construções");
        }
    }
    private static void cadastrarCons() {
        Construcao construcao = new Construcao();
        System.out.println("Informe o nome da construção: ");
        construcao.setNome(scan.nextLine());
        System.out.println("Informe o endereço: ");
        construcao.setEndereco(scan.nextLine());
        System.out.println("Informe a data de inicio: ");
        construcao.setDataInicio(scan.nextLine());
        listCons.add(construcao);
        System.out.println("Funcionário adicionado com sucesso!");
    }
    private static void removerCons() {
        consultarCons();
        System.out.println("Escolha a construção que deseja remover ");
        System.out.println("Digite 0 para cancelar: ");
        int escolha = scan.nextInt();
        scan.nextLine();
        if (escolha == 0) {
            return;
        }
        if (listCons.size() >= escolha && escolha > 0) {
            listCons.remove(escolha - 1);
            System.out.println("Construção removida com sucesso!");
        } else {
            System.out.println("Escolha uma opção válida!");
            removerCons();
        }
    }
}