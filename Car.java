//***************************
// ���ϸ�: Car.java
// �ۼ���: ������
// �ۼ���: 2022.11.04
// ����: �ڵ��� Ŭ���� Car�� �����ϴ� Ŭ����
//***************************
package hw11_1;

class Car {
	private String color; // ����
	private int price; // ����
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	} // ����� ������ �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
}
