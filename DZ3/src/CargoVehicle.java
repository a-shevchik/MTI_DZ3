
public class CargoVehicle extends Car { //�������� ����������
	boolean isTrailer; //������� �������
	int Height; //������ ����������
	int Weight; //��� ����������
	
	
	//����� �������� ������ ����������
	public void controlheight() {
		RuntimeException he;
		
		if (Height > 4) {
			he = new RuntimeException("������������ ������");
			throw he;
		}
	}

	//����� �������� ���� ����������
		public int controlweight() {
			
			if (Weight > 10) {
				System.out.println("������� �� ���������� ����: 800 ���.");
				return 800;
			}
			else return 0;
		}
		
	//������ ��������� �������
	public int calculatetarif() {
		int result;
		
		if (super.SpecTransp) return 0;
		else {
			//�������� ������:
			controlheight();
			//�������� ��������:
			result=controlspeed();
			//��� �������� ���� ��������� ������� - 2000 ���.
			result+=2000;
			if (isTrailer) {//������� �� ������
				System.out.println("������� �� ������� �������: 500 ���.");
				result+=500;
			}
			result+=controlweight();//������� �� ���
			return result;
		}
				
				
		
	}

	
	//����� ���������� �� ����������
	public void printcarinfo() {
			System.out.println("������������ ����������: " + super.Name);
			System.out.println("�������������: " + (super.SpecTransp ? "��" : "���"));
			System.out.println("�������� ����������: " + super.Speed + " ��/�");
			System.out.println("������� �������: " + (isTrailer ? "��" : "���"));
			System.out.println("������ ����������: " + Height + " �.");
			System.out.println("��� ����������: " + Weight + " �.");
		}

}
