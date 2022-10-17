package JunitAndMockito.CalculatorJunit;

import JunitAndMockito.CalculatorJunit.CalcService;
import JunitAndMockito.CalculatorJunit.Calculator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    Calculator calculator;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Mock
    CalcService service;

    @Before
    public void setUp() {
        this.calculator = new Calculator(service);
    }

    @Test
    public void TestAddition(){
        when(service.add(2,1)).thenReturn(3);
        assertEquals(3, calculator.performAddition(2,1) );
        verify(service).add(2,1);
    }

    @Test
    public void TestSubtraction(){
        when(service.subtract(5,4)).thenReturn(1);
        assertEquals(1, calculator.performSubtraction(5,4));
    }

    @Test
    public void TestMultiplication(){
        when(service.multiply(5,10)).thenReturn(50);
        assertEquals(50, calculator.performMultiplication(5,10));
    }

}
