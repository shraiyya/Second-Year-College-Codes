//Create an application for a book shop and maintain the inventory of books that are being sold at the shop
import java.util.* ;
class Book//parent class Book
{
	//instance variables
	String title ;
	String author ;
	int price ;
	String publisher ;
	int stock_pos ;


	Book()//constructor
	{
		title = "" ;
		author = "" ;
		price = 0 ;
		publisher = "" ;
		stock_pos = 0 ;
	}
	void accept() //accepting data of book
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Title of the book =  ") ;
		title = sc.nextLine() ;
		System.out.println("Enter Author of the book =  ") ;
		author = sc.nextLine() ;
		System.out.println("Enter Publisher of the book =  ") ;
		publisher = sc.nextLine() ;
		System.out.println("Enter price of the book =  ") ;
		price = sc.nextInt() ;
		System.out.println("Enter stock position of the book =  ") ;
		stock_pos = sc.nextInt() ;
	}
	void display()//displaying the book data
	{
		System.out.println("Book details : ") ;
		System.out.println("\n") ;
		System.out.println("Title of the book = "+title) ;
		System.out.println("Author of the book = "+author) ;
		System.out.println("Publisher of the book = "+publisher) ;
		System.out.println("Price of the book = "+price) ;
		System.out.println("Stock position of the book = "+stock_pos) ;
		System.out.println("\n") ;

	}
}
class customer extends Book//child class
{
	//instance variables
	float total_price ;
	int count = 0 ;
	int o = 0 ;
	void display()
	{
		super.accept();
		super.display();	
	}
	void search(Book a[] , int n)//search by title
	{
		int flag = 0 ;
		Scanner y = new Scanner(System.in) ;
		System.out.println("Enter title of book  = ") ;
		String ti = y.nextLine() ;
		System.out.println("Enter Author of book  = ") ;
		String au = y.nextLine() ;
		for(int i = 0 ; i < n ; i++)
		{
			int j = ti.compareToIgnoreCase(a[i].title) ;
			int j1 = au.compareToIgnoreCase(a[i].author) ;
			if(j == 0 && j1==0)
			{
				if(a[i].stock_pos == 0 )
				{
					System.out.println(" Sorry ..All copies are sold ...Book is out of stock") ;
				}
				else
				{
					a[i].display() ;
				}
				flag = 1 ;
				break ;
			}
		}
		if(flag == 0)
		{
			System.out.println("Sorry...This book is not available in shop") ;
		}
	}

	
	void purchase(Book a[] ,int n,customer c[])//purchasing the book
	{

		int flag = 0 ;
		char ch = '\0' ;
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter title of book customer wants = ") ;
		String t = s.nextLine() ;

		for( int i = 0 ; i < n ; i++)
		{

			int k = t.compareToIgnoreCase(a[i].title) ;
			if(k == 0)
			{
				if(a[i].stock_pos == 0 )//checking if it is in stock
				{
					System.out.println(" Sorry ..All copies are sold ...Book is out of stock") ;
				}
				else
				{
					System.out.println("Price of one copy of this book is "+a[i].price) ;
					do
					{
						System.out.println("How many copies do you want ?") ;

						c[i].o = s.nextInt() ;
						if(c[i].o > a[i].stock_pos)
						{
							System.out.println("We have "+a[i].stock_pos+" copies only") ;
							System.out.println("Do you want to buy ? (y/n)") ;
							ch = s.next().charAt(0) ;
						}

						else
						{
							a[i].stock_pos = a[i].stock_pos - c[i].o ;
							count ++ ;
							break ;
						}
					}while(ch == 'y'||ch == 'Y') ;

				}
				flag = 1;
				break ;
			}

		}
		if(flag == 0)//if book is not in the shop
		{
			System.out.println("Sorry...This book is not available in shop") ;
		}



	}
	void Bill(Book a[] ,int n,customer c[])//displaying the bill
	{
		System.out.println("Book \t\t\tAuthor\t\tNo.of copies\t\t\tTotal price") ;
		for(int i = 0; i < n ; i++)
		{	
			System.out.println(a[i].title+"\t\t\t"+a[i].author+"\t\t\t"+c[i].o+"\t\t\t"+a[i].price*c[i].o) ;
		}

	}


}
public class Bookshop
{

