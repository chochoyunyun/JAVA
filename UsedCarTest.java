//***************************
// 파일명: UsedCarTest.java
// 작성자: 조윤지
// 작성일: 2022.11.04
// 내용: Car 클래스, UsedCar 클래스를 이용하여 객체를 생성하고 출력하는 클래스
//***************************
package hw11_1;

public class UsedCarTest {

	public static void main(String[] args) {
		System.out.println("hw11_1: 조윤지");
		Car car1 = new Car("blue", 2000000);
		System.out.println(car1.getColor() + " "+ car1.getPrice());
		UsedCar car2 = new UsedCar("red", 1000000, 2004);
		System.out.println(car2);
	}

}
