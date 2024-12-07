// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public int largest(int[] arr,int n){
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=largest && arr[i]>second){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Main s=new Main();
        int large=s.largest(arr,n);
        System.out.print("output:");
        System.out.println(large);
    }
}