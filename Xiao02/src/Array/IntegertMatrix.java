package Array;

import java.util.Arrays;

public class IntegertMatrix {
   //整数矩阵
   private int[][] a=null;
   private int[][] b=null;
   public  int[][] c=null;
   
   public IntegertMatrix(int[][] a,int[][] b) {
		this.a=a;
		this.b=b;
   }
   
   public void addMatrix() {
    //矩阵加法
		for (int i= 0; i< a.length; i++)
		{
			for (int j=0; j < a[i].length; j++) {
				a[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println(Arrays.deepToString(a));
   }
   
   public void multiplyMatrix() {
    //矩阵乘法
	   for (int i= 0; i< a.length; i++)
		{
		    int n=0,j=0;
			for (j=0; j < a[i].length; j++) {
				n=n+a[i][j]*b[j][i];
				//利用数组特性，更换行和列进行乘法
			}
			
			for (j=0; j < a[i].length; j++) {
				a[i][j]=n;
				//循环赋值，减少时间复杂度。我感觉我自己想的
				//这种数组乘法方式已经算是时间复杂度较短的一种了
			}
		}
		System.out.println(Arrays.deepToString(a));
   }
}
