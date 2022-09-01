import java.util.Scanner;

public class largest {

    public static void biggest (int one, int two, int three){

        int max = one;
        int[] temp = {one, two, three};

        for (int i = 0; i < 3; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers.");
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        biggest(first, second, third);
    }

}
