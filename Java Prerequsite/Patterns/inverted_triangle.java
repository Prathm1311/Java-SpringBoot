public class inverted_triangle {
    /*
            *****
            ****
            ***
            **
            *
     */
    public static void main(String[] args) {
        for (int row = 0; row <= 4; row++) {
            for (int col = row; col <= 4; col++) {
            System.out.print("*");   
            }
            System.out.println();
        }
    }
}
