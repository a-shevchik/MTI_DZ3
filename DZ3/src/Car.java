
abstract class Car {
	String name; //������������ ����������
	boolean specTransp; //�������������
	int speed; //������� �������� ����������

	abstract void printCarInfo();
	abstract int calculateTarif();
	
	//����� �������� �������� ����������
	public int controlSpeed() {
		if (speed > 180) {
			throw new RuntimeException("���������� ������������ ��������. �������� ������� �����.");
		}
		else {
			if (speed > 80) {
				System.out.println("����� �� ���������� ��������: 500 ���.");
				return 500; //����� 500 ���.
			}
			else return 0;
			
		}
	}
	
	
}
