package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fibonacci {

    public  List<Integer> array=new ArrayList<>();

    public  int fib(int n) {
        int nr1 = 0, nr2 = 1, c;
        if (n == 0)
            return nr1;
        for (int i = 2; i <= n; i++) {
            c = nr1 + nr2;
            nr1 = nr2;
            nr2 = c;
        }
        return nr2;
    }

    public Stream<Integer> getFibonacciSeries() {
        for (int i = 0; i < 100; i++) {
            array.add(fib(i));
        }
        return array.stream();
    }

}
