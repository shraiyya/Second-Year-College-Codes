//create an abstract data types like Stack and List  and implement its methods.
package javaframework;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

class student
{
	String name="";
	int r=0;
	student(String name,int r)
	{
		this.name=name;
		this.r=r;
	}
	
	
	
	
}

public class main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice=0;
		int index=0;
		do
		{
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("ENTER 1 FOR STRING ARRAYLIST");
		System.out.println("ENTER 2 FOR INTEGER ARRAYLIST");
		System.out.println("ENTER 3 FOR ADT ARRAYLIST");
		System.out.println("ENTER 4 FOR STRING STACK");
		System.out.println("ENTER 5 FOR INTEGER STACK");
		System.out.println("ENTER 6 FOR ADT STACK");
		System.out.println("ENTER 7 FOR STRING LINKED LIST");
		System.out.println("ENTER 8 FOR INTEGER LINKED LIST ");
		System.out.println("ENTER 9 FOR ADT LINKED LIST ");
		System.out.println("ENTER 0 TO EXIT ");
		System.out.println(" ");
		choice=s.nextInt();
		switch(choice) {
		
		case 1:
		ArrayList<String> n=new ArrayList<String>();
		n.add("shreya");
		n.add("riya");
		n.add("lisa");
		n.add("mary");
		n.add("payal");
		System.out.println("Array list is  - "+n);
		System.out.println("The value at 1st index is  -"+n.get(1));
		System.out.println("The size of the arraylist is -"+n.size());
		n.remove(2);
		System.out.println("After element at index 2 is removed - ");
		System.out.println(n);
		n.add(1,"alina");
		System.out.println("After name at index 1 is added - ");
		System.out.println(n);
		n.sort(null);
		System.out.println("The arraylist after sorting is- ");
		System.out.println(n);
		Object[] arr = n.toArray();
		System.out.println("After converting arraylist to array-");
		System.out.println(n.toString());
		
		System.out.println(" ");
			
		
		break;
		
		case 2:
			ArrayList<Integer> no=new ArrayList<Integer>();
			no.add(1);
			no.add(2);
			no.add(3);
			no.add(4);
			no.add(5);
			System.out.println("Array list is "+no); 
			System.out.println("The value at 1st index is - "+no.get(1));
			System.out.println("The size of the linkedlist is - "+no.size());
			no.remove(2);
			System.out.println("After element at index 2 is removed - ");
			System.out.println(no);
			
			no.add(3,9);
			System.out.println("After no at index 3 is added - ");
			System.out.println(no);
			
			no.sort(null);
			System.out.println("The list after sorting is -");
			System.out.println(no);
			
			Object[] arr1 = no.toArray();
			System.out.println("After converting arraylist to array -");
			System.out.println(Arrays.toString(arr1));

			System.out.println(" ");
			break;
			
		case 3:
			ArrayList<student> al=new ArrayList<student>();
			student s1=new student("Tanya",21);
			student s2=new student("Meghana",73);
			student s3=new student("Awanti",03);
			  al.add(s1);//adding Student class object  
			  al.add(s2);  
			  al.add(s3);
			  
			  Iterator itr=al.iterator(); 
			  System.out.println("The Arraylist of the adt is - ");
			  //traversing elements of ArrayList object  
			  while(itr.hasNext()){  
			    student st=(student)itr.next();
			    System.out.println(st.r+" "+st.name+" ");  
			  } 
			  
		break;
		
		case 4:
			Stack <String>  str=new Stack<String>();
			str.push("maths");
			str.push("physics");
			str.push("chemistry");
			str.push("mechanics");
			
			System.out.println("the stack contains  "+str);
			System.out.println("the size of stack is "+str.size());
			System.out.println("the top most element is  "+str.peek());
			System.out.println("after deleting the topmost element :"+str.pop());
			System.out.println(str);
			break;
		case 5:
			Stack <Integer> st=new Stack<Integer>();
			st.push(10);
			st.push(20);
			st.push(40);
			st.push(30);
			
			System.out.println("the stack contains  "+st);
			System.out.println("the size of stack is "+st.size());
			System.out.println("the top most element is  "+st.peek());
			System.out.println("after deleting the topmost element :"+st.pop());
			System.out.println(st);
			System.out.println(" ");
			
			break;
		case 6:
			Stack <student> stack1=new Stack <student>();
			student sta1=new student("Tisha",23);
			student sta2=new student("Nyasa",32);
			student sta3=new student("Annika",98);
			student sta4=new student("Rohan",78);
			student sta5=new student("Ashish",4);
			  stack1.add(sta1);//adding Student class object  
			  stack1.add(sta2);  
			  stack1.add(sta3);
			  stack1.add(sta4);
			  stack1.add(sta5);
			  Iterator itr1=stack1.iterator();  
			  System.out.println("The stack of the adt is-");
			  //traversing elements of ArrayList object  
			  while(itr1.hasNext()){  
			    student st1=(student)itr1.next();
			    
			    System.out.println(st1.r+" "+st1.name+" "); 
			  }
			  System.out.println(" ");
			break;
			
		case 7:
			LinkedList<String> n1=new LinkedList<String>();
			n1.add("shreya");
			n1.add("riya");
			n1.add("lisa");
			n1.add("mary");
			n1.add("payal");
			
			System.out.println("Linked list is "+n1);
			System.out.println("the value at 1st index is  "+n1.get(1));
			System.out.println("the size of the linkedlist is "+n1.size());
			n1.remove(2);
			System.out.println("After element at index 2 is removed  ");
			System.out.println(n1);
			
			n1.add(1,"alina");
			System.out.println("After name at index 1 is added ");
			System.out.println(n1);
			
			n1.addFirst("mansi");
			System.out.println("After name is added at beginning ");
			System.out.println(n1);
			
			n1.addLast("radhika");
			System.out.println("After a name is added at last ");
			System.out.println(n1);
			
			n1.removeFirst();
			System.out.println("After name is removed at beginning ");
			System.out.println(n1);
			
			n1.removeLast();
			System.out.println("After a name is removed at last ");
			System.out.println(n1);
			
			
			n1.sort(null);
			System.out.println("The list after sorting is ");
			System.out.println(n1);
			
			System.out.println(" ");
			
			
		break;
		case 8:
			LinkedList<Integer> no1=new LinkedList<Integer>();
			no1.add(1);
			no1.add(2);
			no1.add(3);
			no1.add(4);
			no1.add(5);
			no1.add(8);
			System.out.println("Linked list is "+no1);
			System.out.println("The value at 1st index is  "+no1.get(1));
			System.out.println("The size of the linkedlist is "+no1.size());
			no1.remove(2);
			System.out.println("After element at index 2 is removed ");
			System.out.println(no1);
			no1.add(3,9);
			System.out.println("After no at index 3 is added  ");
			System.out.println(no1);
			
			no1.removeFirst();
			System.out.println("After deleting the first number ");
			System.out.println(no1);
			
			no1.removeLast();
			System.out.println("After deleting the last number ");
			System.out.println(no1);
			
			no1.addFirst(98);
			System.out.println("After a number is added at beginning ");
			System.out.println(no1);
			
			no1.addLast(968);
			System.out.println("After a number is added at last ");
			System.out.println(no1);
			
			no1.removeFirst();
			System.out.println("After number is removed at beginning ");
			System.out.println(no1);
			
			no1.removeLast();
			System.out.println("After a number is removed at last ");
			System.out.println(no1);
			
			no1.sort(null);
			System.out.println("the list after sorting is ");
			System.out.println(no1);
			
			System.out.println(" ");
			break;
			
		case 9:
			LinkedList<student> al1=new LinkedList<student>();
			student s11=new student("Kevin",90);
			student s22=new student("Yash",56);
			student s33=new student("Tim",99);
			  al1.add(s11);//adding Student class object  
			  al1.add(s22);  
			  al1.add(s33);
			  Iterator itr2=al1.iterator();  
			  System.out.println("The linkedlist of the adt is-");
			  //traversing elements of ArrayList object  
			  while(itr2.hasNext()){  
			    student st1=(student)itr2.next();
			    
			    System.out.println(st1.r+" "+st1.name+" "); 
			  }
			  System.out.println(" ");
			break;
			
		}
		}while(choice!=0);
	}
}




