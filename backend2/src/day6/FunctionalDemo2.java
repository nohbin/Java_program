package day6;



import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

import day5.Car;

public class FunctionalDemo2 {

	private static double getAvg(List<Car> a , ToIntFunction<Car>f) {	
		double sumAvg = 0.0;	
		
		for (Car car :	a) {
			sumAvg += f.applyAsInt(car);
		}	
		
		return sumAvg/a.size();	
	}

	public static void main(String[] args) {

		List<Car> carList = new ArrayList<>();
		carList.add(new Car("그랜져", true, 12, 240000));
		carList.add(new Car("소나타", true, 2, 40000));
		carList.add(new Car("아반떼", true, 8, 160000));
		carList.add(new Car("포르쉐", false, 15, 300000));
		carList.add(new Car("페라리", false, 20, 400000));
		
		// 평균 연식
		getAvg(carList,c -> c.getAge() );	
		// 평균 주행거리
		getAvg(carList,c -> c.getMileage() );
		

	}
}
