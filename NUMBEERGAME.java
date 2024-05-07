//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class numberGame {
    public numberGame() {
    }

    public static void main(String[] args) {
        int number = (int)(Math.random() * 100.0);
        Scanner sc = new Scanner(System.in);

        int yournumber;
        do {
            System.out.println("Guess the number between(1-100):");
            yournumber = sc.nextInt();
            if (yournumber == number) {
                System.out.println("Excellent you guess Correct number....!!");
                break;
            }

            if (yournumber > number) {
                System.out.println("YOur number is too large..");
            } else {
                System.out.println("Your number is small..");
            }
        } while(yournumber >= 0);

        System.out.println("My number was:");
        System.out.println(number);
    }
}
