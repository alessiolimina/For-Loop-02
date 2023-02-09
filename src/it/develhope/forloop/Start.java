package it.develhope.forloop;

/**
 * This is a Tester class
 * @author alessiolimina
 */
public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Printing Fibonacci Numbers-----------------");

        /**
         * Declaring two variables:
         * firstNumber is the first number
         * secondNumber is the second number
         */

        int firstNumber = 0;
        int secondNumber = 1;

        /**
         * Creating a For Loop
         * Printing the firstNumber
         * The new variable nextNumber is the sum between firstNumber and secondNumber
         * Assigning to firstNumber the value of the secondNumber
         * Assigning to secondNumber the value of the nextNumber
         * Repeat until the end of loop
         */

        for (int i = 1; i<=10; i++){
            System.out.println(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

        }
        System.out.println("---------------------------------------------------------");
    }
}
