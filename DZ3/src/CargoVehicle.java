
public class CargoVehicle extends Car { //�������� ����������
	boolean isTrailer; //������� �������
	int height; //������ ����������
	int weight; //��� ����������
	
	

	//����� �������� ������ ����������
	public void controlHeight() {
		
		if (height > 4) {
			throw new RuntimeException("������������ ������");
		}
	}

	//����� �������� ���� ����������
		public int controlWeight() {
			
			if (weight > 10) {
				System.out.println("������� �� ���������� ����: 800 ���.");
				return 800;
			}
			else return 0;
		}
		
	//������ ��������� �������
	public int calculateTarif() {
		int result;
		
		if (super.specTransp) return 0;
		else {
			//�������� ������:
			controlHeight();
			//�������� ��������:
			result=controlSpeed();
			//��� �������� ���� ��������� ������� - 2000 ���.
			result+=2000;
			if (isTrailer) {//������� �� ������
				System.out.println("������� �� ������� �������: 500 ���.");
				result+=500;
			}
			result+=controlWeight();//������� �� ���
			return result;
		}
	}

	
	//����� ���������� �� ����������
	public void printCarInfo() {
			System.out.println("������������ ����������: " + super.name);
			System.out.println("�������������: " + (super.specTransp ? "��" : "���"));
			System.out.println("�������� ����������: " + super.speed + " ��/�");
			System.out.println("������� �������: " + (isTrailer ? "��" : "���"));
			System.out.println("������ ����������: " + height + " �.");
			System.out.println("��� ����������: " + weight + " �.");
		}

}
