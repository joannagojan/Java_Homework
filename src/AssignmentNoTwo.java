import java.util.Scanner;

public class AssignmentNoTwo {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = scan.nextInt();
        System.out.println("Input number b: ");
        int b = scan.nextInt();
        System.out.println("Input number c: ");
        int c = scan.nextInt();

        System.out.println(a + " " + b + " " + c);
        int smallest = 0;
        int middle = 0;
        int biggest = 0;

        if (a < b) {
            if (b <= c) {
                smallest = a;
                middle = b;
                biggest = c;
            } else if (c <= a) {
                smallest = c;
                middle = a;
                biggest = b;
            }
            else {
                smallest = a;
                middle = c;
                biggest = b;
            }
        } else if (a > b) {
            if (c >= a) {
                smallest = b;
                middle = a;
                biggest = c;
            } else if (b < c) {
                smallest = b;
                middle = c;
                biggest = a;
            }
            else {
                smallest = c;
                middle = b;
                biggest = a;
            }
        } else {
            if (a < c) {
                smallest = a;
                middle = b;
                biggest = c;
            } else {
                smallest = c;
                middle = a;
                biggest = b;
            }
        }
        a = smallest;
        b = middle;
        c = biggest;

        System.out.println(a + " " + b + " " + c);
    }
}