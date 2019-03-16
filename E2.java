package com;

import java.util.HashMap;
import java.util.Map;

public class E2 {
	
	public Map<Character, Integer> countCharecter(char[] c){
	
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<c.length;i++) {
			if(m.containsKey(c[i])) {
				int a=m.get(c[i]);
				m.put(c[i], a+1);
			}
			else {
				m.put(c[i], 1);
			}
		}
		return m;
	}
	public static void main(String[] as) {
		
		char[] c= {'a','d','f','g','d','f','a','d','f'};
		E2 e=new E2();
		Map<Character, Integer> m=e.countCharecter(c);
		System.out.println(m);
	}
}
