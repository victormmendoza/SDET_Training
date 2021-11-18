//9.	WAP to add the two matrices.

package Assignment_3;

public class Task_9 {
	   public static void main(String args[]){
		      int a[][]={{6,2,1},{56,51,62},{57,28,19}};
		      int b[][]={{15,13,12},{11,10,21},{21,33,51}};
		      int c[][]=new int[3][3];

		      for(int i = 0;i<3;i++){
		         for(int j = 0;j<3;j++){
		            c[i][j] = a[i][j]+b[i][j];
		            System.out.print(c[i][j]+" ");
		         }
		         System.out.println();
		      }
		   }
}
