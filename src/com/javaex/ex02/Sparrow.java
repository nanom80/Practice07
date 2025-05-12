package com.javaex.ex02;

public class Sparrow extends Bird {
	
	public Sparrow() {}

    @Override
    public void sing() {
        System.out.println("참새가 소리내어 웁니다.");
    }

    @Override
    public void fly() {
        System.out.println("참새가 날아다닙니다.");
    }

    @Override
    public void showName() {
        System.out.println("참새의 이름은 " + getName() + " 입니다.");
    }


}
