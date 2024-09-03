import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    String[] coffee = {"Latte", "Regular", "Macchiato", "Cappuccino"};
    double[] prices = {3.99, 1.99, 3.69, 3.25};
    String player = "";
    double money = 0;

    String[] menuOptions = {"Press L: Latte", "Press R: Regular", "Press M: Macchiato", "Press C: Cappuccino", "Press Q: Quit"};

    String menuResponse = "";

    System.out.println("Welcome to my coffee game!");
    while (player.isBlank()) {
      System.out.print("You need an username: ");
      player = scanner.nextLine();
    }

    System.out.println("Welcome! " + player);
    System.out.println("You are to sell coffee until you reach at least $10,000.00. Good Luck");
    System.out.println("            Coffee Menu ");
    for (String coffees: coffee) {
      System.out.print(coffees + " ");
    }

    while (menuResponse.isBlank()) {
      System.out.println("Your choices: ");
      for(String menus: menuOptions){
        System.out.println(menus);
      }
      
      menuResponse = scanner.nextLine();
      switch (menuResponse) {
        case "Q":
          System.out.println("Quitter!");
          break; 
      }

    }
  }
}








