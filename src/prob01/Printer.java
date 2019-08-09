package prob01;

public class Printer<T>{
	public void println(T a) {
		System.out.println(a);
	}
	public void println(T a,T b,T c,T d) {
		System.out.print(a+" : "+b+" : "+c+" : "+d);
	}
	
}
