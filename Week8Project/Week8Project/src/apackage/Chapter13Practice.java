package apackage;

import java.util.ArrayList;
import java.util.Collections;

public class Chapter13Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strB = new StringBuilder("Hello there");
		String st = "abc";
		if(strB.toString().equals(st));
		//System.out.println(strB.insert(6, "%%%%"));
		System.out.println("capacity" + strB.capacity());
		System.out.println("length" + strB.length());
		System.out.println(strB);
		strB.replace(0, strB.length(), "New");
		System.out.println(strB);
		strB.append("$$$$$");
		System.out.println(strB);
		strB.insert(6, "%%%%");
		System.out.println(strB);
		
		
		char ch = 'a';
		String str1 = "ggh acc ttt";
		System.out.println(str1.replace(' ', '$'));
		String result = str1.substring(4, 7);
		String[] strArr = str1.split(" ");
		
		System.out.println(result);
		String str2 = "";
		String str3;
		String str4 = null;
		if(str1.equalsIgnoreCase(str2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		if(str1.compareTo(str2)>0)
			System.out.println("str1 is bigger");
		else
			if(str1.compareTo(str2)<0)
				System.out.println("str1 is smaller");
		else
			if(str1.compareTo(str2)==0)
				System.out.println("both are equal");
			
		
		/*for(int i=0;i<str.length();i++)
			System.out.println(Character.isUpperCase(str.charAt(i)));*/
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(34);
		intList.add(56);
		intList.add(78);
		display(intList);
		intList.remove(1);
		display(intList);
		intList.set(0, 1000);
		display(intList);
		Collections.sort(intList);
		display(intList);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("g");
		strList.add("a");
		strList.add("c");
		Collections.sort(strList);
		System.out.println(strList);
		
		//ArrayList<Employee> empList = new ArrayList<>();
		//System.out.println(intList);
	}
	
	public static void display(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+ " ");
		System.out.println();
	}

}
