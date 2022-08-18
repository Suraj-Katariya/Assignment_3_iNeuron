package Assignment3;
import java.util.Scanner;

public class Sentence_Reverse {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any sentence to reverse while preserving position ! ");
    System.out.print("Input : ");
    String str1=new String(sc.nextLine());
    String str2=new String("");
    String []str3=str1.split(" ");
    for(int i=0;i<str3.length;i++)
    {
        for(int j=str3[i].length()-1;j>=0;j--)
        {
            str2=str2+str3[i].charAt(j);
        }
        str2=str2+" ";
    }
    System.out.println("Output : "+str2.toLowerCase());
    sc.close();
    }
}
