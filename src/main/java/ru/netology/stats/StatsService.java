package ru.netology.stats;

public class StatsService {
    public long getSumSales(long[] sales) {
        long sumSales = 0;

        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;

    }

    public long getAverageSales(long[] sales) {
        return this.getSumSales(sales) / sales.length;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }

        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int numberMonthsBelowAverage(long[] sales) {
        long average = this.getAverageSales(sales);
        int monthsBelowAverage = 0;

        for (long t : sales) {
            if (t < average) {
                monthsBelowAverage++;
            }
        }

        return monthsBelowAverage;
    }

    public int numberMonthsAboveAverage(long[] sales) {
        long average = this.getAverageSales(sales);
        int monthsAboveAverage = 0;

        for (long t : sales) {
            if (t > average) {
                monthsAboveAverage++;
            }
        }

        return monthsAboveAverage;
    }
}