// 3. Multi-Service Smart TV
// A Smart TV can stream movies and play games.
// ● Create interfaces StreamingService and GamingService.
// ● Both interfaces should have:
// ○ one abstract method
// ○ one default method showSubscriptionDetails()
// ● Create a class SmartTV implementing both interfaces.
// ● Store movie names and game names in separate arrays.
// Task: Resolve the default method conflict and display all available content.
public class scenarioSmartTv {
    public static void main(String[] args) {
        SmartTV myTV = new SmartTV();
        myTV.streamMovie("Inception");
        myTV.playGame("Fortnite");
        myTV.showSubscriptionDetails();
    }
}

interface StreamingService {
    void streamMovie(String movie);
    default void showSubscriptionDetails() {
        System.out.println("Streaming subscription: Premium plan includes movies and shows.");
    }
}

interface GamingService {
    void playGame(String game);
    default void showSubscriptionDetails() {
        System.out.println("Gaming subscription: Standard plan includes action and adventure titles.");
    }
}

class SmartTV implements StreamingService, GamingService {
    private String[] movies = {"Inception", "The Matrix", "Interstellar"};
    private String[] games = {"Fortnite", "Minecraft", "Among Us"};

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing game: " + game);
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
        System.out.print("Available movies: ");
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i]);
            if (i < movies.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Available games: ");
        for (int i = 0; i < games.length; i++) {
            System.out.print(games[i]);
            if (i < games.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
