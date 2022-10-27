import java.util.Scanner;

public class Main {
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
