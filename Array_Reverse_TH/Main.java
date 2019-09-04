package Array_Reverse_TH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        [*Thực hành] Đảo ngược các phần tử của mảng

         */
        int size;
        int []array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0 ;
        while (i < array.length) {
            System.out.print("Enter element: "+ (i+1)+": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-30s%s","Element in array: ","");
        for (int j = 0; j < array.length ; j++) {
            System.out.print(array[j] +"\t");
        }
        //Đảo ngược thứ tự các phần tử trong mảng:
        for(int j = 0 ; j < array.length /2 ;j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s","Reverse array: ","");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
//            int first = 0;
//            int last = array.length - 1;
//            while (first < last) {
//                int temp = array[first];
//                array[first] = array[last];
//                array[last] = temp;
//                first++;
//                last--;
            }
        }



    }

