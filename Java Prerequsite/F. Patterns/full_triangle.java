public class full_triangle {
    /*
                  * 
                 * *
                * * *
               * * * *
              * * * * *
             * * * * * * 
     */
    public static void main(String[] args) {
        for (int row = 0; row <= 5; row++) {
            for (int col = row; col <= 5; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
