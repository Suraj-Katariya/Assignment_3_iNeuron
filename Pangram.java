package Assignment3;

import java.util.Scanner;

public class Pangram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String to check if it is a Pangram or not ! ");
        System.out.print("Input : ");
        String str=new String(sc.nextLine());
        boolean flag=false;;
        for(char ch='a';ch<='z';ch++)
        {
            if (!str.contains(String.valueOf(ch)))
            {
                flag=false;
                break;
            }
            else{
                flag=true;
            }
        }
        if(flag)
        {
            System.out.println("The above String is a Pangram ! ");
        }
        else{
            System.out.println("Given String is not a Pangram ! ");
        }
        sc.close();
    }
}