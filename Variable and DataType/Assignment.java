import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        float A=10f, B=20f, C=10f;
        float Average = (A+B+C) / 3;

        // Question 2
        int side = 5;
        int Area = side*side;

        // Question 3
        float pencil = sc.nextFloat(), pen = sc.nextFloat(), eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        float gst = (totalCost /100) *118;

        // Question 4
        int $ = 12;
        System.out.println($);
    }
}
