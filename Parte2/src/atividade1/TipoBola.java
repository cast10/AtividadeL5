package Parte2.src.atividade1;

import java.util.Scanner;

public class TipoBola {

    String nome = "Janbulani";
    String cor;
    String material;
    double circuferencia;

    public TipoBola(){
        this.nome = "janbulani";
        this.cor = cor;
        this.material = material;
        this.circuferencia = circuferencia;
    }
    public String mostraCor( String cor){
        System.out.println(cor);
        return cor;
    }
    public void trocaCor(){
        System.out.println(cor);
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque a cor");
        cor=input.next();
        System.out.println("A cor da sua bola agora é " + cor);
    }
}
