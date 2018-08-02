import java.util.Scanner;
class Display_prime_numbers
{
	public static void main(String [] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("enter the maximun number");
		int n=a.nextInt();
		getprime(n);
	}
       public static void getprime(int n)
       {
        for(int i=1;i<=n;i++)
	{
         	int b=0;
 		for(int j=2;j<=i/2;j++)
 		{
			if(i%j==0)
			{
			b++;
			break;
			}
		}
		if(b==0 && i!=1 )
		{
		System.out.println(""+i);
		}
	}}
}