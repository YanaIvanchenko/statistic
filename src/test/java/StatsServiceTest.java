import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void mustCalculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.getSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustCalcAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAvg = 15;
        long actualAvg = service.getAverageSales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void mustNumberMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumber = 8;
        int actualNumber = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void mustNumberMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumber = 9;
        int actualNumber = service.getMinMonth(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void mustQuantityMonthBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantity = 5;
        int actualQuantity = service.numberMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void mustQuantityMonthAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantity = 5;
        int actualQuantity = service.numberMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

}
