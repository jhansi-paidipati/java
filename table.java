import java.util.*;
class table{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
    int n=sc.nextInt();
    int a;
    for(int i=1;i<11;i++){
        a=n*i;
        System.out.println(n+"*"+i+"="+a);
        
    }
}
}