package pl.vistula.exercise5;

public class Task1 {
    public static void main(String[] args){
        int arr[]= new int[10];
        for(int i =0; i < arr.length; i++){
            arr[i]= arr.length-1-i;
        }
        System.out.println();
        for(int x:arr){
            System.out.println("array[" + x +"] = " + arr[x]);
        }
    }
}
