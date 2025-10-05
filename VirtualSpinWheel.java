import java.util.Random;
import java.util.Scanner;

public class VirtualSpinWheel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Predefined rewards
        String[] rewards = {
                "☕ Free Coffee",
                "🎁 Amazon Gift Card",
                "⭐ Extra Credit",
                "📚 Free E-Book",
                "🍔 Free Burger",
                "❌ Try Again",
                "🎟️ Movie Ticket",
                "🎧 Music Subscription"
        };

        System.out.println("🎡 Welcome to the Virtual Spin Wheel Game!");
        System.out.println("Spin the wheel and try your luck to win exciting rewards!");
        System.out.println("------------------------------------------------------------");

        boolean playAgain = true;

        while (playAgain) {
            // Show available rewards
            System.out.println("\nAvailable Rewards:");
            for (String reward : rewards) {
                System.out.println("- " + reward);
            }

            System.out.println("\nPress Enter to Spin the Wheel...");
            scanner.nextLine();

            // Spin animation effect (optional)
            System.out.print("Spinning");
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(500);
                    System.out.print(".");
                }
            } catch (InterruptedException e) {
                System.out.println("Spin interrupted.");
            }

            // Select a random reward
            int index = random.nextInt(rewards.length);
            String selectedReward = rewards[index];

            System.out.println("\n\n🎉 Congratulations! You got: " + selectedReward);

            // Ask if user wants to spin again
            System.out.print("\nDo you want to spin again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
            }
        }

        System.out.println("\n🙏 Thank you for playing the Virtual Spin Wheel Game!");
        scanner.close();
    }
}

