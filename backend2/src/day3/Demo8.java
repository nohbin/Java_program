package day3;



class Reso implements AutoCloseable {

	public void show() {
		System.out.println("리소스 할당");
	}

	public void close()  {
		System.out.println("리소스 수거");
	}
}

public class Demo8 {
	public static void main(String[] args) {
		Reso a = new Reso();
		try(a) {
			a.show();
			System.out.println("로직 수행");
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		finally {
//			a.close();
//		}
		System.out.println("프로그램 종료");

	}
}
