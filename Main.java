
import java.text.ParseException;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]) throws ParseException {
        // circle area
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a radius: ");
        byte byteValue = input.nextByte();

        System.out.println("Area is: " + byteValue * byteValue * 3.141);

        // mean

        System.out.println("Please input 3 numbers: ");
        byte n1 = input.nextByte();
        byte n2 = input.nextByte();
        byte n3 = input.nextByte();

        System.out.println("Mean is: " + (n1 + n2 + n3) / 3);

        // time
        long totalMS, totalS, totalM, totalH;
        totalMS = System.currentTimeMillis();
        totalS = totalMS / 1000;
        totalM = totalS / 60;
        totalH = totalM / 60;

        System.out
                .println("Current time now in GMT is :" + totalH % 24 + ":" + totalM % 60 +
                        ":" + totalS % 60 + " GMT");

        // Zodiac sign
        String s = "Monkey, Rooster, Dog, Pig,Rat, Ox, Tiger, Rabbit, Dragon, Snake, Horse, Goat";
        String[] array = s.split(",");
        System.out.println("please eneter a year:");
        int year = input.nextInt();

        System.out.println("The zodiac year of the year " + year + " is " + array[year % 12]);

    }
}
