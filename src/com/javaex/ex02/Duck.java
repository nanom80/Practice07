package com.javaex.ex02;

public class Duck extends Bird {
	
	public Duck() {}
	
	@Override
    public void sing() {
        System.out.println("오리가 소리내어 웁니다.");
    }

    @Override
    public void fly() {
        System.out.println("오리가 날아다닙니다.");
    }

    @Override
    public void showName() {
        System.out.println("오리의 이름은 " + getName() + " 입니다.");
    }

}
