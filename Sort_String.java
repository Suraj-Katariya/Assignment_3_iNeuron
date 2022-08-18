package Assignment3;

import java.util.Scanner;

public class Sort_String {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String to sort Alphabetically ! ");
        System.out.print("Input : ");
        String str=new String(sc.nextLine());
        char temp=0;
        char [] array_str=str.toCharArray();
        for(int i=0;i<array_str.length;i++)
        {
            for(int j=i+1;j<array_str.length;j++)
            {
                if(array_str[i]>array_str[j])
                {
                    temp=array_str[i];
                    array_str[i]=array_str[j];
                    array_str[j]=temp;
                }
            }
        }
        String str2=new String("");
        for(int i=0;i<array_str.length;i++)
        {
            str2=str2+array_str[i];
        }
        System.out.println("Output : "+str2);
    }
}
