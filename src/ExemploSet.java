import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        /* dada uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 0, 3.6} faça:

         */
        System.out.println("Crie um conjunto de notas");
        HashSet notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no conjunto");

        System.out.println(notas.contains(5d));

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das noats");
        System.out.println(soma/ notas.size());

        System.out.println();

        System.out.println("Remova a nota 0");
        System.out.println(notas);
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println();

        System.out.println("Remova todas as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7.0) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas em ordem crescente");
        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto");
        notas2.clear();
        System.out.println(notas2);

    }
}