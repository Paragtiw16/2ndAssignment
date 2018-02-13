package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class SortEx 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("15");
		al.add("67");
		al.add("87");
		al.add("46");
		al.add("32");
		al.add("12");
		System.out.println("Before Sorting="+al);
		Collections.sort(al);
		System.out.println("After Sorting="+al);
		
		
	}

}
