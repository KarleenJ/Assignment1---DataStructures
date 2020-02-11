package assignment1;

public class Tasks {
	
	public boolean isValid (int[] arr) {
		
		if (arr.length > 1 && arr[0] == arr[arr.length - 1]) 
			return true;
		else
			return false;			
	}
}
