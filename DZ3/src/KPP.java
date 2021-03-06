
public class KPP {
	
	public static void main(String[] args) {
		
		Car[] cars = new Car[6];
		PassengerVehicle pv;
		CargoVehicle cv;
		int idx = 0;
		
		pv = new PassengerVehicle();
		pv.name = "����";
		pv.speed = 90;
		pv.specTransp = true;
		cars[idx] = pv;
		idx += 1;
		
		pv = new PassengerVehicle();
		pv.name = "Honda";
		pv.specTransp = false;
		pv.speed = 110;
		cars[idx] = pv;
		idx ++;
		
		pv = new PassengerVehicle();
		pv.name = "Mercedes";
		pv.specTransp = false;
		pv.speed = 200;
		cars[idx] = pv;
		idx ++;
		
		cv = new CargoVehicle();
		cv.name = "�����";
		cv.speed = 60;
		cv.specTransp = true;
		cv.height = 3;
		cv.isTrailer = false;
		cv.weight = 5;
		cars[idx] = cv;
		idx ++;
		
		cv = new CargoVehicle();
		cv.name = "MAN";
		cv.height = 4;
		cv.isTrailer = true;
		cv.specTransp = false;
		cv.speed = 90;
		cv.weight = 15;
		cars[idx] = cv;
		idx ++;
		
		cv = new CargoVehicle();
		cv.name = "IVECO";
		cv.height = 5;
		cv.isTrailer = false;
		cv.specTransp = false;
		cv.speed = 50;
		cv.weight = 15;
		cars[idx] = cv;
		idx ++;
		
		for (Car allCars : cars){
			try {		
				allCars.printCarInfo();//���������� �� ����������
				System.out.println("��������� �������: " + allCars.calculateTarif() + " ���.");
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
