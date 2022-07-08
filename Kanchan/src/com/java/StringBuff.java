package com.java;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StringBuffer sc=new StringBuffer(" java");
	      System.out.println("Capacity: "+sc.capacity());
	      System.out.println("Append0: "+sc.append("Angular"));
	 
	      System.out.println("Reverse: "+sc.reverse());
	      System.out.println("Replace: "+sc.replace(2,5,"c++"));
	      System.out.println("insert: "+sc.insert(2,"DBMS"));
	      System.out.println("Delete: "+sc.delete(2,4));
	      System.out.println("Ensure Capacity: "+sc.capacity());
	      
	      sc.ensureCapacity(40);
	      System.out.println("ensurecapacity"+sc.capacity());
	
		
	      System.out.println("Edubring code");
	  	
	      
	      StringBuffer sb=new StringBuffer();  
	        System.out.println(sb.capacity());  
	        sb.append("DataFlair");  
	        System.out.println(sb.capacity());
	        sb.append("DataFlair is company that teaches programming!!!");  
	        System.out.println(sb.capacity()); 
	        sb.ensureCapacity(10);
	        System.out.println(sb.capacity());  
	        sb.ensureCapacity(50);
	        System.out.println(sb.capacity());

	}

}
