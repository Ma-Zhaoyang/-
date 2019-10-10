package found;

public class Found {
    private int[] a=null;
    private int b=0;
     
     public Found(int[] a,int b) {
    	 this.a=a;
    	 this.b=b;
     }
     
     public void ArrayFind() {
    	 for (int i = 0; i < a.length; i++) {
    		 if (a[i]==b) {
    				System.out.println(i);
    			}
		}
     }
}
