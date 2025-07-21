
import java.util.Scanner;
public class isPrime {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input from user 
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        //Make a startiing variable 
        int i = 5;
        //Used flag for reminder cheaking 
        boolean flag = true;
        //If num is divisible by 2 then its Even,
        //and divisible by 3 removes multiply iteration
        if(num%2 == 0 || num%3 == 0){
            System.out.println("Not Prime");
        }
        else{
            while(i<(num/2)){
                if(num%i == 0 ){
                    flag = false;
                }
                System.out.println(i);
                i = i + 6;
                
            }
            //cheak flag 
            if(flag){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        sc.close();

    }
}
