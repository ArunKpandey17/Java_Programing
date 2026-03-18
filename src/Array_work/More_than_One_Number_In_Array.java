package Array_work;


public class More_than_One_Number_In_Array {
	public static void main(String [] args) {
		int arr[]= {21,5,45,12,1,10,55};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>9 && arr[i]<100) {
				System.out.println(arr[i]);
			}
		}
		}

}
