import java.util.ArrayList;
import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int element = Integer.MAX_VALUE;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> oddList = new ArrayList<>();
		
		System.out.println("Enter elements of the ArrayList");
		System.out.println();
		System.out.println("Recall that when you pressed 0 and now you will not able to add elements ");
		
		while(element!=0)
		{
			element = sc.nextInt();
			list.add(element);
		}
		
		for(int i =0; i<list.size(); i++)
		{
			if(list.get(i)%2!=0)
			{
				oddList.add(list.get(i));
			}
		}
		
		if(oddList.isEmpty())
		
			System.out.println("not a single element is odd in entered list");
		
		else
			oddList.forEach(a->System.out.println(a));
	}
}
