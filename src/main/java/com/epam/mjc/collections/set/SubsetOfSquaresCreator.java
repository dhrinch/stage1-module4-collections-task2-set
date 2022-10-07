package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squares = new TreeSet<>();
        for (Integer number : sourceList) {
            squares.add(number * number);
        }
        NavigableSet<Integer> subset = squares.subSet(lowerBound, true, upperBound, true);
        return subset;
    }
}
