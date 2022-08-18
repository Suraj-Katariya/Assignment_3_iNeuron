package Assignment3;
import java.util.Scanner;

public class String_Reverse {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to Reverse ! ");
        System.out.print("Input : ");
        String str1=new String(sc.nextLine());
        String str2=new String("");
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println("Output : "+str2);
    }
}
