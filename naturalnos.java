/*Find sum of first 'n' natural numbers.
Give the answer as sum of the answers for these n: 10, 100, 200 
(Sum of first 10 numbers + Sum of first 100 numbers + Sum of first 200 numbers)
*/


import java.util.*;
class naturalnos
{
	public static void main(String args[])
	{
		int i;
		int sum1=0,sum2=0,sum3=0,sum=0;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=10;i++)
			sum1=sum1+i;
		System.out.println("sum of first 10 natural numbers: "+sum1);
		for(i=1;i<=100;i++)
			sum2=sum2+i;
		System.out.println("sum of first 100 natural numbers: "+sum2);
		for(i=1;i<=200;i++)
			sum3=sum3+i;
		System.out.println("sum of first 200 natural numbers: "+sum3);
		sum = sum1 + sum2 + sum3;
		System.out.println("The answer as sum of the natural nos for n: 10, 100, 200 = "+sum);
	}
}

/*Output:

C:\Users\hp\Desktop\practice>javac naturalnos.java

C:\Users\hp\Desktop\practice>java naturalnos
sum of first 10 natural numbers: 55
sum of first 100 natural numbers: 5050
sum of first 200 natural numbers: 20100
The answer as sum of the natural nos for n: 10, 100, 200 = 25205
*/