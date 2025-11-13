import java.util.Scanner;
public class BreakAndContinueProgram {
    public static void main(String[] args){
        /* creating a waiter asking for order , if it is "biriyani" , then it is skipping that order */

        Scanner input = new Scanner(System.in);
        String userOrderShouldNotBe = "biriyani";

        /* waiter will ask only 3 times , what's your order sir/mam */

        for( int i = 1 ; i < 3 ; i++) {
            System.out.print("What is your order ? ");
            String userOrder = input.next();
                System.out.println("Waiter is asking for the " + i + " time");
            /* if user has ordered "biriyani" , then it won't execute */
                if (!userOrder.equals(userOrderShouldNotBe)) {
                    System.out.println("User has ordered " + userOrder);
                    break;
                }else{
                    System.out.println("Sorry user we don't serve "+ userOrderShouldNotBe);
                    continue;
                }
            }


    }
}
