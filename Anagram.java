package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void check_Anagram(String str1,String str2)
    {
         str1=str1.replaceAll(" ", "");
         str2=str2.replaceAll(" ", "");
        if(str1.length()!=str2.length())
        {
            System.out.println("The Above Strings are not equal and hence not an Anagram ! ");
        }
        else{
            char [] array_str1=str1.toLowerCase().toCharArray();
            char [] array_str2=str2.toLowerCase().toCharArray();
            Arrays.sort(array_str1);
            Arrays.sort(array_str2);
            if(Arrays.equals(array_str1,array_str2))
            {

                System.out.println("The Above String is an Anagram ! ");
            }
            else{
                System.out.println(" The Above String is not an Anagram ! ");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to check if Anagram or Not");
        System.out.print("Input String 1 : ");
        String str1=new String(sc.nextLine());
        System.out.println("");
        System.out.print("Input String 2 : ");
        String str2=new String(sc.nextLine());
        System.out.println("");
        check_Anagram(str1, str2);
        sc.close();
    }


}
