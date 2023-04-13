package ru.netology.sqr;

public class main {
    public static void main(String[] args) {

        SquareRoot service = new SquareRoot();
        int quantity = service.calcSQRT(200, 300);

        System.out.println(" Квадратных корней в диапозоне от 200 до 300 = " + quantity);


    }
}



