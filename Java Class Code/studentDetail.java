
import java.util.Scanner;

public class studentDetail {

        //Required Variables
    int    rollNo;
    String name;
    float  marks;

        //Method which take Input form User 
    void acceptDetail(){
        Scanner sc = new Scanner(System.in);
        //Enter Name
        System.out.println("Enter the Name: ");
        name = sc.nextLine();
        //Enter Roll Number
        System.out.println("Enter the Roll number: ");
        rollNo = sc.nextInt();
        //Enter Marks 
        System.out.println("Enter the Marks: ");
        marks = sc.nextFloat();
        sc.close();
    }

        ///Method which Display Detail
    void showDetail(){
        System.out.println("The Name is: "        + name);
        System.out.println("The Roll Number is: " + rollNo);
        System.out.println("The Marks are: "      + marks);
    }

    
    public static void main(String [] args){
        //Create object of Class 
        studentDetail stud1 = new studentDetail();
        //Call method  
        stud1.acceptDetail();
        //Call method 
        stud1.showDetail();

    }
}
