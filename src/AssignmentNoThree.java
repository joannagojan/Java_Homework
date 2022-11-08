// Write a program which reads five numbers1 of type int and prints the two greatest
//of them (in particular, it may happen that they are equal). You can define at most
//three variables, not counting the variable for the Scanner.
//Do not use loops or arrays.

import java.util.Scanner;
public class AssignmentNoThree {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int biggestNumber = scan.nextInt();
        System.out.println("Input second integer: ");
        int nextInput = scan.nextInt();
        int secondBiggest = 0;
        if (nextInput >= biggestNumber) {
            secondBiggest = biggestNumber;
            biggestNumber = nextInput;
        }
        else {
            secondBiggest = nextInput;
        }
        System.out.println("Input third integer: ");
        nextInput = scan.nextInt();
        if (nextInput >= secondBiggest && nextInput <= biggestNumber) {
            secondBiggest = nextInput;
        }
        else if (nextInput >= biggestNumber) {
        secondBiggest = biggestNumber;
        biggestNumber = nextInput;
        }
        System.out.println("Input forth integer: ");
        nextInput = scan.nextInt();
        if (nextInput >= secondBiggest && nextInput <= biggestNumber) {
            secondBiggest = nextInput;
        }
        else if (nextInput >= biggestNumber) {
            secondBiggest = biggestNumber;
            biggestNumber = nextInput;
        }
        System.out.println("Input fifth integer: ");
        nextInput = scan.nextInt();
        if (nextInput >= secondBiggest && nextInput <= biggestNumber) {
            secondBiggest = nextInput;
        }
        else if (nextInput >= biggestNumber) {
            secondBiggest = biggestNumber;
            biggestNumber = nextInput;
        }
        System.out.println("The biggest number is " + biggestNumber + " and the second biggest is " + secondBiggest);
    }
}