	public static void main(String args[])
	{
		int n = 0 ;
		int ch = 0 ;
		Scanner sc = new Scanner(System.in) ;
		do
		{
			System.out.println("Enter no of books = ") ;
			n = sc.nextInt() ;
			if(n < 0)//checking for non negative no of books
			{
				System.out.println("Books can't be negative") ;
			}
		}while(n < 0) ;
		Book a[] = new Book[n] ;
		customer c[] = new customer[20] ;
		customer b  = new customer() ;
		for(int i = 0 ;i < n ; i ++ )
		{
			a[i] = new Book() ;
			c[i] = new customer() ;
			a[i].accept();
		}

		do
		{
			//menu
			System.out.println("-------------------------------\t\t") ;
			System.out.println("\t\tMenu") ;
			System.out.println("-------------------------------\t\t") ;
			System.out.println("1.Display") ;
			System.out.println("2.Search by title") ;
			System.out.println("3.Purchase") ;
			System.out.println("4.Display Bill") ;
			System.out.println("\n") ;
			System.out.println("Enter your choice") ;
			ch = sc.nextInt() ;
			switch(ch)//calling functions corresponding to choice using switch case
			{
			case 1 :
				for(int i = 0 ; i < n ;i++)
				{
					a[i].display();
				}
				break ;
			case 2 :
				b.search(a, n) ;
				break ;
			case 3 :
				b.purchase(a,n,c);
				break ;
			case 4 :
				b.Bill(a ,n,c);
				break ;
			case 0 :
				System.out.println("Thank You !") ;
				break ;
			default :
				System.out.println("Invalid choice") ;
				break ;


			}
		}while(ch != 0) ;
	}
}




/*
Enter no of books = 
4
Enter Title of the book =  
maths
Enter Author of the book =  
shreya
Enter Publisher of the book =  
abc 
Enter price of the book =  
100
Enter stock position of the book =  
2
Enter Title of the book =  
physics
Enter Author of the book =  
riya
Enter Publisher of the book =  
golden
Enter price of the book =  
400
Enter stock position of the book =  
2
Enter Title of the book =  
mechanics
Enter Author of the book =  
payal
Enter Publisher of the book =  
hello
Enter price of the book =  
100
Enter stock position of the book =  
4
Enter Title of the book =  
computing
Enter Author of the book =  
akshata
Enter Publisher of the book =  
shine
Enter price of the book =  
200
Enter stock position of the book =  
0
-------------------------------		
		Menu
-------------------------------		
1.Display
2.Search by title
3.Purchase
4.Display Bill


Enter your choice
1
Book details : 


Title of the book = maths
Author of the book = shreya
Publisher of the book = abc 
Price of the book = 100
Stock position of the book = 2


Book details : 


Title of the book = physics
Author of the book = riya
Publisher of the book = golden
Price of the book = 400
Stock position of the book = 2


Book details : 


Title of the book = mechanics
Author of the book = payal
Publisher of the book = hello
Price of the book = 100
Stock position of the book = 4


Book details : 


Title of the book = computing
Author of the book = akshata
Publisher of the book = shine
Price of the book = 200
Stock position of the book = 0


-------------------------------		
		Menu
-------------------------------		
1.Display
2.Search by title
3.Purchase
4.Display Bill


Enter your choice
2
Enter title of book  = 
maths
Enter Author of book  = 
akshata
Sorry...This book is not available in shop
-------------------------------		
		Menu
-------------------------------		
1.Display
2.Search by title
3.Purchase
4.Display Bill


Enter your choice
2
Enter title of book  = 
physics
Enter Author of book  = 
riya
Book details : 


Title of the book = physics
Author of the book = riya
Publisher of the book = golden
Price of the book = 400
Stock position of the book = 2


-------------------------------		
		Menu
-------------------------------		
1.Display
2.Search by title
3.Purchase
4.Display Bill


Enter your choice
3
Enter title of book customer wants = 
physics
Price of one copy of this book is 400
How many copies do you want ?
2
-------------------------------		
		Menu
-------------------------------		
1.Display
2.Search by title
3.Purchase
4.Display Bill


Enter your choice
4
Book 			Author		No.of copies		Total price
maths			shreya		0			0
physics			riya		2			800
mechanics		payal		0			0
computing		akshata		0			0
-------------------------------		
		Menu
-------------------------------		
1.Display
2.Search by title
3.Purchase
4.Display Bill


Enter your choice
5
Invalid choice
-------------------------------		
		Menu
-------------------------------		
1.Display
2.Search by title
3.Purchase
4.Display Bill


Enter your choice
0
Thank You !
*/
