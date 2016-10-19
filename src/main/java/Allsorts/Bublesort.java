package Allsorts;

public class Bublesort {

	public static void main(String[] args) {
		//Razmeru massiva prisvaevaetsya sluchainoe chislo ot 0 do 99
int arr[] = new int[(int) (Math.random() * 100)];
		
		for(int i = 0; i < arr.length; i++) {
		    //Elementu massiva prisvaevaetsya sluchainoe chislo ot 0 do 99
		    arr[i] = (int)(Math.random() * 100);
		    System.out.print(arr[i] + "  ");
		}
		      System.out.print("\n");
		                bubbleSort(arr);
		                for(int i = 0; i <  arr.length; i++) {
		                	System.out.print(arr[i] + "  ");
		    }

}
