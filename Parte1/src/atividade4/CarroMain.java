package Parte1.src.atividade4;

public class CarroMain {
    public static void main (String[]args){

        Carro carro1 = new Carro("BMW", "X1", 2,4);
        System.out.println( "Marca   "+ carro1.marca);
        System.out.println( "Modelo  "+ carro1.modelo);
        System.out.println( "Quantidade de porta   "+carro1.portas);
        System.out.println( "Potência   " + carro1.potencia);

    }
}
