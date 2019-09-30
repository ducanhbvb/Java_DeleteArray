import java.util.Scanner;

public class DeleteArray {
    public static void randomArr(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
    }
    public static void deteleNumber(int number,int[][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    for (int k = j; k <arr[i].length-1 ; k++) {
                        arr[i][j]=arr[i][j+1];
                    }
                    arr[i][arr[i].length-1]=0;
                }
            }
        }
    }
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input Max Current:= ");
        int maxCurrent=sc.nextInt();
        System.out.println("input Max Column");
        int maxColumn=sc.nextInt();

        int[][]arr=new int[maxCurrent][maxColumn];
        randomArr(arr);
        System.out.println("Print Arr not detele number");
        print(arr);
        System.out.println("input value number I can delete:=");
        int number=sc.nextInt();
        deteleNumber(number,arr);
        System.out.println("\nPrint Arr detele number");
        print(arr);
    }
}
