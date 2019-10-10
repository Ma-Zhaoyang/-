package Array;

public class CoreCode {
  public static void main(String[] args) {
	//¾ØÕó¼Ó·¨
	int[][] a= {{1,5,7},{4,8}};
	int[][] b= {{5,8,1},{6,7}};
	IntegertMatrix addInt01=new IntegertMatrix(a,b);
	addInt01.addMatrix();
	
	//¾ØÕó³Ë·¨
	int[][] aa= {{1,2,3},{5,9,8}};
	int[][] bb= {{5,9},{5,4},{6,7,5}};
	
	IntegertMatrix addInt02=new IntegertMatrix(aa,bb);
	addInt02.multiplyMatrix();
	}
}

