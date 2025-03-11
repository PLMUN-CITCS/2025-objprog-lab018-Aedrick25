import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getIntegerInput();
        checkEvenOrOdd(number);
    }
    public static int getIntegerInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
    public static void checkEvenOrOdd(int number){
        System.out.print(number);
        if (number % 2 == 0){
            System.out.print(" is an Even number.");
        }
        else if(number % 2 == 1){
            System.out.print(" is an Odd number.");
        }
    }
}