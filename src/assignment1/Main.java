package assignment1;

public class Main {

	public static void main(String[] args) {
		
		//initiate class
		Tasks task =  new Tasks();
		
		//arrays for testing
		int[] array = new int[] { 1,2,3,4,5,6,7,8};	//returns false
		int[] array2 = new int[] { 1,1};	//returns true
		int[] array3 = new int[] { 1};	//returns false
		int[] array4 = new int[] { 1,2,3,1};	//returns true
		
		//pass arrays to method and output
		boolean output = task.isValid(array3);
		System.out.println(output);
	}
}
