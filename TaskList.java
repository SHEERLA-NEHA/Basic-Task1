import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
public class TaskList
{ 
private static ArrayList<String> currentList = new ArrayList<String>();
public static void main(String[] args) 
{
int menutask = -1;
while(menutask!= 0) 
{ 
menutask=menu(); 
switch(menutask)
{ 
case 1:
showList(); 
break;
case 2: 
addtask();
break;
case 3: 
removetask(); 
break; 
case 0: 
break; 
default:
System.out.println("Enter a valid option:"); 
} 
} 
} 
public static int menu() 
{ 
Scanner scanner = new Scanner(System.in);
System.out.println(); 
System.out.println("----------------------"); 
System.out.println("Main Menu"); 
System.out.println("----------------------"); 
System.out.println("0. Exit the program");
System.out.println("1. Display task list"); 
  System.out.println("2. Add task to list");
  System.out.println("3. Remove task from list"); 
  System.out.println();
System.out.print("Enter choice: ");
int choice = scanner.nextInt();
return choice; 
} 
public static void showList() 
{ 
System.out.println();
System.out.println("----------------------"); 
System.out.println("Task List"); 
System.out.println("----------------------");
int number = 0;
for (String item : currentList) 
{ 
System.out.println(++number + " " +item); }
System.out.println("----------------------"); } 
public static void addtask() 
{ 
System.out.println("Add task:"); 
System.out.println("----------------------");
System.out.print("Enter the task: ");
Scanner scanner = new Scanner(System.in); 
String item = scanner.nextLine();
currentList.add(item);
showList();
}
public static void removetask() { 
System.out.println("Remove task");
System.out.println("----------------------");
Scanner scanner = new Scanner(System.in);
System.out.print("What do you want to remove?\nEnter task index:"); 
int index = scanner.nextInt(); 
if((index-1)<0 || index>currentList.size()) 
{ 
System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size()); 
}
else 
{
currentList.remove(index-1);
} 
System.out.println("----------------------"); 
showList();
} 
}
