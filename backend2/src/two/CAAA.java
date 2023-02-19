package two;

import one.AAA;

public class CAAA extends AAA {

	public void temp () {
		this.b();
		this.c();
//		다른 package 에서 상속 받을 시
//		default 와 private 는 접근 불가.
	}
}
