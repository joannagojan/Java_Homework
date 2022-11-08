//import java.util.Scanner;
//public class AssignmentNoThree {
//    public static void main (String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Input first integer: ");
//        int biggestNumber = scan.nextInt();
//        System.out.println("Input second integer: ");
//        int nextInput = scan.nextInt();
//        int secondBiggest = 0;
//        if (nextInput >= biggestNumber) {
//            secondBiggest = biggestNumber;
//            biggestNumber = nextInput;
//        }
//        else {
//            secondBiggest = nextInput;
//        }
//        System.out.println("Input third integer: ");
//        nextInput = scan.nextInt();
//        if (nextInput >= secondBiggest && nextInput <= biggestNumber) {
//            secondBiggest = nextInput;
//        }
//        else if (nextInput >= biggestNumber) {
//        secondBiggest = biggestNumber;
//        biggestNumber = nextInput;
//        }
//        System.out.println("Input forth integer: ");
//        nextInput = scan.nextInt();
//        if (nextInput >= secondBiggest && nextInput <= biggestNumber) {
//            secondBiggest = nextInput;
//        }
//        else if (nextInput >= biggestNumber) {
//            secondBiggest = biggestNumber;
//            biggestNumber = nextInput;
//        }
//        System.out.println("Input fifth integer: ");
//        nextInput = scan.nextInt();
//        if (nextInput >= secondBiggest && nextInput <= biggestNumber) {
//            secondBiggest = nextInput;
//        }
//        else if (nextInput >= biggestNumber) {
//            secondBiggest = biggestNumber;
//            biggestNumber = nextInput;
//        }
//        System.out.println("The biggest number is " + biggestNumber + " and the second biggest is " + secondBiggest);
//    }
//}

import java.util.Scanner;

public class AssignmentNoThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int largestNumber;
        int secondLargestNumber = 0;
        int current;

        System.out.println(" Enter first number: ");
        current = scan.nextInt();
        largestNumber = current;
        System.out.println(largestNumber);

        System.out.println(" Enter second number: ");
        current = scan.nextInt();
        if (current >= largestNumber) {
            secondLargestNumber = largestNumber;
            largestNumber = current;

            System.out.println(largestNumber + "" + secondLargestNumber);
        } else if (current >= secondLargestNumber) {
            secondLargestNumber = current;
            System.out.println(largestNumber + "" + secondLargestNumber);
        }

        System.out.println(" Enter third number: ");
        current = scan.nextInt();
        if (current >= largestNumber) {
            secondLargestNumber = largestNumber;
            largestNumber = current;

            System.out.println(largestNumber + "" + secondLargestNumber);
        } else if (current >= secondLargestNumber) {
            secondLargestNumber = current;
            System.out.println(largestNumber + "" + secondLargestNumber);
        }

        System.out.println(" Enter fourth number: ");
        current = scan.nextInt();
        if (current >= largestNumber) {
            secondLargestNumber = largestNumber;
            largestNumber = current;

            System.out.println(largestNumber + "" + secondLargestNumber);
        } else if (current >= secondLargestNumber) {
            secondLargestNumber = current;
            System.out.println(largestNumber + "" + secondLargestNumber);
        }

        System.out.println(" Enter fifth number: ");
        current = scan.nextInt();
        if (current >= largestNumber) {
            secondLargestNumber = largestNumber;
            largestNumber = current;

            System.out.println(largestNumber + "" + secondLargestNumber);
        } else if (current >= secondLargestNumber) {
            secondLargestNumber = current;
            System.out.println(largestNumber + "" + secondLargestNumber);
        }

        System.out.println(" Final result: " + largestNumber + " " + secondLargestNumber);
    }}

