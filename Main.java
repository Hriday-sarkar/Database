import java.util.Scanner;
public class Main{
public static void main(String[] args){

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
break;

case 2:
System.out.println("Insert Table selected");
break;

case 3:
System.out.println("View record selected");
break;

case 4:
System.out.println("Search record selected");
break;

case 5:
System.out.println("Delete record selected");
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
