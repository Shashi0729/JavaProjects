
public class Calculator {
public void add(int a,int b) {
	int c=a+b;
	System.out.println(c);
}
public void add(int a,int b,int c) {
	 int r=a+b+c;
	 System.out.println(r);
}
public void add(int a,int b,int c,int d) {
	c=a+b+d;
	System.out.println(c);
}


	public static void main(String[] args) {
	Calculator cal =new Calculator();
	cal.add(1, 2);
	cal.add(1, 2, 3);
	cal.add(1, 2, 3, 4);

	}

}
