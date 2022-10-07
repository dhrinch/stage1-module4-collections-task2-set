package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
    Set<String> mix = new HashSet<>();
        for (String s : thirdSet) {
            if (!secondSet.contains(s) && !firstSet.contains(s)){
                mix.add(s);
            }
        }
        for (String s : secondSet) {
            if (firstSet.contains(s) && !thirdSet.contains(s)){
                mix.add(s);
            }
        }
        return mix;
    }
}
