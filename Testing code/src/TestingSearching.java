
public class TestingSearching {

	public static int linearSearch(int[] array, int numOfElements, int key)  {

		int index = 0;
		int countSteps = 0;
		while(index < numOfElements)  {
			countSteps++;
			if(array[index] == key) {
				System.out.println("The number of steps for linear search is " + countSteps);
				return index;
			}
			index++;
		}
		System.out.println("The number of steps for linear search is " + countSteps);
		return -1;
	}

	public static int binarySearch(int[] array, int numOfElements, int key)  {

		int low = 0;
		int high = numOfElements - 1;
		int countSteps = 0;

		while (high >= low) {
			countSteps++;
			int mid = (low + high) / 2;
			if (key < array[mid])
				high = mid - 1;
			else if (key == array[mid]) {
				System.out.println("The number of steps for binary search is " + countSteps);
				return mid;
			}
			else
				low = mid + 1;
		}
		System.out.println("The number of steps for binary search is " + countSteps);
		return -1; // Not found 
	}


	public static void main(String[] args) {

		int SIZE = 100000;
		int keyWeAreSearchingFor = -90;

		//create a test array - in order
		int[] numArray = new int[SIZE];
		for(int i = 0; i < SIZE; i++)
			numArray[i] = i;

		linearSearch(numArray, SIZE, keyWeAreSearchingFor);
		binarySearch(numArray, SIZE, keyWeAreSearchingFor);

	}

}
