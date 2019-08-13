package Assignment_1;

public class Assignment_1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 1; i <= 10; i++){
			arr[i-1] = i; 
		}
		System.out.print("[");
		for (int i : arr) {
			if(i%2 == 0)
				System.out.print(i + " ");
		}
		System.out.println("]");
	}
}
