//Design a user defined abstract data type 'Complex' in Java. Write a program to perform arithmetic operations of two complex numbers
package complex;
import java.util.Scanner;
import java.lang.Math;

public class complex {

	public static void main(String[] args) 
	{
		int i;
		complexno c1=new complexno();
		complexno c2=new complexno();
			c1.accept();
			c1.display();
			c2.accept();
			c2.display() ;
			complexno c3= new complexno();
		do
		{
			System.out.println(" ");
	    System.out.println("enter your choice:");
	   	System.out.println( "enter 1 for add");
	    System.out.println( "enter 2 for sub");
	    System.out.println( "enter 3 for mul");
	   	System.out.println( "enter 4 for div");
	    System.out.println("enter 5 for conversion to polar");
	    System.out.println("enter 6 for conversion to cartisan");
	    System.out.println("enter 0 to exit");
	    System.out.println(" ");
		Scanner s1=new Scanner(System.in);
		i=s1.nextInt();

		switch(i) 
		{
		case 1:c3.add( c1,  c2);
		break;
		case 2:c3.sub( c1, c2);
		break;
		case 3:c3.mul(c1,  c2);
		break;
		case 4:c3.div( c1,  c2);
		break;
		case 5:c3.contopolar(c1);
		break;
		case 6:c3.contocartisan(c1);
		break;
		
		}
	
	}while(i!=0);
}
}

class  complexno
{
	double real;
	double img;
	double r;
	double theta;
	Scanner s=new Scanner(System.in);
	void accept()
	{
		System.out.println("enter the number ");
		real=s.nextInt();
		img=s.nextInt();
	}
 void display()
	{
		System.out.println("The number is ");
		System.out.println(real+"+i "+img);
		
	}
	void add(complexno c1, complexno c2)
	{
		real=c1.real + c2.real;
		img= c1.img +c2.img;
		System.out.println("addition is "+ real+"+i "+img);
		
	}
	void sub(complexno c1, complexno c2)
	{
		real=c1.real - c2.real;
		img= c1.img -c2.img;
		System.out.println("subtraction is "+real+"+i "+img);
		
	}
	void mul(complexno c1, complexno c2)
	{
		real=(c1.real * c2.real)-(c1.img * c2.img) ;
		img= (c1.img *c2.real)+ (c2.img*c1.real) ;
		System.out.println("multiplication is  "+real+"+i "+img);
		
	}
	void div(complexno c1, complexno c2)
	{
		real =((c1.real * c2.real)+(c1.img * c2.img))/((c2.real * c2.real)+(c2.img * c2.img));
		img= ((c1.img *c2.real)+ (c2.img*c1.real))/((c2.real * c2.real)+(c2.img * c2.img));
		System.out.println("division is "+real+" +i "+img);
		
	}
	void contopolar(complexno c1) 
	{
		r=Math.sqrt((c1.real*c1.real)+(c1.img*c1.img));
		theta=Math.atan(c1.img/c1.real);
		real=r*Math.cos(theta);
		img=r*Math.sin(theta);
		System.out.println(real+" +i "+img);
		
		
	}
	void contocartisan(complexno c1) {
		System.out.println("enter the r and theta ");
		r=s.nextDouble();
		theta=s.nextDouble();
		c1.real=r*Math.cos(theta);
		c1.img=r*Math.sin(theta);
		System.out.println(c1.real+" +i "+c1.img);
		
	}
	
	
}

/*
enter the number 
12
13
The number is 
12.0+i 13.0
enter the number 
4
5
The number is 
4.0+i 5.0
 
enter your choice:
enter 1 for add
enter 2 for sub
enter 3 for mul
enter 4 for div
enter 5 for conversion to polar
enter 6 for conversion to cartisan
enter 0 to exit
 
1
addition is 16.0+i 18.0
 
enter your choice:
enter 1 for add
enter 2 for sub
enter 3 for mul
enter 4 for div
enter 5 for conversion to polar
enter 6 for conversion to cartisan
enter 0 to exit
 
2
subtraction is 8.0+i 8.0
 
enter your choice:
enter 1 for add
enter 2 for sub
enter 3 for mul
enter 4 for div
enter 5 for conversion to polar
enter 6 for conversion to cartisan
enter 0 to exit
 
3
multiplication is  -17.0+i 112.0
 
enter your choice:
enter 1 for add
enter 2 for sub
enter 3 for mul
enter 4 for div
enter 5 for conversion to polar
enter 6 for conversion to cartisan
enter 0 to exit
 
4
division is 2.7560975609756095 +i 2.731707317073171
 
enter your choice:
enter 1 for add
enter 2 for sub
enter 3 for mul
enter 4 for div
enter 5 for conversion to polar
enter 6 for conversion to cartisan
enter 0 to exit
 
5
12.0 +i 13.0
 
enter your choice:
enter 1 for add
enter 2 for sub
enter 3 for mul
enter 4 for div
enter 5 for conversion to polar
enter 6 for conversion to cartisan
enter 0 to exit
 
6
enter the r and theta 
5
45
2.626609944088649 +i 4.254517622670592
 
enter your choice:
enter 1 for add
enter 2 for sub
enter 3 for mul
enter 4 for div
enter 5 for conversion to polar
enter 6 for conversion to cartisan
enter 0 to exit
 
0
*/
