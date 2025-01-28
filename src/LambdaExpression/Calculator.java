package LambdaExpression;

//usage of lambda expression for functional interface
interface CalculatorInterface {

	// void switchOn();
//	void add(int a);
	int subtract(int a, int b);
}

public class Calculator {
	public static void main(String[] args) {
//		CalculatorInterface cal=()-> System.out.println("Cal method");
//		cal.switchOn();

//		CalculatorInterface cal= (a)-> System.out.println("Add "+ a);
//		cal.add(8);

		CalculatorInterface cal = (a, b) -> {
			if(a<b) {
				throw new RuntimeException("error");
			}
			else {
				return a-b;
			}
		};
		System.out.println(cal.subtract(1, 3));

	}
}
