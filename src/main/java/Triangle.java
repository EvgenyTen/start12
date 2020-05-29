import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter triangle sides");
        System.out.println("***************************");
        System.out.println("Please enter first side   :");
        float a = myObj.nextFloat();
        System.out.println("Please enter second side  :");
        float b = myObj.nextFloat();
        System.out.println("Please enter third  side  :");
        float c = myObj.nextFloat();
        arithmetic(a, b, c);
    }

    public static void arithmetic(float a, float b, float c)
    {
        if (a >= b + c || b >= a + c || c >= b + a) // triangle inequality
        {
            System.out.println("Not a triangle");  //not a triangle
        } else if (a == b && b == c && c == a) {
            System.out.println("Equilateral triangle"); //equilateral triangle -ravnostoronij
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles triangle"); //isosceles triangle ravnobedrennij
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a)//rectangular triangle-pramougolnik
        {
            System.out.println("Rectangular triangle");
        } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > b * b + a * a) {
            System.out.println("Obtuse triangle");//obtuse triangle-tupougolnij
        } else if (a * a < b * b + c * c || b * b < a * a + c * c || c * c < b * b + a * a) {
            System.out.println("Acutangular triangle"); //Acutangular triangle-ostrougolnij
        }
    }
}
