/*package whatever //do not write package name here */

import java.io.*;
import java.util.Arrays;



    
    

class Code {
	public static void main (String[] args) {
	
	printThreeWords();
	System.out.println("------------------------------");
	CheckSumSigh();
	System.out.println("------------------------------");
	printColor();
	System.out.println("------------------------------");
	compareNumbers();
	System.out.println("------------------------------");
	Task5(10,11);
	System.out.println("------------------------------");
	Task6(-6);
	System.out.println("------------------------------");
	Task7(120);
	System.out.println("------------------------------");
	Task8("Hello", 5);
	System.out.println("------------------------------");
	Task9(800);
	System.out.println("------------------------------");
	Task10();
	System.out.println("------------------------------");
    Task11();
    System.out.println("------------------------------");
    Task12();
    System.out.println("------------------------------");
    Task13();
    System.out.println("------------------------------");
    Task14(5,3);
    	}
    public static void printThreeWords()
	{
	    System.out.print("Orange\nBanana\nApple\n");
	}
	    
	    
	public static void printColor()
	    {
	       int a=0;
	       if (a<=0){
	        System.out.println("Красный"); 
	        } else if (a>0&&a<=100){ 
	        System.out.println("Желтый");
	        } else if (a>100) {
	        System.out.println("Зеленый");
	            	          }  
	    }
	    
	public static void CheckSumSigh()
	    {
	        int a=10;
	        int b=20;
	        if ((a+b)>=0) {
	        System.out.println("Сумма положительная"); 
	        }else{ 
	        System.out.println("Сумма отрицательная");
	             }   
	    }
	    
	public static void compareNumbers()
	    {
	        int a=10;
	        int b=20;
	        if (a>b) {
	        System.out.println("a>b"); 
	        }else{ 
	        System.out.println("a<b");
	        }   
	    }
	    
    public static void Task5(int s, int x)
	    {
	       boolean v;
	       v=(((s+x)>10)&&(((s+x)<=20)));
	       System.out.println(v);
	    }
	      
    public static void Task6(int c)
	    {
	        if (c>=0) {
	          System.out.println("положительное число");  
	        } else { 
	        System.out.println("отрицательное число");
	            
	        }
	    }
	      
    public static void Task7(int c)
	    {
	        boolean m=(c>0);
	          System.out.println(m);  
	    }  
	    
    public static void Task8(String str, int p)
	    {
	        for(int i=0; i<p; i++)
	          System.out.println(str);  
	    }  
    public static void Task9(int year)
	    {
	        boolean yearCheck=(((year%4)==0)&&((year%100)!=0)||((year%400)==0));
	        System.out.println(yearCheck);
	    }  
	       
	  
	public static void Task10()
	 
	 {
	     int [] arr= {0,1,0,1,1,0};
	     for (int i=0;i<arr.length; i++) 
	     {
	         if (arr[i]==0){ 
	         arr[i]+=1;}
	         else  arr[i]-=1;
	        
	     }
	     for (int i=0;i<arr.length; i++)
	     System.out.print(arr[i]);
	 }
	 
    public static void Task11()
	 
	 {
	     int [] arr= new int[100];
	     for (int i=0;i<100; i++) 
	     {
	      arr[i]=i;  
	     
	     System.out.print(" " +arr[i]);
	     }
	 }
	 
    public static void Task12()
	 
	 {
	     int [] arr= {1,5,3,2,11,4,8,9,1};
	     for (int i=0;i<arr.length; i++) 
	   {
	      if (arr[i]<6)
	      {
	      arr[i]*=2;    
	      }
	   }
	    for (int i=0;i<arr.length; i++)  
	     System.out.print(" " +arr[i]);
	     
	 }
	   
    public static void Task13()
	 
	 {
	     int [][] matrix= new int[4][4];
	     int counter=1;
	     for (int i=0;i<4; i++) 
	     {
	         
	         for (int j=0; j<4; j++)
	         {
	      matrix[i][j]=counter;
	      matrix[i][i]=1;
	      System.out.print(matrix[i][j]+" ");
	      counter++;
	         }
	       System.out.println();                         
	     }
	  }
	  
    public static int[] Task14(int len, int initialValue)
	  	  {
	int[] arr=new int[len];
	    for(int i=0;i<len; i++){
	  	      arr[i]=initialValue;
	                           }
	  	   return arr;   
	  	   	   
	  	   	  }	            
 }   