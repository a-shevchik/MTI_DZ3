
public class CargoVehicle extends Car { //Грузовые автомобили
	boolean isTrailer; //Наличие прицепа
	int Height; //Высота автомобиля
	int Weight; //Вес автомобиля
	
	
	//Метод контроля высоты автомобиля
	public void controlheight() {
		RuntimeException he;
		
		if (Height > 4) {
			he = new RuntimeException("Недопустимая высота");
			throw he;
		}
	}

	//Метод контроля веса автомобиля
		public int controlweight() {
			
			if (Weight > 10) {
				System.out.println("Доплата за превышение веса: 800 руб.");
				return 800;
			}
			else return 0;
		}
		
	//Расчет стоимости проезда
	public int calculatetarif() {
		int result;
		
		if (super.SpecTransp) return 0;
		else {
			//Контроль высоты:
			controlheight();
			//Контроль скорости:
			result=controlspeed();
			//Для грузовых авто стоимость проезда - 2000 руб.
			result+=2000;
			if (isTrailer) {//Доплата за прицеп
				System.out.println("Доплата за наличие прицепа: 500 руб.");
				result+=500;
			}
			result+=controlweight();//Доплата за вес
			return result;
		}
				
				
		
	}

	
	//Вывод информации об автомобиле
	public void printcarinfo() {
			System.out.println("Наименование автомобиля: " + super.Name);
			System.out.println("Спецтранспорт: " + (super.SpecTransp ? "Да" : "Нет"));
			System.out.println("Скорость автомобиля: " + super.Speed + " км/ч");
			System.out.println("Наличие прицепа: " + (isTrailer ? "Да" : "Нет"));
			System.out.println("Высота автомобиля: " + Height + " м.");
			System.out.println("Вес автомобиля: " + Weight + " т.");
		}

}
