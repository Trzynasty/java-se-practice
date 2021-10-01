package Streams_practice;

import java.util.*;
import java.util.stream.Collectors;

class FilmProcessing {
    public static void main(String[] args) {
        Film film1 = new Film("Dune",155,8.4,"Sci-Fi",List.of("Action","Adventure","Drama","Sci-Fi"));
        Film film2 = new Film("Shang-Chi and the Legend of the Ten Rings",132,7.9,"Fantasy",List.of("Action","Adventure","Fantasy","Sci-Fi"));
        Film film3 = new Film("Free Guy",115,7.4,"Action",List.of("Action","Adventure","Comedy","Sci-Fi"));
        Film film4 = new Film("Cry Macho",104,5.8,"Western",List.of("Western","Drama","Thriller"));
        Film film5 = new Film("Malignant",113,6.3,"Horror",List.of("Horror","Crime","Mystery","Thriller"));
        Film film6 = new Film("The Many Saints of Newark",120,7.3,"Crime",List.of("Crime","Drama"));
        Film film7 = new Film("Old",108,5.8,"Thriller",List.of("Thriller","Drama","Horror","Mystery"));
        Film film8 = new Film("Candyman",91,6.0,"Horror",List.of("Horror","Thriller"));
        Film film9 = new Film("Kate",106,6.3,"Action",List.of("Action","Adventure","Crime"));
        Film film10 = new Film("No Time to Die",163,7.9,"Action",List.of("Action","Adventure","Thriller"));
        Film film11 = new Film("Venom: Let There Be Carnage",90,7.0,"Action",List.of("Action","Adventure","Sci-Fi"));
        Film film12 = new Film("Intrusion",92,5.1,"Drama",List.of("Drama","Thriller"));
        Film film13 = new Film("Dune (1984)",137,6.4,"Sci-Fi",List.of("Sci-Fi","Action","Adventure"));
        Film film14 = new Film("Dear Evan Hansen",137,6.1,"Musical",List.of("Musical","Drama"));
        Film film15 = new Film("The Suicide Squad",132,7.3,"Action",List.of("Action","Adventure","Comedy"));

        List<Film> list = new ArrayList<>(Arrays.asList(film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13, film14, film15));
    }
}
