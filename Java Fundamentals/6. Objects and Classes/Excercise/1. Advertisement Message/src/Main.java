/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        MessageManager messageManager = new MessageManager();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            messageManager.printMessage();
        }

    }

    public static class MessageManager {

        private String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        private String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        private String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        private String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        public MessageManager(){};

        public void printMessage(){
            Random rand = new Random();

            int randomPhraseIndex = rand.nextInt(this.phrases.length);
            int randomEventIndex = rand.nextInt(this.events.length);
            int randomAuthorIndex = rand.nextInt(this.authors.length);
            int randomCityIndex = rand.nextInt(this.cities.length);

            System.out.printf("%s %s %s - %s\n", this.phrases[randomPhraseIndex],this.events[randomEventIndex],
                                                this.authors[randomAuthorIndex],this.cities[randomCityIndex]);

        }
    }
}
