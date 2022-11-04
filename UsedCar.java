//***************************
// 파일명: UsedCar.java
// 작성자: 조윤지
// 작성일: 2022.11.04
// 내용: Car 클래스를 상속하는 클래스
//***************************
package hw11_1;

class UsedCar extends Car { 
	private int year; // 생산연도
	
	public UsedCar(String color, int price, int year) {
		super(color, price);
		this.year = year;
	} // 색상, 가격, 생산연도를 매개변수로 받아 초기화 하는 생성자
	
	public int getYear() {
		return year;
	} // 생산연도에 대한 getter
	
	public String toString() {
		return super.getColor() + " " + super.getPrice() + " " + getYear();
	}

}
