public static double basicCalculator(Operation operation, int num1, int num2){
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
        
