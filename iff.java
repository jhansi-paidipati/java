import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class iff {





    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        
    
if(N%2==1)
{
    System.out.print("Weird");
    }
    if(N%2==0)
    {
        if(N>=2 && N<=5)
        {
        System.out.print("Not Weird");}
        if(N>=6 && N<=20){
        System.out.print("Weird");}
    if(N>20)
        {
            System.out.print("Not Weird");
        }
    }
    
}


    }

