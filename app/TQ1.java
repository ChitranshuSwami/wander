import java.util.*;
public class TQ1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input frequency n=");       //take no. of integers to input
		
		int n=input.nextInt();
		System.out.print("Enter integers: ");
		Stack<Integer> s=new Stack<>();
		
		while(n>0)                                   //input integers
		{
			s.push(input.nextInt());
			n--;
		}
		
		int a=s.size();
		for(int i=0;i<a;i++)                          //sort stack
		{
			for(int j=i+1;j<a;j++)
			{
				int e1=s.elementAt(i);
				int e2=s.elementAt(j);
				if(e1>e2)                                 //swap elements
				{
					s.set(i, e2);
					s.set(j, e1);
				}
			}
		}
		
		for(int e:s)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		input.close();
	}
}