import java.util.Scanner;
public class square
{
    public static void main (String[] args)
    {
        int sq_side;
        int sq_area;
        int sq_peri;
        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter the square side length:");
        sq_side = scan.nextInt();

        sq_area = sq_side * sq_side;
        System.out.println("The square's area is " + sq_area);

        sq_peri = 4 * sq_side;
        System.out.println("The square's perimeter is " + sq_peri);

    }
    }
