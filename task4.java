***question 1
code:
package universitymanage;
import java.util.*;
import java.lang.*;
public class Student {
	 int age;
	 int rollno;
	 String course;
	 String name;

	 Student()
	 {
	 
	  System.out.println("\nObject Created:");
	  rollno=0;
	  age=0;
	  name="No Name Assigned";
	 
	 }

	 Student(int a,int b,String c,String d)
	 { 
	 
	  System.out.println("\nObject created.\n");
	  rollno=a;
	  age=b;
	  name=c;
	  course=d;
	 
	 }

	 void display()
	 {

	  System.out.println("\nRoll no : "+rollno+"\nName : "+name+"\nAge : "+age+"\nCourse : "+course);
	 
	 }

	}
package universitymanage;
import java.util.*;
import java.lang.*;

public class AgeNotWithInRangeException extends Exception {
	   public AgeNotWithInRangeException(String s)
	   {
	  
	   super(s);
	 
	   }
}
package universitymanage;
import java.util.*;
import java.lang.*;

public class NameNotValidException extends Exception {
	 public NameNotValidException(String s)
	 {
	  
	   super(s);
	 
	 }
}
package universitymanage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Studentdemo {

	public static void main(String args[]) {
		
		try
                {
     
               int n1,a1,b1;
               char []c;
               String c1,d1;
  
               System.out.println("\nEnter no of students : ");
  
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               n1=Integer.parseInt(br.readLine());
  
               Student o[]=new Student[n1];
  
               System.out.println("\nEnter data : ");
  
               for(int i=0;i<n1;i++)
               { 
   
               System.out.print("\nRoll No : ");
               a1=Integer.parseInt(br.readLine());
    
               System.out.print("\nAge : ");
               b1=Integer.parseInt(br.readLine());  
   
               if(b1>21 || b1<15)
               throw new AgeNotWithInRangeException("Age Not Valid");

               System.out.print("\nName : ");
               c1=br.readLine();
               c=c1.toCharArray();
   
               for(int j=0;j<c1.length();j++)
               {
             
                 if (! Character.isLetter(c[j]))
                     throw new NameNotValidException("\nName contains digits or special characters");
               
                }
  
               System.out.print("\nCourse : ");
                d1=br.readLine();
 
               o[i]=new Student(a1,b1,c1,d1);
     
                }

               System.out.println("\nData : \n");
  
               for(int i=0;i<n1;i++)
               o[i].display();
 
               }

              catch(IOException e)
               {
               System.out.println(e);
               }
               catch(AgeNotWithInRangeException e)
              {
               System.out.println(e);
                }
               catch(NameNotValidException e)
               {
               System.out.println(e);
    }
}
}
------Output:
Enter no of students : 
2
Enter data : 
Roll No : 105
Age : 12
universitymanage.AgeNotWithInRangeException: Age Not Valid

Enter no of students : 
2
Enter data : 
Roll No : 106
Age : 20
Name : @##45
universitymanage.NameNotValidException: 
Name contains digits or special characters

Enter no of students : 
2
Enter data : 
Roll No : 105
Age : 19
Name : senthil
Course : computer
Object created.
Roll No : 108
Age : 20
Name : pavan
Course : mechanical
Object created.
Data : 

Roll no : 105
Name : senthil
Age : 19
Course : computer

Roll no : 108
Name : pavan
Age : 20
Course : mechanical

***question 2
code:
package personEligiblevoter;
import java.util.*;
import java.lang.*;
public class InvalidAgeException extends Exception {
	                    InvalidAgeException(String message)
	                    {
		            super(message);
	                    }
	
}

package personEligiblevoter;
import java.util.*;
import java.lang.*;
public class Voter  {

