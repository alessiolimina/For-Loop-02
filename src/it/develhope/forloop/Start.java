package it.develhope.forloop;


public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Starting-----------------");

        int sum = 0;
        int nextNum = 1;
        int previousNumber = 0;

        for (int i = 1; i<=10; i++){
            System.out.print(previousNumber + " ");
            sum = previousNumber + nextNum;
            previousNumber = nextNum;
            nextNum = sum;
        }
    }
}
