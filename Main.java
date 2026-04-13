import java.util.Scanner;
public class Main{
public static void main(String[] args){
	
TableManager tm = new TableManager();

Scanner input= new Scanner(System.in);
int choice;

do{
System.out.println(
"HELLO BOSS... WHAT'S ON YOUR MIND TODAY...:\n"
+"1.Create Table\n"
+"2.Insert Table\n"
+"3.View Record\n"
+"4.Search Record\n"
+"5.Delete Record\n"
+"6.EXIT");


choice = input.nextInt();


switch(choice){
case 1:
System.out.println("So you want to create a Table");
System.out.println("ENTER THE TABLE NAME:-");
String tableName = input.next();
System.out.println("YOUR TABLE NAME IS:-"+ tableName);
System.out.println("enter the comma separated column names:-");
String columns = input.next();
System.out.println("YOUR COLUMN NAMES ARE:-"+"["+columns+"]");

tm.createTable(tableName,columns);

break;

case 2:
System.out.println("Insert Table selected");
tm.insertRecord();
break;

case 3:
System.out.println("View record selected");
tm.viewRecords();
break;

case 4:
System.out.println("Search record selected");
tm.searchRecord();
break;

case 5:
System.out.println("Delete record selected");
tm.deleteRecord();
break;

case 6:
System.out.println("SEE YOU LATER BYE");
break;

default:
System.out.println("ARE YOU KIDDING... SELECT A REAL OPTION...");
}
}while(choice!=6);
}
}
