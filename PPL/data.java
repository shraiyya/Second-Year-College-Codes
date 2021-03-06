//employee-person
//a. Constructors b. Constructor Overloading c. Function Overloading d. Function Overriding e. Inheritance 

package employeeperson;
import java.util.Scanner;
//the person is the parent class
class person {
 Scanner s = new Scanner(System.in);
 String contact;
 String birth;
 String name, email;
 //constructor
 person(String name, String email, String birth, String contact){
  this.name = name;
  this.email = email;
  this.birth = birth;
  this.contact = contact;
 }
 //to accept data
 void accept() {
  System.out.println("ENTER DETAILS ");
  System.out.println("ENTER NAME ");
  name = s.nextLine();
  System.out.println("ENTER EMAIL ID");
  int count = 0;
  //to validate @ in email
  do {
   System.out.println("Enter email with @");
   email = s.nextLine();
   int len;
   len = email.length();
   for (int i = 0; i < len; i++) {
    if (email.charAt(i) == '@') {
     count++;
    }
   }
  } while (count != 1);
  System.out.println("ENTER THE BIRTH DATE ");
  birth = s.next();
  System.out.println("ENTER THE 10 DIGIT CONTACT NUMBER ");
  // to validate if the number has 10 digits
  do {
   System.out.println("enter valid no");
   contact = s.next();
  } while (contact.length() != 10);
 }
 //to show the output
 void display() {
  System.out.println("NAME: " + name);
  System.out.println("EMAIL ID: " + email);
  System.out.println("BIRTH DATE  : " + birth);
  System.out.println("CONTACT NUMBER: " + contact);
 }
}
//the employee is a subclass
class employee extends person {
 int emploid = 0;
 String grade;
 double bs = 0, ta = 0;
 double gs = 0;
 double da = 0;
 double hra = 0;
 //constructor of employee class
 employee(String name, String email, String birth, String contact, int emploid, String grade, double bs, double ta,
   double hra, double da, double gs) {
  super(name, email, birth, contact);//super keyword is used
  this.emploid = emploid;
  this.grade = grade;
  this.bs = bs;
  this.ta = ta;
  this.hra = hra;
  this.da = da;
  this.gs = gs;
 }
 //fucntion overriding
 void accept() {
  System.out.println("ENTER THE EMPLOYEE DETAILS BELOW ");
  System.out.println("ENTER THE GRADE ");
  grade = s.next();
  System.out.println("ENTER THE EMPLOYEE ID");
  emploid = s.nextInt();
 }
 //fucntion overloading
 void display() {
  System.out.println("ID : " + emploid);
 }
 //cal_salary is used to calculate
 void cal_salary() {
  switch (grade) {
  case "a":
   bs = 8000;
   ta = 2000;
   break;
  case "b":
   bs = 7000;
   ta = 1500;
   break;
  case "c":
   bs = 6000;
   ta = 1000;
   break;
  case "d":
   bs = 5000;
   ta = 500;
   break;
  }
  hra = 0.2 * bs;
  da = 0.5 * bs;
  gs = bs + hra + da + ta;
 }
 //function overloading
 void display(String grade1) {
  System.out.println("GRADE is :" + grade);
  System.out.println("BASIC SALARY : " + bs);
  System.out.println("TA : " + ta);
  System.out.println("HRA : " + hra);
  System.out.println("DA : " + da);
  System.out.println("GROSS SALARY : " + gs);
 }
}
public class data {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
String birth=null;
String contact=null;
int size=0;
System.out.println("ENTER THE TOTAL NUMBER OF EMPLOYEES");
size=s1.nextInt();
String name = null;
String email = null;
int emploid=0;
String grade = null;
double bs=0,ta=0;
double gs=0;
double da=0;
double hra=0;
int i=0;
String grade1 = null;
//creating array of objects
 person p[] = new person[size];
 employee e[] =new employee[size];
 for( i=0;i<size;i++)
 {
   p[i] = new person(name, email, birth, contact);
   p[i].accept();
  e[i] =new employee(name, email, birth, contact, emploid, grade, bs,ta, hra, da, gs);
  e[i].accept();
  
 }
 int choice;
 //for creating a menu driven program
 do
 {
 System.out.println("enter your choice");
 System.out.println("enter 1 for displaying details ");
 System.out.println("enter 2 for salary details of all employee");
 System.out.println("enter 3 for salary details according to grade");
 
 choice=s1.nextInt();
  switch(choice)
 
 {
 case 1:
for( i=0;i<size;i++)
{
p[i].display();
e[i].display();
System.out.println();
}
break;
 case 2:
for( i=0;i<size;i++)
{	
	p[i].display();
	e[i].display();
	e[i].cal_salary();	
e[i].display(grade);
System.out.println();
 }
break;
 case 3:
System.out.println("ENTER THE REQUIRED GRADE");
grade1=s1.next();

for( i=0;i<size;i++) {
if(e[i].grade.equals(grade1))
{
	p[i].display();
	e[i].display();
e[i].display(grade1);
System.out.println(" ");
}
 }
 
 }
}while(choice!=0);
}
}




