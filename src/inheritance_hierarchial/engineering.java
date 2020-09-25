package inheritance_hierarchial;

public class engineering extends biology{
	public void e_method1() {
		System.out.println("count of boys=1000");
	}
	public void f_method2() {
		System.out.println("count of girls=700");
	}
	public static void main(String[] args) {
		engineering o=new engineering();
		o.method1();
		o.method2();
		o.e_method1();
		o.f_method2();
	}

}
