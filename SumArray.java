import java.util.Scanner;

class SumArray{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  values:");
String n=sc.nextLine();
String temp[]=n.split(" ");
int arr[]=new int[temp.length];
for(int i=0;i<temp.length;i++)
{
arr[i]=Integer.parseInt(temp[i]);
}
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println(sum);        
}
}