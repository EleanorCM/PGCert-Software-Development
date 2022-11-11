package uk.ac.qub.loops;

public class StarLoops {

    public static void main(String[] args) {
        int target = 7;
        int rows = 5;
        String starpattern = "*";
        
        for (int i=0; i<target; i++) {
            for (int j=0; j<rows; j++) {
                System.out.print("*".repeat(i)+j);
                //System.out.printf("%s%d",starpattern,j);
                if (j<target) {
                    System.out.print(", ");
                }
            }
        System.out.println();
        starpattern += "*";
        
        }

    }

}
