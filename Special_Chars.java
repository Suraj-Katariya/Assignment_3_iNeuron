package Assignment3;

import java.util.Scanner;

public class Special_Chars {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String to count number of special characters ! ");
        System.out.print("Input : ");
        String str=new String(sc.nextLine());
        int s_counter=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>='0' && str.charAt(i)<='9')|| (str.charAt(i)>='a' && str.charAt(i)<='z'))
            {
                continue;
            }
            else
            {
                s_counter++;
            }
        }
        System.out.println("Number of Special Characters : "+s_counter);
        sc.close();
    }
}
