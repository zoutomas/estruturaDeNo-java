package Fila;

public class Main {
    public static void main(String[] args){

        Fila<String> minhaFila = new Fila();


       minhaFila.enqueue("primeiro");
       minhaFila.enqueue("segundo");
       minhaFila.enqueue("terceiro");
       minhaFila.enqueue("quarto");

        System.out.print(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.print(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.print(minhaFila);

        System.out.println(minhaFila.first());

        System.out.print(minhaFila);
    }
}
