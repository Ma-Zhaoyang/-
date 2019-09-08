package new01;

public class Try {
public static void main(String[] args) {
	int[] a= {10,20,30,40};
	int[] c;
	int[] b[]= {{1,2},{4,5,6,7}};
	c=a;
	b[0]=c;
	b[0][1]=b[1][3];
	System.out.println(b[0][3]);
	System.out.println(a[1]);
}
}
