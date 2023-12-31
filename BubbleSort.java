import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,1,4,2,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr){
		boolean swapped;
		//run steps n-1 times
		for(int i=0; i<arr.length;i++) {
			swapped = false;
			//for each step, max item will come at the last respective index 
			for(int j=1; j<arr.length-i;j++) {
				//swapped if item is smaller than the previous item
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			// if you did not swap for a particular value of i, it means the array is sorted hence stop the loop
			if(!swapped) {
				break;
			}
		}
	}
}
