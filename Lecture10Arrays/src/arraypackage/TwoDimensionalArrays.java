package arraypackage;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[3][4];

        for (int i = 0; i < my2DsArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                my2DArray[i][j] = i + j + (i*j);
            }
            displayArray(my2DArray);
        }
    }// end main
    public static void displayArray (int[][] grid) {
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                System.out.println(i+ "," + j +": " + grid[i][j]);
            }
        }
    }

} // end class
