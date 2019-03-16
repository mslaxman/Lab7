package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class E1 {
	
	public List<String> getValues(HashMap<Integer, String> m) {
		
		TreeMap<Integer, String> t=new TreeMap<>();
		t.putAll(m);
		List<String> l=new ArrayList<String>(t.values());
		return l;
	}
	public static void main(String []as) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "Amit");
		m.put(2, "Sahil");
		m.put(5, "Anand");
		E1 e=new E1();
		System.out.println(e.getValues(m));
	}
}
