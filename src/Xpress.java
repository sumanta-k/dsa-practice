import java.util.Scanner;

public class Xpress {
    public static void main(String[] args) {
        /* take input from user , only cancel when user press 'x' */
        /* take 2 number from user , and then do the sum */
        Scanner input = new Scanner(System.in);

        /* Asks for user input */

        /*
       String userInputCharacter = input.next().charAt(0); // it will take the word , and the word's 1st place
        if(userInputCharacter != "x"){
            /* then do the sum */
   //         System.out.println("I'm inside doing stuff....");


        String userCharacter = input.next();

        char firstCharacter = userCharacter.charAt(0);

        System.out.println(userCharacter.getClass().getName());

        while(firstCharacter == '+'){
            /* then do the sum */
            System.out.print("Enter your first Number : ");
            int a = input.nextInt();


            System.out.print("Enter your second Number : ");
            int b = input.nextInt();

            /* Now the sum part */

            int sum = a + b;

            System.out.println("Sum is "+ sum);

        }


        }




    }

