//***************************
// ���ϸ�: UsedCar.java
// �ۼ���: ������
// �ۼ���: 2022.11.04
// ����: Car Ŭ������ ����ϴ� Ŭ����
//***************************
package hw11_1;

class UsedCar extends Car { 
	private int year; // ���꿬��
	
	public UsedCar(String color, int price, int year) {
		super(color, price);
		this.year = year;
	} // ����, ����, ���꿬���� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	
	public int getYear() {
		return year;
	} // ���꿬���� ���� getter
	
	public String toString() {
		return super.getColor() + " " + super.getPrice() + " " + getYear();
	}

}
