public class swapTwoNumber {
    public static void main(String[] args) {
        //Numbers decleration
        int num1 = 100;
        int num2 = 20;
        
        //Display number before swaping 
        System.out.println("before swap the num1 is: " + num1 );
        System.out.println("before swap the num2 is: " + num2 );
        
        //Swap logic using third variable (temp)
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //Display number after swaping
        System.out.println("after swap the num1 is: " + num1 );
        System.out.println("after swap the num2 is: " + num2 );
    }
    
}
