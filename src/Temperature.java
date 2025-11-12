import java.util.Scanner;
public class Temperature {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your degree in celcius : ");
        float userInputCelciusDegree = input.nextFloat();

        float outputInFahrenheit = ( userInputCelciusDegree * 1.8f )  + 32;

        System.out.println("Your entered degree in Fahrenheit is : " + outputInFahrenheit);
    }
}
