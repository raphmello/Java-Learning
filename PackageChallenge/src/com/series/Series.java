package com.series;

public class Series {

    public int nSum (int n) {
        int sum = 0;
        for (int i = 0;i<=n;i++) {
            sum += i;
        }
        return sum;
    }

    public int factorial (int n) {
        int product = 1;
        if (n==1) {
            return 0;
        }
        for (int i = 1;i<=n;i++) {
            product *= i;
        }
        return product;
    }

    public int fibonacci(int n) {
        for (int i = n;i >= 0;i--) {
            if (i == 0) {
                return 0;
            } else if (i == 1) {
                return 1;
            } else {
                return fibonacci(i-1) + fibonacci(i-2);
            }
        }
        return 0;

    }

}
