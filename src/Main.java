// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        //Задача 2
        for (int j = 10; j >= 1; j--) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();

        //Задача 3
        for (int k = 0; k < 17; k=k+2) {
            System.out.print(k);
            System.out.print(" ");
        }
        System.out.println();

        //Задача 4
        for (int m = 10; m >= -10; m=m-1) {
            System.out.print(m);
            System.out.print(" ");
        }
        System.out.println();

        //Задача 5
        for (int n = 1904; n <= 2096; n = n + 4){
            System.out.println(n + " год является високосным");
        }
        System.out.println();

        //Задача 6
        for (int l = 7; l <= 98; l=l+7) {
            System.out.print(l);
            System.out.print(" ");
        }
        System.out.println();

        //Задача 7
        for (int s = 1; s <=1000; s=s*2) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();

        //Задача 8
        int savings = 29000;
        int total = 0;
        for (int q = 1; q <= 12; q++) {
            total = total + savings;
            System.out.println("Месяц " + q + ", сумма накоплений равна " + total);
        }
        System.out.println();

        //Задача 9
        int savings2 = 29000;
        double total2WithInterest = 0;
        int savings2WithPenny = savings2 * 100;
        int total2WithPenny = 0;
        for (int b = 1; b <= 12; b++) {
            total2WithPenny = total2WithPenny + total2WithPenny / 100;
            total2WithPenny = total2WithPenny + savings2WithPenny;

            total2WithInterest = total2WithPenny / 100.;
            System.out.println("Месяц " + b + ", сумма накоплений равна " + (total2WithInterest - ((double)savings2 * b)));
        }
        System.out.println();

        //Задача 10
        int icand = 2;
        for (int f = 1; f <= 10; f++) {
            System.out.println(icand + " * " + f + " = " + (icand * f));
        }
    }
}