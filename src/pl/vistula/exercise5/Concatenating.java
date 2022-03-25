package pl.vistula.exercise5;

public class Concatenating {
    public static void main(String[] args){
        String str1 = "Vistula";
        String str2 = "University";
        System.out.println("Vistula".concat("University"));
        
        System.out.println(str1);
        System.out.println(str2);
        if(str1.compareTo(str2) >0) System.out.println("str1 comes after str2");
        if(str1.compareTo(str2) <0) System.out.println("str1 comes before str2");
        if(str1.compareTo(str2) ==0) System.out.println("str1 is equal to str2");

        
        
    }
}
