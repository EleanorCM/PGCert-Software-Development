package arraypackage;

public class CopyArray {
    public static void main(String[] args) {
        int[] myArray = new int[] {1,5,3,4,6,88};
        int[] myCopiedArray = new int[myArray.length];
        for (int i=0;i<myArray.length;i++){
            myCopiedArray[i] = myArray[i];
        }
        System.out.println(myArrays + " - " + myCopiedArray.toString());
    }
}
