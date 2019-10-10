package StringCompare;

public class StringBuilder0 {
    public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abc");
		a.append("d");//在字符串后面直接填加，没有申请新的空间内存 
		System.out.println(a);
	}
}
