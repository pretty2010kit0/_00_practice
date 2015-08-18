package suanfa;

import java.util.Arrays;

public class generateArray000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 10 ;
		int k = 100;
		int[] arr = Arrays.copyOf(generateArray(l,k), l);
		System.out.println(Arrays.toString(arr));

	}
	public static int[] generateArray(int l,int k){
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*k);
		}
		
		return arr;
	}

}
