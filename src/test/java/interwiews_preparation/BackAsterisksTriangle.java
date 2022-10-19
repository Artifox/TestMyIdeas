package interwiews_preparation;

import org.testng.annotations.Test;

public class BackAsterisksTriangle {
    public static void main(String[] args) {
//x for rows, y for columns, and row denotes the number of rows to print
        int x, y, row = 5;
//outer loop for number of rows
        for (x = 0; x < row; x++) {
//inner loop for columns
            for (y = 2 * (row - x); y >= 0; y--) {
//To prints spaces
                System.out.print(" ");
            }
//Inner loop for columns
            for (y = 0; y <= x; y++) {
//To prints stars
                System.out.print("* ");
            }
//Cursor goes to the new line after printing each line
            System.out.println();
        }
    }

    @Test
    public void forwardAsterisks() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Test
    public void backwardAsterisks() {
       int rows = 5;
       for (int i = rows; i >=1; i--){
           for (int j = 1; j <= i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}

