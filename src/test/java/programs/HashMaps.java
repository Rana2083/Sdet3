package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps {

	public static void main(String[] args)
	{
		HashMap<Character, Integer> map=new HashMap<>();

		map.put('a',25);
		map.put('b', 30);
		map.put('c', 25);
		map.put('d', 35);
		int count=0;
		int count2=0;
		int count3=0;
		int m5=0,m1=0,m2= 0,m3=0;

		for(Entry<Character, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			m5=m.getValue();
			if(m5==25)
			{
				count++;
				m1=m5;	
			}	
			else if (m5==30) 
			{
				count2++;
				m2=m5;
			}
			else if (m5==35) {
				count3++;
				m3=m5;
				}
		}
		System.out.println(m3+" age of candidates "+count3);
		System.out.println(m2+" age of candidates "+count2);
		System.out.println(m1+" age of candidates "+count);
	}
}




