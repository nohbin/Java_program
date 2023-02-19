package one;

public class AAA {

	void a () {} // default 접근제한자
	
	public void b() {}
	
	protected void c() {}
	
	private void d() {}
	
	/*
	 * default : 같은 package 내에서 접근 가능  Package Private
	 * Public : 모든 경우 접근 가능
	 * protected : 같은 package 또는 다른package 상속일 경우 접근 가능
	 * private : 모든 경우 접근 불가
	 * 
	 * field 는 거의 private, - 상황에 따라 get,set 사용
	 * 초기화는 생성자를 통해서 한다.
	 * method 는 거의 public , 상속과 관련이 있는 함수면 protected.
	 * 
	 * Final class : 수정 할수 없는 class
	 * 상속이란 없음, 대표적인 Final class = String class
	 * 
	 * 
	 * 
	 * 
	 */
	
}
