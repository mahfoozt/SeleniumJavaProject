package allLoop;


import java.util.Arrays;
import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args) {
		
		
		System.out.println("Wright an array of 10 employees names");
	
		String [] Employees = {"Rony","Tom","Sony","Rosy","Jony","Tony","Oni","Boby","Sam","Pam"};
		System.out.println(Arrays.toString(Employees)); //
		System.out.println(Employees [3]); 		//Print Rosy from the list
		System.out.println(Employees.length);	//print gets count of list
		System.out.println("----------------------------");	
		for(int i=0; i<=9; i=i+1) {					//print all names from the list using For Loop
			System.out.println(Employees[i]);			
		}
		System.out.println("----------------------------");
		for (String eachEmployees: Employees){		//print all names from the list using For each Loop
			System.out.println(eachEmployees);		
		}		
		int [] ID = {12,15,14,24,25,28,29,34,36,38,39,44,66,68,74,80,88,102,204,244};
		for ( int eachID: ID) {	//Print all ID from the Array using each loop
			System.out.println(eachID);
		}
		System.out.println();	//generate new empty line 
		int j = 1;				//Using Do loop print all the odd numbers up to 25 starting from 3 
		do {System.out.println(j);
		j=j+2;
		}while(j <= 25);
		
		System.out.println();	//generate new empty line
		int k = 2;
		while(k <=20 ) {		//Using While loop print all the even number up to 20 starting from 2
			System.out.println(k);
			k = k+2;
		}
		//for() {};
		  
	}

}
