package com.faj.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern p = Pattern.compile("\\d{4}");
		Pattern p = Pattern.compile("(\\d{4})([a-z]{2})");
		Matcher m = p.matcher("asdf3434as1234df");
		//匹配整个目标字符串
		//System.out.println(m.matches());
		//查找子字符串
		//System.out.println(m.find());
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
		
		System.out.println("****------split-------****");
		String[] strs = "aa33bb45cc".split("\\d{2}");
		for(String str:strs)
		{
			System.out.println(str);
		}
		
		System.out.println("****------replaceAll-------****");
		System.out.println("a3sdf4sdf".replaceAll("\\ds", "**"));
		
		System.out.println("  faunjoe  ".replaceAll("(^\\s+)|(\\s+$)", ""));
	}
}
