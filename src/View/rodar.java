package View;

	import java.util.Arrays;

import ordenacao.QuickSort;

	public class rodar {
		
		    public static void main(String[] args) {
		    	
		        int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		        QuickSort QS = new QuickSort();
		        QS.sort(vetor, 0, vetor.length - 1);
		        System.out.println(Arrays.toString(vetor));		    
		}
}