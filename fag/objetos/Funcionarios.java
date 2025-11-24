package fag.objetos;

import fag.Principal
import fag.objetos.Construcao

public class Funcionarios {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(nome, cargo, salario) {
        setNome(nome);
        setCargo(cargo);
        setSalario(salario)
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }else {
            System.out.println("Digite um nome válido")
            setNome(Principal.scan.nextLine());
        }
    }
    public void getNome(){
        return nome;
    }
    public void setCargo(String cargo) {
        if (cargo != null && !cargo.isBlank()) {
            this.cargo = cargo;
        }else {
            System.out.println("Digite um cargo válido")
            setCargo(Principal.scan.nextLine());
        }
    }
    public void getCargo(){
        return cargo;
    }
    public void setSalario(double salario) {
        if (salario > 1999) {
            this.salario = salario;
        }else {
            System.out.println("O sálario mínimo nessa empresa é 2000")
            System.out.println("Digite um salário válido")
            setSalario (Principal.scan.nextLine());
        }
    }
    public void getSalario(){
        return salario;
    }
    public void mostrarFuncionario(){
        System.out.printf("Nome: %s, Cargo: %s, Salário: %d\n", nome, cargo, salario);
    }
}