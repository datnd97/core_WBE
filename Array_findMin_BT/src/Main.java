import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int size;
	    do {
            System.out.print("Moi ban nhap size cho mang: ");
	        size = new Scanner(System.in).nextInt();
	        if(size > 20) {
                System.out.println("Size is not up to 20.");
            }
        }while (size > 20);
	    int []a = inputArray(size);
	    outputArray(a);
        System.out.println("Min trong mang la: "+findMin(a,size));

    }
    public static int []inputArray(int size) {
        int a[] ;
        a = new int[size];
        for(int i = 0 ; i < a.length ;i++) {
            System.out.print("a["+i+"]:");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }
    public static void outputArray(int a[]) {
        System.out.print("Cac phan tu trong mang la: ");
        for(int i : a) {
            System.out.print(i+ "\t");
        }
    }
    public static int findMin(int a[],int size) {
        int rs = a[0];
        for (int i = 1 ; i < size ;i++) {
            if(rs > a[i]) {
                rs = a[i];
            }
        }
        return rs;
    }
}
