package javaapplication4;

import static java.lang.System.exit;
import java.util.Scanner;

public class Aluno {

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(String aprovacao) {
        this.aprovacao = aprovacao;
    }
    
    Scanner ler = new Scanner(System.in);

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }
    
   private String ra;
   private String nome;
   private float ac1;
   private float ac2;
   private float ag;
   private float af;
   private float media;
   private String aprovacao;
   
   public void menu(int a){
       
       switch(a){
           case 1:
               criarAluno();
               break;
           case 2:
               calcularMedia();
               aprovacao();
               imprimir();
               break;
           case 3:
               exit(0);
               break;
       }
   }
   
   public void criarAluno(){
       System.out.println("RA? ");
       ra = ler.next();
       System.out.println("Nome? ");
       nome = ler.next();
       System.out.println("Ac1? ");
       ac1 = ler.nextFloat();
       System.out.println("Ac2? ");
       ac2 = ler.nextFloat();
       System.out.println("Ag? ");
       ag = ler.nextFloat();
       System.out.println("Af? ");
       af = ler.nextFloat();
   }
   
   public void calcularMedia(){
        
        setMedia((float) ((ac1 * 0.15) + (ac2 *0.30) + (ag * 0.10) + (af * 0.45)));
        
   }
   
   public void aprovacao(){
       if(getMedia() >=5){
           System.out.println("Aprovado!");
            setAprovacao("Aprovado");
           
       }else{
           System.out.println("Reprovado");
            setAprovacao("Reprovado");
       }
   }
   
   public void imprimir(){
       System.out.println("======================");
       System.out.println(""
       + "\nRA: " + ra
       + "\nNome: " + nome
       + "\nAC1: " + ac1
       + "\nAC2: " + ac2
       + "\nAG: " + ag
       + "\nAF: " + af
       + "\nMédia: " + media
       + "\nSituação: " +aprovacao
       );
       System.out.println("======================");
   }
}