/*
ENTER THE TOTAL NUMBER OF EMPLOYEES
5
ENTER DETAILS 
ENTER NAME 
shreya
ENTER EMAIL ID
Enter email with @
shreya@yahoo.com
ENTER THE BIRTH DATE 
1/2/90
ENTER THE 10 DIGIT CONTACT NUMBER 
enter valid no
9998887776
ENTER THE EMPLOYEE DETAILS BELOW 
ENTER THE GRADE 
a
ENTER THE EMPLOYEE ID
1
ENTER DETAILS 
ENTER NAME 
riya
ENTER EMAIL ID
Enter email with @
riya@yahoo.com
ENTER THE BIRTH DATE 
1/3/99
ENTER THE 10 DIGIT CONTACT NUMBER 
enter valid no
123341
enter valid no
12332455475678
enter valid no
9879879876
ENTER THE EMPLOYEE DETAILS BELOW 
ENTER THE GRADE 
b
ENTER THE EMPLOYEE ID
2
ENTER DETAILS 
ENTER NAME 
payal
ENTER EMAIL ID
Enter email with @
payal
Enter email with @
payal@yahoo.com
ENTER THE BIRTH DATE 
2/9/95
ENTER THE 10 DIGIT CONTACT NUMBER 
enter valid no
9876987623
ENTER THE EMPLOYEE DETAILS BELOW 
ENTER THE GRADE 
c
ENTER THE EMPLOYEE ID
3
ENTER DETAILS 
ENTER NAME 
lisa
ENTER EMAIL ID
Enter email with @
lisa@yahoo.com
ENTER THE BIRTH DATE 
27/12/99
ENTER THE 10 DIGIT CONTACT NUMBER 
enter valid no
9876598765
ENTER THE EMPLOYEE DETAILS BELOW 
ENTER THE GRADE 
d
ENTER THE EMPLOYEE ID
4
ENTER DETAILS 
ENTER NAME 
ira
ENTER EMAIL ID
Enter email with @
ira@yahoo.com
ENTER THE BIRTH DATE 
30/6/90
ENTER THE 10 DIGIT CONTACT NUMBER 
enter valid no
6879898
enter valid no
9876540543
ENTER THE EMPLOYEE DETAILS BELOW 
ENTER THE GRADE 
c
ENTER THE EMPLOYEE ID
5
enter your choice
enter 1 for displaying details 
enter 2 for salary details of all employee
enter 3 for salary details according to grade
1
NAME: shreya
EMAIL ID: shreya@yahoo.com
BIRTH DATE  : 1/2/90
CONTACT NUMBER: 9998887776
ID : 1

NAME: riya
EMAIL ID: riya@yahoo.com
BIRTH DATE  : 1/3/99
CONTACT NUMBER: 9879879876
ID : 2

NAME: payal
EMAIL ID: payal@yahoo.com
BIRTH DATE  : 2/9/95
CONTACT NUMBER: 9876987623
ID : 3

NAME: lisa
EMAIL ID: lisa@yahoo.com
BIRTH DATE  : 27/12/99
CONTACT NUMBER: 9876598765
ID : 4

NAME: ira
EMAIL ID: ira@yahoo.com
BIRTH DATE  : 30/6/90
CONTACT NUMBER: 9876540543
ID : 5

enter your choice
enter 1 for displaying details 
enter 2 for salary details of all employee
enter 3 for salary details according to grade
2
NAME: shreya
EMAIL ID: shreya@yahoo.com
BIRTH DATE  : 1/2/90
CONTACT NUMBER: 9998887776
ID : 1
GRADE is :a
BASIC SALARY : 8000.0
TA : 2000.0
HRA : 1600.0
DA : 4000.0
GROSS SALARY : 15600.0

NAME: riya
EMAIL ID: riya@yahoo.com
BIRTH DATE  : 1/3/99
CONTACT NUMBER: 9879879876
ID : 2
GRADE is :b
BASIC SALARY : 7000.0
TA : 1500.0
HRA : 1400.0
DA : 3500.0
GROSS SALARY : 13400.0

NAME: payal
EMAIL ID: payal@yahoo.com
BIRTH DATE  : 2/9/95
CONTACT NUMBER: 9876987623
ID : 3
GRADE is :c
BASIC SALARY : 6000.0
TA : 1000.0
HRA : 1200.0
DA : 3000.0
GROSS SALARY : 11200.0

NAME: lisa
EMAIL ID: lisa@yahoo.com
BIRTH DATE  : 27/12/99
CONTACT NUMBER: 9876598765
ID : 4
GRADE is :d
BASIC SALARY : 5000.0
TA : 500.0
HRA : 1000.0
DA : 2500.0
GROSS SALARY : 9000.0

NAME: ira
EMAIL ID: ira@yahoo.com
BIRTH DATE  : 30/6/90
CONTACT NUMBER: 9876540543
ID : 5
GRADE is :c
BASIC SALARY : 6000.0
TA : 1000.0
HRA : 1200.0
DA : 3000.0
GROSS SALARY : 11200.0

enter your choice
enter 1 for displaying details 
enter 2 for salary details of all employee
enter 3 for salary details according to grade
3
ENTER THE REQUIRED GRADE
a
NAME: shreya
EMAIL ID: shreya@yahoo.com
BIRTH DATE  : 1/2/90
CONTACT NUMBER: 9998887776
ID : 1
GRADE is :a
BASIC SALARY : 8000.0
TA : 2000.0
HRA : 1600.0
DA : 4000.0
GROSS SALARY : 15600.0
enter your choice
enter 1 for displaying details 
enter 2 for salary details of all employee
enter 3 for salary details according to grade
3
ENTER THE REQUIRED GRADE
c
NAME: payal
EMAIL ID: payal@yahoo.com
BIRTH DATE  : 2/9/95
CONTACT NUMBER: 9876987623
ID : 3
GRADE is :c
BASIC SALARY : 6000.0
TA : 1000.0
HRA : 1200.0
DA : 3000.0
GROSS SALARY : 11200.0

NAME: ira
EMAIL ID: ira@yahoo.com
BIRTH DATE  : 30/6/90
CONTACT NUMBER: 9876540543
ID : 5
GRADE is :c
BASIC SALARY : 6000.0
TA : 1000.0
HRA : 1200.0
DA : 3000.0
GROSS SALARY : 11200.0

enter your choice
enter 1 for displaying details 
enter 2 for salary details of all employee
enter 3 for salary details according to grade
0
*/
