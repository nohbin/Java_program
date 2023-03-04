package day5;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {

	private static List<Car> findCars(List<Car> all, CarPredicate cp) {
		List<Car> result = new ArrayList<>();
		for (Car car : all) {
			if (cp.test(car)) {
				result.add(car);
			}
		}

		return result;
	}

	private static void printCars(List<Car> all, CarConsumor cc) {
		
		for (Car car : all) {
			cc.apply(car);
		}
	}

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<>();
		carList.add(new Car("그랜져", true, 12, 240000));
		carList.add(new Car("소나타", true, 2, 40000));
		carList.add(new Car("아반떼", true, 8, 160000));
		carList.add(new Car("포르쉐", false, 15, 300000));
		carList.add(new Car("페라리", false, 20, 400000));

		// 디젤 자동차만 찾기.

		List<Car> cars = findCars(carList, c -> !c.isGasoline());
		
		printCars(cars, c -> System.out.println(c));
		
		// 연식이 10년 이상
		
		List<Car> car = findCars(carList, c -> c.getAge()>10);
		printCars(car, c -> System.out.println(c));
		
		// 디젤 중 10년 이상 
		// 람다식 문장에 && 사용
		
		
		List<Car> car1 = findCars(carList, c -> c.getAge()>10 && !c.isGasoline());
		printCars(car1, c -> System.out.println(c));
		
		
		
		
		
	}
}
