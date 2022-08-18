package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Repeating_Char {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to print repeating characters");
        System.out.print("Input : ");
        String str=new String(sc.nextLine());
        str=str.toLowerCase().replace(" ", "");
        char []str_array=str.toCharArray();
        Arrays.sort(str_array);
        for(int i=0;i<str_array.length;i++)
        {
            int count=1;
            while(i+1<str_array.length && str_array[i]==str_array[i+1])
            {
                i++;
                count++;
            }
            if(count>1)
            {
                System.out.println(str_array[i]+" - "+count);
            }
        }
            
        sc.close();
    }
    
}
