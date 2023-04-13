package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.w3c.dom.ranges.Range;
public class SquareRootTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/root.csv")
    public void FindsСalcSQRT(int quantity,int minRange, int maxRange) {
        SquareRoot service = new SquareRoot();

        int Range = service.calcSQRT(minRange,maxRange);
        Assertions.assertEquals(Range,quantity);
    }
}



