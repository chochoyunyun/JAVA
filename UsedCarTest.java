//***************************
// ���ϸ�: UsedCarTest.java
// �ۼ���: ������
// �ۼ���: 2022.11.04
// ����: Car Ŭ����, UsedCar Ŭ������ �̿��Ͽ� ��ü�� �����ϰ� ����ϴ� Ŭ����
//***************************
package hw11_1;

public class UsedCarTest {

	public static void main(String[] args) {
		System.out.println("hw11_1: ������");
		Car car1 = new Car("blue", 2000000);
		System.out.println(car1.getColor() + " "+ car1.getPrice());
		UsedCar car2 = new UsedCar("red", 1000000, 2004);
		System.out.println(car2);
	}

}
