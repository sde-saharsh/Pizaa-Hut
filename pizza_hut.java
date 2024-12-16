import java.util.Scanner;

public class PIZZA {

    private int price;
    private boolean isVeg;
    private int vegPizzaPrice = 300;
    private int nonVegPizzaPrice = 400;

    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to PIZZA");
            System.out.println("Please enter your choice:");
            System.out.println("1. Veg Pizza");
            System.out.println("2. Non-Veg Pizza");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                vegPizza();
            } else if (choice == 2) {
                non_vegPizza();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void vegPizza() {
        this.isVeg = true;
        this.price = vegPizzaPrice;
        System.out.println("Veg Pizza selected. Price: " + price);
        additionalOptions();
    }

    private void non_vegPizza() {
        this.isVeg = false;
        this.price = nonVegPizzaPrice;
        System.out.println("Non-Veg Pizza selected. Price: " + price);
        additionalOptions();
    }

    private void additionalOptions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to add extra cheese? (1 for Yes / 2 for No)");
        int cheeseChoice = sc.nextInt();
        if (cheeseChoice == 1) {
            extraCheese();
        }

        System.out.println("Would you like to add extra toppings? (1 for Yes / 2 for No)");
        int toppingsChoice = sc.nextInt();
        if (toppingsChoice == 1) {
            extraToppings();
        }

        System.out.println("Would you like to take away your order? (1 for Yes / 2 for No)");
        int takeawayChoice = sc.nextInt();
        if (takeawayChoice == 1) {
            getAway();
        }

        System.out.println("Your total price is: " + price);
        System.out.println("thanks for buying pizzaaaaaaaa ");
    }

    private void extraCheese() {
        System.out.println("Adding extra cheese. Additional cost: 50");
        price += 50;
    }

    private void extraToppings() {
        System.out.println("Adding extra toppings. Additional cost: 70");
        price += 70;
    }

    private void getAway() {
        System.out.println("Takeaway selected. Additional cost: 20");
        price += 20;
    }

    public static void main(String[] args) {
        PIZZA pizza = new PIZZA();
        pizza.menu();
    }
}
