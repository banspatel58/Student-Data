// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate
import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;

public class Driver{
	
	public static void main (String [] args){
		
		boolean keepGoing = true;
		while (keepGoing){
			//Give the menu option to the user and ask what they would like to do
			Scanner scanner = new Scanner( System.in );
			System.out.print ( "  1. Load Students (From File) \n  2. Print Stack \n  3. Exit Program \n Enter Your Selection: " );
			int input = scanner.nextInt();
			//create an instance of stack object of type student
			Stack<Student> stackTextData = new Stack<Student>();

			//as long as user enters 1 or 2 do this steps
			do{
				
				String [] stackData;// = new String[];
				
				if (input == 1 ){
					
					try{
						//read the text file using scanner
						File file = new File("students.txt");
						
						Scanner sc = new Scanner(file);
						//while text file has next line split the text to store all elements in to an array
						while (sc.hasNextLine()){
							
							stackData = sc.nextLine().split(",");
							
							//push the student object on stack object stackTextData
							stackTextData.push(new Student(stackData));
					
						}
						
						//close the file 
						sc.close();
						
					}catch(IOException e) {
						//catch the exception if the file is not found
						System.out.println(" Sorry! the file is not  found! ");
						
					}
					
					do{
						System.out.println( " \n Students loaded from the file \n " );
						System.out.print ( "  1. Load Students (From File) \n  2. Print Stack \n  3. Exit Program \n Enter Your Selection: " );
						input = scanner.nextInt();
						
					}while(input == 1);
				}
				//if user enters 2 pop the elements from the stack object
				if ( input == 2 ){
					do{
						//while the stack is not empty pop the data from the stack. 
						while (!(stackTextData.isEmpty())){
							
							//pop the student type data from the stack and print them
							Student listStudent = stackTextData.pop();
							
							System.out.println(listStudent.getFullStudentData());
							
						}
						//ask the user what they would like to do further
						System.out.print ( "  1. Load Students (From File) \n  2. Print Stack \n  3. Exit Program \n Enter Your Selection: " );
						input = scanner.nextInt();
						
					}while(input == 2);
				}
			
			}while( input == 1 || input == 2);
			//if user enters 3 exit the program
			if(input == 3){
				
				System.out.println ( " Good Bye! " );
				
				keepGoing = false;
				
			}
		}
	}
}