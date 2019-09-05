import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // [*Bài tập] Xoá phần tử khỏi mảng
        int size;
        do {
            System.out.println("Moi ban nhap size n:");
            size = new Scanner(System.in).nextInt();
        } while (size > 20);
        int a[] = inputArray(size);
        output(a);
        System.out.println("Moi ban nhap gia tri can tim: ");
        int x = new Scanner(System.in).nextInt();
        int index_delete = isShow(a,size,x);
        if(index_delete != -1) {
            int b[]= delete(a,size,index_delete);
            output(b);
        }
        else
        {
            System.out.println("Khong co trong mang.");
        }
    }

    public static int[] inputArray(int size) {
        int []a = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.print("a["+i+"]");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }
    public static void  output(int a[]) {
        System.out.print("Cac phan tu trong man la: ");
        for (int i : a) {
            System.out.println(i+"\t");
        }
    }
    public static int []delete(int a[],int size,int index_del) {
        int []rs = new int[size - 1];
        for(int j = 0 ; j < rs.length;j++) {
            rs[j] = a[j];
            if (j == index_del) {
                rs[index_del] = a[index_del + 1];
            }
        }
        return rs;

    }
    public static int isShow(int []a,int size,int value) {
        int index_delelte = -1 ;
        for(int i = 0 ; i < size;i++) {
            if (value == a[i]) {
                index_delelte = i;
            }
        }
        return index_delelte;
    }
}
