package allLoop;

import java.util.Iterator;

public class EachLoop {

	public static void main(String[] args) {
		
		int[] empNumber= {10,20,30,40,50,60,70,70,80,90};
		for (int eachnumbers : empNumber) {
			System.out.println(eachnumbers);
			}
		System.out.println(empNumber.length);
		System.out.println("Printing employees number using for each loop");
		
		String[] empName= {"Ayaat","Rosy","Joy","Rony","Jony","Sony"};
		for (String empnames : empName) {
			System.out.println(empnames);
		}
		System.out.println(empName.length);
		System.out.println("Printing employees name using for each loop");

	}

}
