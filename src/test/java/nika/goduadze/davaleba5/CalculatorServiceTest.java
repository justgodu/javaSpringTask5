package nika.goduadze.davaleba5;

import nika.goduadze.davaleba5.service.CalculatorService;
import nika.goduadze.davaleba5.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;
    @Test
    public void multiplicationTest()
    {
        calculatorService.multiplication(10,2);
    }
}
