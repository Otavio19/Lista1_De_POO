package javaapplication4;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;

public class Pessoa {
    
    Scanner ler= new Scanner(System.in);

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   private String cpf;
   private String nome;
   private String sexo;
   private int idade;
   
   
   
   public void menu(int a){
       
       switch(a){
           case 1:
               criarPessoa();
               break;
           case 2:
               mostrarPessoa();
               break;
           case 3:
               sair();
               break;
       }
   }
   public void criarPessoa(){
       System.out.println("Nome? ");
               nome = ler.next();
               
               System.out.println("CPF? ");
               cpf = ler.next();
               
               System.out.println("Sexo? ");
               sexo = ler.next();
               
               System.out.println("Idade? ");
               idade = ler.nextInt();
   }
   
   public void mostrarPessoa(){
       if(nome != null){
           System.out.println("======================");
            System.out.println("\nNome: " + nome);
            System.out.println("\nCpf: " + cpf);
            System.out.println("\nSexo: " + sexo);
            System.out.println("\nIdade: " + idade);
            System.out.println("======================");

       }else{
       System.out.println("\nNão tem pessoa cadastrada");
   }
       
   }
  
  public void sair(){
      exit(0);
  }
   
}
