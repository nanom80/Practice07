package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s1 = new Circle("빨강",5);
		//Circle c1 = new Circle("녹색", 10);
		//Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		
		
		//sr1을 그리는 메소드 호출
		
		sr1.draw(); // 다형성 이용, 실제 Rectangle의 draw() 호출됨

		// sr1의 가로 크기 출력 (다운캐스팅 필요)
		if (sr1 instanceof Ractangle) {
            Ractangle rect = (Ractangle) sr1;
            System.out.println("sr1의 가로 크기: " + rect.getWidth());
        }
		
		
	}
}

	
	