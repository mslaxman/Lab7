package com;

import java.util.HashMap;
import java.util.Map;

public class E3 {
	
	public Map<Integer, Integer> getSquares(int[] a){
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
//		int[] squares=new int[a.length];
		for(int i:a) {
			m.put(i, i*i);
		}
		return m;
	}
	public static void main(String[] as) {
		int[] a= {4,5,6,78,2,94,44};
		E3 e=new E3();
		System.out.println(e.getSquares(a));
	}
}
