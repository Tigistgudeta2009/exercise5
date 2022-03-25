package pl.vistula.exercise5;

import java.util.Random;

public class MinAndMax {
    public static void main(String[] args){
        int rnd=0 , max=0, min=101  ;
        Random rd=new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(0, 100);
            System.out.println(arr[i]);

            if(rnd < min) min =arr[i];
            if(rnd < max) max =arr[i];


        }
        System.out.println("\n The smallest number:" +min);
        System.out.println("The greatest number:" +max);


    }



}
