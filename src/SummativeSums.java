
public class SummativeSums {

	public static void main(String[] args) {
		int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int[] arr2 = { 999, -60, -77, 14, 160, 301 };
		int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
		summation(1, arr1);
		summation(2, arr2);
		summation(3, arr3);
	}

	  static void summation(int index, int[] arr) {
		  int cSum = 0;
		  for(int i : arr) {
			    cSum += i;
			}
		  System.out.println("#" + index + " Array Sum: " + cSum);
	  }
}
