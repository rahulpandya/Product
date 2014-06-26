import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Product {
	
	public static int[] multiply(int[] a) {
		int[] r = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int p = 1;
			int j = 0;
			while (j < a.length) {
				if (j != i) {
					p = p*a[j];
				}
				j++;
			}
			r[i] = p;
		}

		return r;
	}
	
	public static void printValues(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String queueSize = in.readLine();
		int n = Integer.parseInt(queueSize);
		int temp;
		
		int[] input = new int[n];
		int[] result = new int[n];
		
		int i = 0;
		while (n > 0) {
			temp = Integer.parseInt(in.readLine());
			input[i] = temp;
			i++;
			n--;
		}
		
		result = multiply(input);
		printValues(result);
		
	}

}
