import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        /* create a user calculator program for + , - , * , / , % */

        Scanner input = new Scanner (System.in);


        /* step 0: What operation user is trying to do over here ( + , - , * , / , % ) , how many times*/

        int finalAns = 0;
        char usersEnterOperation = input.next().charAt(0);
        while (usersEnterOperation != 'x'){
            System.out.print("Enter your first Number : ");
            int a = input.nextInt();
            System.out.print("Enter your second Number : ");
            int b = input.nextInt();

            if(usersEnterOperation == '+'){
                /* do the addition over here  */
               finalAns = a + b;
               break;

            }else if(usersEnterOperation == '-'){
                finalAns = a - b;
                break;
            }else if( usersEnterOperation == '*'){
                finalAns = a * b;
                break;
            }else if (usersEnterOperation == '/'){
                finalAns = a /b;
                break;
            }else if(usersEnterOperation == '%'){
                finalAns = a % b;
                break;
            }
            else{
                System.out.println("Enter some valid operation");
                break;
            }
        }
        System.out.println("Ans of your " + usersEnterOperation + " operation is " + finalAns);
        /* step 1 : Take user's input for what mathematical operation you gonna do */

    }
}