/*
 ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
1
Array list is  - [shreya, riya, lisa, mary, payal]
The value at 1st index is  -riya
The size of the arraylist is -5
After element at index 2 is removed - 
[shreya, riya, mary, payal]
After name at index 1 is added - 
[shreya, alina, riya, mary, payal]
The arraylist after sorting is- 
[alina, mary, payal, riya, shreya]
After converting arraylist to array-
[alina, mary, payal, riya, shreya]
 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
2
Array list is [1, 2, 3, 4, 5]
The value at 1st index is - 2
The size of the linkedlist is - 5
After element at index 2 is removed - 
[1, 2, 4, 5]
After no at index 3 is added - 
[1, 2, 4, 9, 5]
The list after sorting is -
[1, 2, 4, 5, 9]
After converting arraylist to array -
[1, 2, 4, 5, 9]
 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
3
The Arraylist of the adt is - 
21 Tanya 
73 Meghana 
3 Awanti 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
4
the stack contains  [maths, physics, chemistry, mechanics]
the size of stack is 4
the top most element is  mechanics
after deleting the topmost element :mechanics
[maths, physics, chemistry]
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
5
the stack contains  [10, 20, 40, 30]
the size of stack is 4
the top most element is  30
after deleting the topmost element :30
[10, 20, 40]
 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
6
The stack of the adt is-
23 Tisha 
32 Nyasa 
98 Annika 
78 Rohan 
4 Ashish 
 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
7
Linked list is [shreya, riya, lisa, mary, payal]
the value at 1st index is  riya
the size of the linkedlist is 5
After element at index 2 is removed  
[shreya, riya, mary, payal]
After name at index 1 is added 
[shreya, alina, riya, mary, payal]
After name is added at beginning 
[mansi, shreya, alina, riya, mary, payal]
After a name is added at last 
[mansi, shreya, alina, riya, mary, payal, radhika]
After name is removed at beginning 
[shreya, alina, riya, mary, payal, radhika]
After a name is removed at last 
[shreya, alina, riya, mary, payal]
The list after sorting is 
[alina, mary, payal, riya, shreya]
 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
8
Linked list is [1, 2, 3, 4, 5, 8]
The value at 1st index is  2
The size of the linkedlist is 6
After element at index 2 is removed 
[1, 2, 4, 5, 8]
After no at index 3 is added  
[1, 2, 4, 9, 5, 8]
After deleting the first number 
[2, 4, 9, 5, 8]
After deleting the last number 
[2, 4, 9, 5]
After a number is added at beginning 
[98, 2, 4, 9, 5]
After a number is added at last 
[98, 2, 4, 9, 5, 968]
After number is removed at beginning 
[2, 4, 9, 5, 968]
After a number is removed at last 
[2, 4, 9, 5]
the list after sorting is 
[2, 4, 5, 9]
 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
9
The linkedlist of the adt is-
90 Kevin 
56 Yash 
99 Tim 
 
ENTER YOUR CHOICE
ENTER 1 FOR STRING ARRAYLIST
ENTER 2 FOR INTEGER ARRAYLIST
ENTER 3 FOR ADT ARRAYLIST
ENTER 4 FOR STRING STACK
ENTER 5 FOR INTEGER STACK
ENTER 6 FOR ADT STACK
ENTER 7 FOR STRING LINKED LIST
ENTER 8 FOR INTEGER LINKED LIST 
ENTER 9 FOR ADT LINKED LIST 
ENTER 0 TO EXIT 
 
0

*/
