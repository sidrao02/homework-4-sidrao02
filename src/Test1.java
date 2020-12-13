import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(final Operation operation, final int num1, final int num2){
        double result = 0;
	if (operation == ADD){
		result = num1 + num2;
	}
	else if (operation == SUBTRACT){
		result = num1 - num3;
	}
	else if (operation = MULTIPLY){
		result = num1 * num2;
	}
	else{
		if (num2 == 0) {
			System.out.println("Can't divide by 0");
		}
		else {
			result = num1 / num2;
		}
	}

        return result;
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
