package Array;

import java.util.Arrays;

public class Try {
  public static void main(String[] args) {
	int[][] a= {{1,2,3},{3,5}};
	int[][] b= {{5,6,7},{6,8}};
	int[][] c = {{1,1,1},{1,1}};
	//int i=0,j=0;
	/*int c1=a[1].length;
	System.out.println(c1);*/
	/*for(int i=0,j=0;i<a[0].length;i++,j++) {
		a[0][i]=a[0][i]+b[0][j];
		
	}*/	
	for (int i= 0; i< a.length; i++)
	{
		for (int j=0; j < a[i].length; j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println(Arrays.deepToString(c));
  }
}