	public static void main(String[] args) {
		            int age;
		            Scanner in = new Scanner(System.in);
		            try
		             {
			   System.out.println("Enter age:");
			   age=in.nextInt();
		           //throw InvalidAgeException checkout
                           if(age<18)
    	                   throw new InvalidAgeException("you are not eligible for vote");
                           else
    	                   System.out.println("you are eligible to vote");
     
	                   }
                           catch(InvalidAgeException e)
		           {
        	
        	           System.out.println("CAUGHT AN EXCEPTION");
        	           System.out.println(e.getMessage());
}
}
}
------Output:
Enter age:
15
CAUGHT AN EXCEPTION
you are not eligible for vote

***Question 3
code:
package exception1;
import java.util.*;
import java.lang.IndexOutOfBoundsException;
public class Calender {

	public static void main(String[] args) {
                //to store data in string new keyword
		String weekday = new String();
		System.out.println("weekday of calender  ---------");
			String str1 = new String("sunday");
			System.out.println(str1);
			String str2 = new String("Monday");
			System.out.println(str2);
			String str3 = new String("Tuesday");
			System.out.println(str3);
			String str4 = new String("wednesday");
			System.out.println(str4);
			String str5 = new String("Thursday");
			System.out.println(str5);
			String str6 = new String("Friday");
			System.out.println(str6);
			String str7 = new String("Saturday");
			System.out.println(str7);
			
			System.out.println("if check String index out of bound exception:");
			
			System.out.println(str4);
			
			System.out.println("Above string of index char 5 of range = " + str4.charAt(5));
			
			System.out.println("Above string of length:" +  str4.length());
			try
			{
				String text = "Wednesday";
				char c = text.charAt(40);
				System.out.println(c);
				
			}catch(IndexOutOfBoundsException e)
				{
					
					System.out.println(e.getMessage());
				}
			
			System.out.println("rest of code");
			
			}
			}
------Output:
weekday of calender  ---------
sunday
Monday
Tuesday
wednesday
Thursday
Friday
Saturday
if check String index out of bound exception:
wednesday
Above string of index char 5 of range = s
Above string of length:9
String index out of range: 40
rest of code

***question 4:
code:
package map;
import java.util.HashMap;
import java.util.*;

public class StudentGrade {

	public static void main(String[] args) {
                        // Create an empty hash map by declaring object
		        // of string and integer type
		        HashMap<String, Integer> map = new HashMap<>();
		 
		        // Adding elements to the Map
		        // using standard put() method
		        map.put("Vishal", 75);
		        map.put("sachin", 80);
		        map.put("vaibhav", 90);
		 
		        // Print size and content of the Map
		        System.out.println("Size of map is: "
		                           + map.size());
		 
		        // Printing elements in object of Map
		        System.out.println(map);
		 
		        // Checking if a key is present and if
		        // present, print value by passing
		        // random element
		        if (map.containsKey("Vishal")) {
		 
		            // Mapping
		            Integer a = map.get("Vishal");
		 
		            // Printing value for the corresponding key
		            System.out.println("value for key"
		                               + " \"Vishal\" is: " + a);
		        }
		    }
}
------Output:
Size of map is: 3
{vaibhav=90, sachin=80, Vishal=75}
value for key "Vishal" is: 75

***question 5:
code:
package stackdatastructure;
import java.util.*;
import java.io.*;
 
public class StackDemo {

	public static void main(String[] args) {
		        // Creating an empty Stack
		        Stack<Integer> stack = new Stack<Integer>();
		 
		        // Use add() method to add elements
		        stack.push(10);		        
		        stack.push(15);
		        stack.push(30);
		        stack.push(20);
		        stack.push(5);
		 
		        // Displaying the Stack
		        System.out.println("Initial Stack: " + stack);
		 
		        // Removing elements using pop() method
		        System.out.println("Popped element: "
		                           + stack.pop());
		        System.out.println("Popped element: "
		                           + stack.pop());
		 
		        // Displaying the Stack after pop operation
		        System.out.println("Stack after pop operation "
		                           + stack);
		    }
}
------Output:
Initial Stack: [10, 15, 30, 20, 5]
Popped element: 5
Popped element: 20
Stack after pop operation [10, 15, 30]



	

