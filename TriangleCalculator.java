package company;

import java.util.Scanner;
public class TriangleCalculator {
    public static void main(String[] args) {
//prompt user to enter adjacent = adj
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Adjacent side in feet:");
        double a = obj.nextDouble();
        System.out.println("the adjacent side is " + a + " feet");
//prompt user to enter opposite = opp
        System.out.print("Enter the Opposite side in feet:");
        double b = obj.nextDouble();
        System.out.println("The opposite side is " + b + " feet");

double hypo, sine, cosign, tangent;
        //calculate hipotnuse = adj^2 + opp^2 = hipo^2
hypo = Math.sqrt((a * a)+(b * b));
System.out.println("the length of the hypotenuse is " + hypo + " feet");
        // calculate sine = opp/hipo
        sine = ((b)/hypo);
        System.out.println("the sine of triangle is " + sine + " feet");
        // calculate cosign = adj/hipo
        cosign = ((a)/hypo);
        System.out.println("the cosign of the triangle is " + cosign + " feet");
        // calculate tangent = opp/adj
        tangent = ((b)/(a));
        System.out.println("the tangent of the triangle is " + tangent + " feet");
    }
}
