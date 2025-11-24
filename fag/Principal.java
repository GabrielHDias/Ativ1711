package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fag.objetos.Funcionarios;
import fag.objetos.Construcao

public class Principal {
    static List<Funcionario> listFunc = new ArrayList<>();
    static List<Construcao> listCons = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    popularLista();
    abrirMenu();
}
    public static void popularLista() {
        Funcionario funcUm = new Funcionario("Tiago", "Pedreiro", 3500);
        Funcionario funcDois = new Funcionario("Pedro", "Servente", 2600);
        Funcionario funcTres = new Funcionario("Marcos", "Engenheiro", 3006);
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

}