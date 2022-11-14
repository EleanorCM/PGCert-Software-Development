import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner icon = new Scanner(System.in);

        // get size of box from user
        System.out.println("Enter the length of the edges");
        int lengthSize = sc.nextInt();

        // get char for border from user
        System.out.println("Enter the character to draw with");
        String borderChar = icon.nextLine();

        drawSquare(lengthSize, borderChar);
    }

    public static String drawHorizontal(int edgeSize, String borderCharacter) {
        String fullLine = "";
        for (int i=0; i<edgeSize; i++) {
            fullLine += (borderCharacter + " ");
        }
        return fullLine;
    } // end drawHorizontal

    public static void drawSides(int edgeSize, String borderCharacter) {
        String edgesAndSpace;
        for (int j=0; j<(edgeSize-2); j++) {
            System.out.print(borderCharacter + " ");;
            System.out.print("  ".repeat(edgeSize-2));;
            System.out.print(borderCharacter);;
            System.out.println();
        }
    }

    public static void drawSquare(int edgeSize, String borderCharacter) {
        System.out.println(drawHorizontal(edgeSize, borderCharacter));
        drawSides(edgeSize, borderCharacter);
        System.out.println(drawHorizontal(edgeSize, borderCharacter));
    }
}