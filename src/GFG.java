import java.util.Scanner;

public class GFG {
    public static void perimeter (int length, int breadth){
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of your rectangle is: " + perimeter + " inches.");
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a length.");
        int length = scan.nextInt();

        System.out.println("Enter a breadth.");
        int breadth = scan.nextInt();

        perimeter(length, breadth);

    }
}