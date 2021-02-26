package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Qual Exercicio? \n1. \n2. \n3.");
        int exercicio = ler.nextInt();
        
        switch(exercicio){
            case 1:
                    for (int i = 0; i < 20; i++) {
                        System.out.println("Menu: ");
                        System.out.println("1– Criar pessoa\n2– Mostrar pessoa\n3- Sair");
                        int a = ler.nextInt();
                        pessoa.menu(a);
            }
                break;
            
            case 2:
                for (int i = 0; i < 20; i++) {
                        System.out.println("Menu: ");
                        System.out.println("1 –Criar Aluno\n2 –Mostrar Aluno\n3- Sair");
                        int a = ler.nextInt();
                        aluno.menu(a);
            }
                break;
                
            case 3:
                for (int i = 0; i < 20; i++) {
                        System.out.println("Menu: ");
                        System.out.println("1– Criar Funcionário\n2 –Mostrar Folha de Pagamento\n3- Sair");
                        int a = ler.nextInt();
                        funcionario.menu(a);
            }
                
        }
        
        }       
    }