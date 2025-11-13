public class BreakAndContinue {
    public static void main(String[] args){
    /* how to use break statement  and what it does */
        for(int i = 0; i < 10; i++){
            if (i == 4){
                break; /* whenever break statement hitting , it is telling that stop this execution , no need to further go */
            }
            System.out.println(i);
        }

        /* continue statement , when to use : when you don't want to execute a specific program for specific case , but you do want to execute for others , in that case you can use "continue" */

        for(int i = 0; i < 10 ; i++){
            if ( i == 3){
                continue;
            }
            /* otherwise  do this */
            System.out.println(i + " is printed.");
        }
    }
}
