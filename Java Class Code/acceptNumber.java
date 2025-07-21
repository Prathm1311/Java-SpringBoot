import java.util.Scanner;
public class acceptNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Added to original:      "+(num1 +num2));
        System.out.println("Subtracted to original: "+(num1- num2));
        System.out.println("Multiplyed to original: "+(num1* num2));
        System.out.println("Divided by to original: "+(num1/ num2));

        sc.close();

    }
}
