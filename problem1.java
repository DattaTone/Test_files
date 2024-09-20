package Package1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class problem1 {
		public static void main(String args[]) {
			Map<Integer,String>mp=new HashMap<>();
			mp.put(1,"Computer");
			mp.put(2,"Mechanical");
			mp.put(3,"En&Tc");
			mp.put(4,"Civil");
			System.out.println(mp);
			Set<Integer>keys=mp.keySet();
			for(Integer k:keys);
			{
				System.out.println(mp.get(keys));
			}
			mp.forEach((k,v)->System.out.println(k+ "-> "+v));
			}
			
		}
