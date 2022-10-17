package JunitAndMockito.CalculatorJunit;

public class Calculator {
    CalcService service;

    public Calculator(CalcService service){
        this.service = service;
    }

    public int performAddition(int num1, int num2) {
        return service.add(num1, num2);
    }

    public int performMultiplication(int num1, int num2) {
        return service.multiply(num1, num2);
    }

    public int performSubtraction(int num1, int num2) {
        return service.subtract(num1, num2);
    }



}
