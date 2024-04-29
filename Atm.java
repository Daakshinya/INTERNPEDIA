import java.util.Scanner;
import java.io.*;
public class Atm
{
int balance=0,deposit,withdraw,checkbalance;
Scanner sc=new Scanner(System.in);
 void deposit()
{
System.out.println("enter how much money to deposit");
deposit=sc.nextInt();
balance=balance+deposit;
System.out.println("after deposit your balance is "+balance);
}
 void withdraw()
{
System.out.println("enter withdraw amount");
withdraw=sc.nextInt();
if(balance<withdraw)
{
System.out.println("Insufficient balance");
}
else
{
balance=balance-withdraw;
System.out.println(" after withdraw amount your balance is "+balance);
}
}
void checkbalance()
{
System.out.println("current balance is:"+balance);
}
 void exit()
{
System.exit(0);
}
public static void main(String args[])
{
Atm obj=new Atm();
int choice;
Scanner sc=new Scanner(System.in);
do
{
System.out.println("enter your choice\n1.deposit\n2.withdraw\n3.checkbalance\n4.exit");
choice=sc.nextInt();

switch(choice)
{
case 1: System.out.println("1.deposit");
        obj.deposit();
        break;
case 2: System.out.println("2.withdraw");
        obj.withdraw(); 
	break;
case 3: System.out.println("3.checkbalance");
        obj.checkbalance();
	break;
case 4: System.out.println("4.exit");
        obj.exit();
	break;
default:System.out.println("invalid choice");
}
}while(choice!=4);
}
} 