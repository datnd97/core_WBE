import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws IllegalTriangleException   {
	// write your code here
        Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Nhap canh a: ");
                int a = sc.nextInt();
                System.out.println("Nhap canh b: ");
                int b = sc.nextInt();
                System.out.println("Nhap canh c: ");
                int c = sc.nextInt();

                Triangle triangle = new Triangle(a,b,c);
            }
            catch (IllegalTriangleException ex){

                System.out.println(ex.getMessage());
            }





    }
}
