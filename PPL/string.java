//Write a JAVA program to perform String operations.

package stringpro;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		String s1,s2;
		System.out.println("enter string 1");
		s1=s.nextLine();
		System.out.println("enter string 2");
		s2=s.nextLine();
		do
		{
		System.out.println("  ");
		System.out.println("press 1 to find length");
		System.out.println("press 2 to find substring");
		System.out.println("press 3 to find index of char of string");
		System.out.println("press 4 to find char at particular index of string");
		System.out.println("press 5 to convert string to upper case");
		System.out.println("press 6 to convert string to lower case");
		System.out.println("press 7 for concat");
		System.out.println("press 8 for comparing");
		System.out.println("press 9 to find if they are equal");
		System.out.println("press 10 for reverse");
		System.out.println("press 11 for palindrome");
		System.out.println("press 12 for append");
		System.out.println("press 13 for replace");
		System.out.println("press 0 to exit");
		System.out.println("enter your choice");
		System.out.println("  ");
		n=s.nextInt();
		
		switch (n)
		{
		case 1:
		System.out.println("string length of s1 is:"+s1.length());
		System.out.println("string length of s2 is:"+s2.length());
		break;
		
		case 2:
			int m1;
			int n1;
			System.out.println("enter first index");
			m1=s.nextInt();
			System.out.println("enter last index");
			n1=s.nextInt();
			System.out.println("substring of s1 is:"+s1.substring(m1,n1));
			
			int m2;
			int n2;
			System.out.println("enter first index");
			m2=s.nextInt();
			System.out.println("enter last index");
			n2=s.nextInt();
			System.out.println("substring of s2 is:"+s2.substring(m2,n2));
			break;
		case 3:
			String a1;
			System.out.println("enter  char");
			a1=s.next();
			System.out.println("index of s1 is:"+s1.indexOf(a1));
			
			String a2;
			System.out.println("enter  char");
			a2=s.next();
			System.out.println("index of s1 is:"+s2.indexOf(a2));
			
			break;
		case 4:
			int b1;
			System.out.println("enter  index");
			b1=s.nextInt();
			System.out.println("char of s1 is:"+s1.charAt(b1));
			int b2;
			System.out.println("enter  index");
			b2=s.nextInt();
			System.out.println("char of s1 is:"+s2.charAt(b2));
			break;
			
		case 5:
			String s1up;
			String s2up;
			s1up=s1.toUpperCase();
			s2up=s2.toUpperCase();
			System.out.println(s1up);
			System.out.println(s2up);
			break;
		case 6:
			String s1lo;
			String s2lo;
			s1lo=s1.toLowerCase();
			s2lo=s2.toLowerCase();
			System.out.println(s1lo);
			System.out.println(s2lo);
			break;
		case 7:
		
			String s3 = s1 +s2;
			System.out.println(s3);
			break;
			
		case 8:
			System.out.println("comparison of s1 is:"+s1.compareTo(s2));
			break;
		case 9:
			
		if(s1.equals(s2))
		{
			System.out.println("equal");
			
		}else
			System.out.println("not equal");
		break;
		
		case 10://stringbuffer object is created
			StringBuffer sb1 =new StringBuffer(s1);
			sb1.reverse();
			System.out.println("reverse s1 is:"+sb1);
		
			StringBuffer sb2 =new StringBuffer(s2);
			sb2.reverse();
			System.out.println("reverse s1 is:"+sb2);
		break;
		case 11:
			String rev1="";
			String rev2="";
			int length1 = s1.length();
			 
		      for ( int i = length1 - 1; i >= 0; i-- )
		         rev1 = rev1 + s1.charAt(i);
		 
			if(s1.equals(rev1))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		
			int length2 = s2.length();
			 
		      for ( int i = length2 - 1; i >= 0; i-- )
		         rev2 = rev2 + s2.charAt(i);
			if(s2.equals(rev2))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		break;
		case 12://string builder object is created
			StringBuilder sbu1= new StringBuilder(s1);
			sbu1.append(true);
			System.out.println(sbu1);
			
			StringBuilder sbu2= new StringBuilder(s2);
			sbu2.append(false);
			System.out.println(sbu2);
			break;
		case 13:
			StringBuilder sbd1= new StringBuilder(s1);
			sbd1.replace(1,3,"hi");
			System.out.println(sbd1);
			
			StringBuilder sbd2= new StringBuilder(s2);
			sbd2.replace(1,3,"hi");
			System.out.println(sbd2);
			break;
		}
		}
		while(n!=0);
	
}
}

/*
enter string 1
hello
enter string 2
world
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
1
string length of s1 is:5
string length of s2 is:5
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
2
enter first index
0
enter last index
2
substring of s1 is:he
enter first index
1
enter last index
4
substring of s2 is:orl
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
3
enter  char
e
index of s1 is:1
enter  char
o
index of s1 is:1
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
4
enter  index
1
char of s1 is:e
enter  index
2
char of s1 is:r
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
5
HELLO
WORLD
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
6
hello
world
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
7
helloworld
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
8
comparison of s1 is:-15
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
9
not equal
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
10
reverse s1 is:olleh
reverse s1 is:dlrow
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
11
 not palindrome
 not palindrome
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
12
hellotrue
worldfalse
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
13
hhilo
whild
  
press 1 to find length
press 2 to find substring
press 3 to find index of char of string
press 4 to find char at particular index of string
press 5 to convert string to upper case
press 6 to convert string to lower case
press 7 for concat
press 8 for comparing
press 9 to find if they are equal
press 10 for reverse
press 11 for palindrome
press 12 for append
press 13 for replace
press 0 to exit
enter your choice
  
0
*/
