import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {
    /*D
    Dadas as seguintes informações crie um conjunto de séries favoridas e ordene
    exibindo nome - genero - tempo episodio
    * */

        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that's '70s show", "comedia", 25));
        }};

        System.out.println("--\t Ordem aleatória\t--");
        for (Serie Serie : minhasSeries) {
            System.out.println((Serie.getNome()) + " - " + Serie.getGenero() + " - " + Serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem de inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that's '70s show", "comedia", 25));
        }};
        for (Serie Serie : minhasSeries1) {
            System.out.println((Serie.getNome()) + " - " + Serie.getGenero() + " - " + Serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("--\t Ordem natural(tempo episódio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie Serie : minhasSeries2) {
            System.out.println((Serie.getNome()) + " - " + Serie.getGenero() + " - " + Serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("--\t Ordem Nome/Genero/Tempo)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie Serie : minhasSeries3) {
            System.out.println((Serie.getNome()) + " - " + Serie.getGenero() + " - " + Serie.getTempoEpisodio());
        }

    }
}
