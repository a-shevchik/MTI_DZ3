
public class Car {
	String Name; //Наименование автомобиля
	boolean SpecTransp; //Спецтранспорт
	int Speed; //Текущая скорость автомобиля

	//Метод контроля скорости автомобиля
	public int controlspeed() {
		RuntimeException se;
		if (Speed > 180) {
			se = new RuntimeException("Превышение максимальной скорости. Вызываем патруль ГИБДД.");
			throw se;
		}
		else {
			if (Speed > 80) {
				System.out.println("Штраф за превышение скорости: 500 руб.");
				return 500; //Штраф 500 руб.
			}
			else return 0;
			
		}
	}
}
