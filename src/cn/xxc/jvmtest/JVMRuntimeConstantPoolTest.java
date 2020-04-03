package cn.xxc.jvmtest;

import java.util.ArrayList;

public class JVMRuntimeConstantPoolTest {

	public static void main(String[] args) {
		String str1 = new StringBuilder("计算机").append("系统").toString();
		System.out.println(str1.intern() == str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
		
//		int i = 0;
//		ArrayList<String> arrayList = new ArrayList<String>();
//		while(true) {
//			
//			arrayList.add(String.valueOf(i++).intern());
//		}
	}
}
