import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        System.out.println("Sum GamePlay...");
       Scanner in = new Scanner(System.in) ;

       System.out.println("Value for First Number: ");
       int firstNumber = in.nextInt();
        System.out.println("Value for Second Number: ");
       int secondNumber = in.nextInt();

       System.out.println("The sum of Num1 and Num2 is " + (firstNumber + secondNumber));
    }
}
