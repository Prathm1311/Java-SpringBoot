import java.util.Scanner;
public class sumOfThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taken Input from User
        System.out.println("Enter a three Digit number: ");
        int num = sc.nextInt();
        //Make a initial variable to store sum of digits
        int sum = 0;
        //Logic
        if(num>99 && num<1000){
            while(num>0){
                int temp = num%10;
                sum = temp + sum;
                num = num/10;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
