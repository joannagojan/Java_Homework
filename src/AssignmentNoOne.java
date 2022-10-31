import java.util.Scanner;
//          TASK 1           //
//Write a program reading integers until zero is entered and printing the length of the
//        longest sequence of consecutive numbers of the same value (and this value).
//        For example, for
//        2 2 2 2 3 3 3 2 6 6 6 0
//        the result should be
//        Longest sequence: 4 times 2
//        for
//        2 2 2 3 3 3 3 3 2 6 6 6 0
//        the result should be
//        Longest sequence: 5 times 3
//        and for
//        2 2 333 333 2 3 -66 -66 -66 0
//        it should be
//        Longest sequence: 3 times -66
//        Do not use arrays, strings or any other kind of collections.
//        Check your solutions for different cases: when the longest sequence is at the beginning,
//        somewhere in the middle, or at the very end.

public class AssignmentNoOne {
    public static void main(String[] args) {
        int currentNumberCounter = 0, currentNumber = 0, maxNumberCounter = 0, maxNumber = 0, iterationCounter = 0;
        while (true) {
            if (currentNumberCounter > maxNumberCounter) {
                maxNumberCounter = currentNumberCounter;
                maxNumber = currentNumber;
            }
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number (or 0 to quit): ");
            int inputNumber = scan.nextInt();
            if (inputNumber == 0) {
                if (currentNumberCounter > maxNumberCounter) {
                    maxNumberCounter = currentNumberCounter;
                    maxNumber = currentNumber;
                }
                break;
            }
            else {
                iterationCounter ++;
                if (iterationCounter == 1) {
                    maxNumber = inputNumber;
                    maxNumberCounter = 1;
                    currentNumber = inputNumber;
                    currentNumberCounter = 1;
                }
                else {
                    if (inputNumber == currentNumber) {
                        currentNumberCounter ++;
                    }
                    else {
                        currentNumber = inputNumber;
                        currentNumberCounter = 1;
                    }
                    }
                }
            }
        System.out.printf("%d times %d", maxNumberCounter, maxNumber);
        }
    }
