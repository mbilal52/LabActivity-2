

import java.util.Scanner; // Import the Scanner class

class Activity2 {
  public static void main(String[] args) {
    int i;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type a number:");
    i = myObj.nextInt();
    while (i >= 0) {
        System.out.println(i);
        i--;
  }
  }
}