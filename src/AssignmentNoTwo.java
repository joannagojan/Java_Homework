import java.util.Scanner;

//            TASK 2              //
//Write a program which reads three integers (say, a, b and c), then prints these three numbers
//        System.out.println(a + " " + b + " " + c);
//        and then rearranges the values in these variables in such a way that a contains the
//        smallest of the three numbers, b — the middle one, and c — the largest. Print again
//        System.out.println(a + " " + b + " " + c);
//        and you shoud see the same three numbers, but in ascending order.
//        Any two (or all three) numbers may be equal. Do not use arrays or Strings!


class ThreeNumberSorter {
    private int a, b, c;

    public ThreeNumberSorter(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int[] sort() {
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
            } else {
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
            } else {
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
        return new int[]{smallest, middle, biggest};
    }
}

public class AssignmentNoTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = scan.nextInt();
        System.out.println("Input number b: ");
        int b = scan.nextInt();
        System.out.println("Input number c: ");
        int c = scan.nextInt();

        System.out.println(a + " " + b + " " + c);

        int[] sorted = new ThreeNumberSorter(a, b, c).sort();

        System.out.println(sorted[0] + " " + sorted[1] + " " + sorted[2]);
    }
}