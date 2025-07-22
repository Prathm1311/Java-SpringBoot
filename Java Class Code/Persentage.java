
import java.util.Scanner;

public class Persentage {
    float marks1, marks2, marks3;
    void persentage(){
        float persent = (marks1+marks2+marks3)/3;
        System.out.println();
    }
  public static void main(String[] args) {
        //Scanner for taking Inupts
        Scanner sc = new Scanner(System.in);
        //to use methods and variables of Persentage class Object Creation 
        Persentage stud = new Persentage();
        //first Subject Marks
        System.out.println("Enter Marks of first Subject: ");
        stud.marks1 = sc.nextFloat();
        //second Subject Marks
        System.out.println("Enter Marks of second Subject: ");
        stud.marks2 = sc.nextFloat();
        //third Subject Marks
        System.out.println("Enter Marks of third Subject: ");
        stud.marks3 = sc.nextFloat();
        //call persentage method
        stud.persentage();
        //close the Scanner class
        sc.close();

  }

}
