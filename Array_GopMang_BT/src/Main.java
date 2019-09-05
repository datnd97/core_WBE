import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[] = nhapMang();
        System.out.println("Cac phan tu trong mang 1 la: ");
        xuatMang(a);
        int b[] = nhapMang();
        System.out.println("Cac phan tu trong mang 2 la: ");
        xuatMang(b);
        int c[] = tron2Mang(a,b);
        xuatMang(c);
    }
    public static int[] nhapMang() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu n: ");
        n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0 ; i < a.length ;i++) {
            System.out.print("a[" +i+ "]=");
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void xuatMang(int a[]) {
        for(int i = 0;i <a.length;i++) {
            System.out.println(a[i] + " ");
        }
    }
    public static int []tron2Mang(int a[],int b[]) {
        int []c = new int[a.length + b.length];
        int lengthFirst = a.length;
        System.out.println(lengthFirst);
        for(int i = 0 ; i < c.length ;i++) {
            if(i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i-a.length];
            }
        }
        return c;
    }
}
