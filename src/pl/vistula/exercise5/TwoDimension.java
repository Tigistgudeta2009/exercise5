package pl.vistula.exercise5;

import java.util.Scanner;
public class TwoDimension {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[10][10];
        System.out.println("Enter the elements :");
        for(int i=0; i<3; i++)   //row
        {

            for(int j=0; j<3; j++)  //column
            {
                arr[i][j] = obj.nextInt();
            }
        }
        int sum=0;
        System.out.println("Matrix :");
        for(int i=0; i<3; i++)
        {

            for (int j=0; j<3; j++)
            {

                System.out.print(arr[i][j] + " ");
                if(i == j)
                {
                    sum = sum + arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum =" + sum);

    }
        
}
