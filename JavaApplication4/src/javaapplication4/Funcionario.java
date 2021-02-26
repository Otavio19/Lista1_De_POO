package javaapplication4;

import static java.lang.System.exit;
import java.util.Scanner;

public class Funcionario {
    
    Scanner ler = new Scanner(System.in);


    public float getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(float valorReceber) {
        this.valorReceber = valorReceber;
    }
    
    public int getCracha() {
        return cracha;
    }
    
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    private int cracha;
    private String nome;
    private String tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;
    private float valorReceber;
    
    public void menu(int a){
    
        switch(a){
           case 1:
               criarFuncionario();
               break;
           case 2:
               calcularValorSalario();
               imprimir();
               break;
           case 3:
               exit(0);
               break;
       }
        
}
    
    public void criarFuncionario(){
        System.out.println("Cracha? ");
       cracha = ler.nextInt();
       System.out.println("Nome? ");
       nome = ler.next();
       System.out.println("Tipo de Vinculo? ");
       tipoVinculo = ler.next();
       System.out.println("Valor a Hora? ");
       valorHora = ler.nextFloat();
       System.out.println("Quantidade de Hora? ");
       qtdeHora = ler.nextFloat();
       System.out.println("Salario? ");
       salario = ler.nextFloat();
       System.out.println("Valor de desconto? ");
       valorDesconto = ler.nextFloat(); 
    }
    
    public void calcularValorSalario(){
        if("H".equals(tipoVinculo)){
            valorReceber = (valorHora * qtdeHora) - valorDesconto ;
        }else{
            valorReceber = salario - valorDesconto;
        }
    } 
    
    
    public void imprimir(){
        System.out.println("======================");
        System.out.println("Crachá" + cracha
                + "\nNome" + nome
                + "\nTipo Vínculo:" + tipoVinculo
                + "\nSalário:" + salario 
                + "\nDesconto: " + valorDesconto
                + "\nValor a receber: " + valorReceber);
        System.out.println("======================");       
                }
                
     
}
