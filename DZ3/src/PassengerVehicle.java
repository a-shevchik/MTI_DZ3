
public class PassengerVehicle extends Car {
	//�������� ����������

	
			
	//������ ��������� �������
	public int calculateTarif() {
		int result;
		
		if (super.specTransp) return 0;
		else {
			//�������� ��������:
			result=controlSpeed();
			//��� �������� ���� ��������� ������� - 1000 ���.
			result+=1000;
			return result;
		}
	}
	
	//����� ���������� �� ����������
	public void printCarInfo() {
			System.out.println("������������ ����������: " + super.name);
			System.out.println("�������������: " + (super.specTransp ? "��" : "���"));
			System.out.println("�������� ����������: " + super.speed + " ��/�");
		}
}
