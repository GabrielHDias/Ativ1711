//objeto construcao/nome da obra, endereço e data de inicio
package fag.objetos;

import fag.Principal;
import fag.objetos.Funcionarios;

public class Construcao {
    private String nome;
    private String endereco;
    private String dataInicio;

    public Construcao (){
    }

    public Construcao(String nome, String endereco, String dataInicio) {
        setNome(nome);
        setEndereco(endereco);
        setDataInicio(dataInicio);
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }else {
            System.out.println("Digite um nome válido");
            setNome(Principal.scan.nextLine());
        }
    }
    public String getNome() {
        return nome;
    }
    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.isBlank()) {
            this.endereco = endereco;
        }else {
            System.out.println("Digite um endereço válido");
            setEndereco(Principal.scan.nextLine());
        }
    }
    public String getEndereco(){
        return endereco;
    }
    public void setDataInicio(String dataInicio) {
        if (dataInicio != null && !dataInicio.isBlank()) {
            this.dataInicio = dataInicio;
        }else {
            System.out.println("Digite uma data válida");
            setDataInicio(Principal.scan.nextLine());
        }
    }
    public String getDataInicio(){
        return dataInicio;
    }
    public void mostrarConstrucao(){
        System.out.printf("Nome: %s, Endereço: %s, Data de inicio: %s\n", nome, endereco, dataInicio);
    }
}