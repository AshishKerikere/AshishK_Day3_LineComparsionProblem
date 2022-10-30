package Line;
import java.util.Scanner;
public class Line_Comparision {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x co-ordinates of the first point of Line 1");
        double x1 = scanner.nextDouble();
        System.out.println("Enter the y co-ordinates of the first point of Line 1");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the x co-ordinates of the second point of Line 1");
        double x2 = scanner.nextDouble();
        System.out.println("Enter the y co-ordinates of the second point of Line 1");
        double y2 = scanner.nextDouble();

        double l1 = Math.pow((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)), 0.5);


        System.out.println("Enter the x co-ordinates of the first point of Line 2");
        double a1 = scanner.nextDouble();
        System.out.println("Enter the y co-ordinates of the first point of Line 2");
        double b1 = scanner.nextDouble();

        System.out.println("Enter the x co-ordinates of the second point of Line 2");
        double a2 = scanner.nextDouble();
        System.out.println("Enter the y co-ordinates of the second point of Line 2");
        double b2 = scanner.nextDouble();

        double l2 = Math.pow((Math.pow((a2-a1),2) + Math.pow((b2-b1),2)), 0.5);

        if (l1 > l2){
            System.out.println("The 1st line is longer than the 2nd line");
        }

        else if (l2 > l1){
            System.out.println("The 2nd line is longer than the 1st line");
        }

        else{
            System.out.println("Both the lines are eqaully long");
        }
    }
}
