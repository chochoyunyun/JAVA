//***************************
// 파일명: Car.java
// 작성자: 조윤지
// 작성일: 2022.11.04
// 내용: 자동차 클래스 Car를 정의하는 클래스
//***************************
package hw11_1;

class Car {
	private String color; // 색상
	private int price; // 가격
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	} // 색상과 가격을 매개변수로 받아 초기화하는 생성자
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
}
