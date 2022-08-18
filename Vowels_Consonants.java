package Assignment3;
import java.util.Scanner;
public class Vowels_Consonants {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String to count number of Vowels and Consonants");
    System.out.print("Input : ");
    String str=new String(sc.nextLine());
    str=str.toLowerCase();
    int v_counter=0,c_counter=0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='o')
        {
            v_counter++;
        }
        else if(str.charAt(i)>'a' && str.charAt(i)<='z')
        {
            c_counter++;
        }
    }
    System.out.println("Number of Vowels : "+v_counter);
    System.out.println("Number of Consonants : "+c_counter);
    sc.close();
    }
}
