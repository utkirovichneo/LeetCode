package com.tolik.problems;

public class FinalValueofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if(operation.equalsIgnoreCase("++X") || operation.equalsIgnoreCase("X++"))
                result++;
            else result--;
        }
        return result;
    }
}
