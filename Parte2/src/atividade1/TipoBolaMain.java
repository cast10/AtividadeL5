package Parte2.src.atividade1;

import Parte1.src.atividade1.Bola;

import java.util.Scanner;

public class TipoBolaMain {

    public static void main(String[] args) {
        String trocar = null;
        TipoBola b1 = new TipoBola();
        String cor = b1.cor;

        b1.mostraCor(cor);

        Scanner input = new Scanner(System.in);
        System.out.println("Deseja trocar de cor? S/N");
        trocar=input.next();
        if(trocar.equals("S") ){
            b1.trocaCor();
        }else{
            System.out.println("Agradecemos a escolha");
        }



    }

    }


