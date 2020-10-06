import java.util.Scanner;
/**
 * takes integer and makes hailstone sequence
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // scanner for input
    Scanner input = new Scanner(System.in);

    // ask for integer
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    int num = input.nextInt();
    // start the sequence
    System.out.println("Hailstone sequence is the following");
    System.out.println(num);
    // calculations for sequence
    while(num > 1){
      if(num % 2 == 0){
        num = num/2;
        System.out.println(num);
      }else if (num % 2 == 1){
        num = num*3 + 1;
        System.out.println(num);
      }
      }
    }
  }

