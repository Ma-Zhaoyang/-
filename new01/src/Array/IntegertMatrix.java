package Array;

import java.util.Arrays;

public class IntegertMatrix {
   //��������
   private int[][] a=null;
   private int[][] b=null;
   public  int[][] c=null;
   
   public IntegertMatrix(int[][] a,int[][] b) {
		this.a=a;
		this.b=b;
   }
   
   public void addMatrix() {
    //����ӷ�
		for (int i= 0; i< a.length; i++)
		{
			for (int j=0; j < a[i].length; j++) {
				a[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println(Arrays.deepToString(a));
   }
   
   public void multiplyMatrix() {
    //����˷�
	   for (int i= 0; i< a.length; i++)
		{
		    int n=0,j=0;
			for (j=0; j < a[i].length; j++) {
				n=n+a[i][j]*b[j][i];
			}
			
			for (j=0; j < a[i].length; j++) {
				a[i][j]=n;
			}
		}
		System.out.println(Arrays.deepToString(a));
   }
}
