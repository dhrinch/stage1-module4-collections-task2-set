package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer element : sourceList) {
            if (element % 2 != 0) {

                hashSet.add(element * 2);
            }
            while (element % 2 != 1) {
                hashSet.add(element);
                element = element / 2;
                }
            hashSet.add(element);
            }
        return hashSet;
    }
}
