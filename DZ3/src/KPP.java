
public class KPP {
	
	public static void main(String[] args) {
		
		
		PassengerVehicle[] passcars = new PassengerVehicle[3];
		
		passcars[0] = new PassengerVehicle();
		passcars[0].Name = "����";
		passcars[0].Speed = 90;
		passcars[0].SpecTransp = true;
		
		passcars[1] = new PassengerVehicle();
		passcars[1].Name = "Honda";
		passcars[1].SpecTransp = false;
		passcars[1].Speed = 110;
		
		passcars[2] = new PassengerVehicle();
		passcars[2].Name = "Mercedes";
		passcars[2].SpecTransp = false;
		passcars[2].Speed = 200;
		
		CargoVehicle[] cargcars = new CargoVehicle[3];

		cargcars[0] = new CargoVehicle();
		cargcars[0].Name = "�����";
		cargcars[0].Speed = 60;
		cargcars[0].SpecTransp = true;
		cargcars[0].Height = 3;
		cargcars[0].isTrailer = false;
		cargcars[0].Weight = 5;
		
		cargcars[1] = new CargoVehicle();
		cargcars[1].Name = "MAN";
		cargcars[1].Height = 4;
		cargcars[1].isTrailer = true;
		cargcars[1].SpecTransp = false;
		cargcars[1].Speed = 90;
		cargcars[1].Weight = 15;
		
		cargcars[2] = new CargoVehicle();
		cargcars[2].Name = "IVECO";
		cargcars[2].Height = 5;
		cargcars[2].isTrailer = false;
		cargcars[2].SpecTransp = false;
		cargcars[2].Speed = 50;
		cargcars[2].Weight = 15;
		
		for (PassengerVehicle ps : passcars){
			try {		
				ps.printcarinfo();//���������� �� ����������
				System.out.println("��������� �������: " + ps.calculatetarif() + " ���.");
			}
			catch (RuntimeException e) {
				System.out.println("���������� ������� ����������: " + e);
			}
			finally {
				System.out.println();
			}
			
		}

		for (CargoVehicle cr : cargcars){
			try {		
				cr.printcarinfo();//���������� �� ����������
				System.out.println("��������� �������: " + cr.calculatetarif() + " ���.");
			}
			catch (RuntimeException e) {
				System.out.println("���������� ������� ����������: " + e);
			}
			finally {
				System.out.println();
			}
			
		}

		
		

			
		
	}

}
