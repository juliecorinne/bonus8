import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInput;

        ArrayList<Movie> movieList = new ArrayList<>();

        listOfMovies(movieList);

        System.out.println("Hello! Welcome to the movie database.");

        do {

            welcomeMessage();

            String categoryPick = scan.nextLine();
            System.out.println();

            ifElseForCategories(movieList, categoryPick);

            System.out.println();

            System.out.println("Would you like to view another category? y/n");
            userInput = scan.nextLine();

        } while (userInput.equalsIgnoreCase("y"));

        System.out.println();
        System.out.println("Thanks!");

    }

    private static void ifElseForCategories(ArrayList<Movie> movieList, String categoryPick) {

        if (categoryPick.equalsIgnoreCase("Animated")) {

            for (int i = 0; i < movieList.size(); i++) {
                if (movieList.get(i).getCategory().contains("Animated")) {
                    System.out.println(movieList.get(i).getTitle());
                }
            }
        } else if (categoryPick.equalsIgnoreCase("Drama")) {

            for (int i = 0; i < movieList.size(); i++) {
                if (movieList.get(i).getCategory().contains("Drama")) {
                    System.out.println(movieList.get(i).getTitle());
                }
            }
        } else if (categoryPick.equalsIgnoreCase("Horror")) {

            for (int i = 0; i < movieList.size(); i++) {
                if (movieList.get(i).getCategory().contains("Horror")) {
                    System.out.println(movieList.get(i).getTitle());
                }
            }
        } else if (categoryPick.equalsIgnoreCase("SciFi")) {

            for (int i = 0; i < movieList.size(); i++) {
                if (movieList.get(i).getCategory().contains("SciFi")) {
                    System.out.println(movieList.get(i).getTitle());
                }
            }
        }
    }

    private static void welcomeMessage() {

        System.out.println("Which category would you like to view?");
        System.out.println();
        System.out.println("Animated");
        System.out.println("Drama");
        System.out.println("Horror");
        System.out.println("SciFi");
        System.out.println();
        System.out.println("Please specify below: ");
    }

    private static void listOfMovies(ArrayList<Movie> movieList) {

        movieList.add(new Movie("Cinderella", "Animated"));
        movieList.add(new Movie("Jaws", "Horror"));
        movieList.add(new Movie("The Departed", "Drama"));
        movieList.add(new Movie("Moonrise Kingdom", "Drama"));
        movieList.add(new Movie("The Shining", "Horror"));
        movieList.add(new Movie("Star Wars IV: A New Hope", "SciFi"));
        movieList.add(new Movie("Toy Story", "Animated"));
        movieList.add(new Movie("Captain America", "SciFi"));
        movieList.add(new Movie("Hercules", "Animated"));
        movieList.add(new Movie("Lilo and Stitch", "Animated"));
        movieList.add(new Movie("The Sixth Sense", "Horror"));
        movieList.add(new Movie("Green Mile", "Drama"));
        movieList.add(new Movie("Tangled", "Animated"));
        movieList.add(new Movie("The Little Mermaid", "Animated"));
        movieList.add(new Movie("The God Father", "Drama"));

    }

//    private static String validation(){
//
//        Scanner scan = new Scanner(System.in);
//        String input = " ";
//
//        while (!input.equalsIgnoreCase("Animated") || !input.equalsIgnoreCase("Drama") || !input.equalsIgnoreCase("Horror") || !input.equalsIgnoreCase("SciFi")){
//            System.out.println("Please enter one of the specified categories!");
//            input = scan.nextLine();
//        }
//
//        return input;
//
//    }

}
