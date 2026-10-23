package com.pluralsight;

public class TestStatistic {
    public static void main(String[] args) {
        int[] averageList = {
                78, 65, 98, 87, 75, 100, 82, 84, 96, 70
        };

        System.out.println("=========== Average ===========");
        float average; int sum = 0;
        int length = averageList.length;

        for (int avg : averageList) {
            sum += avg;

        }
        average = (float) sum / length ;
        System.out.println("The average score is " + average);
    }
}
