public class TableManager{
	
FileHandler fh = new FileHandler();

public void createTable(String tableName, String columns){
System.out.println("Creating table............");
fh.createFile(tableName,columns);
/*System.out.println("File: "+tableName+".txt");
System.out.println("Columns: "+columns);*/
}
public void insertRecord(){
System.out.println("Inserting Record............");
}
public void viewRecords(){
System.out.println("Viewing Records.............");
}
public void searchRecord(){
System.out.println("Searching Records............");
}
public void deleteRecord(){
System.out.println("Deleting Records............");
}

}
