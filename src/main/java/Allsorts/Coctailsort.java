package Allsorts;

public class Coctailsort {

	public static void main(String[] args) {
			int arr[] = new int[(int) (Math.random() * 100)];
			//Razmeru massiva prisvaivaetsya sluchainoynoe chislo ot 0 do 99
			
			for(int i = 0; i < arr.length; i++) {
			    //Elementu massiva prisvaivaetsya sluchainoynoe chislo ot 0 do 99
			    arr[i] = (int)(Math.random() * 100);
			    System.out.print(arr[i] + "  ");
			}
			      System.out.print("\n");
			                coctailSort(arr);
			                for(int i = 0; i <  arr.length; i++) {
			                	System.out.print(arr[i] + "  ");
			    }
			                
	}
	}

}
