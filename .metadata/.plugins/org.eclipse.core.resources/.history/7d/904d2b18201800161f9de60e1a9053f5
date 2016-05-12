
public class PassengerVehicle extends Car {
	//Легковые автомобили

			
	//Расчет стоимости проезда
	public int calculatetarif() {
		int result;
		
		if (super.SpecTransp) return 0;
		else {
			//Контроль скорости:
			result=controlspeed();
			//Для легковых авто стоимость проезда - 1000 руб.
			result+=1000;
			return result;
		}
				
				
		
	}
	
	//Вывод информации об автомобиле
	public void printcarinfo() {
			System.out.println("Наименование автомобиля: " + super.Name);
			System.out.println("Спецтранспорт: " + (super.SpecTransp ? "Да" : "Нет"));
			System.out.println("Скорость автомобиля: " + super.Speed + " км/ч");
		}
}
