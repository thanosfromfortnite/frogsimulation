package com.company;

public class FrogSimulation {
    private int maxHops, goalDistance;
    int[] testHops;
    int nextHopIndex;

    public FrogSimulation(int goal, int mHops) {
        this.maxHops = mHops;
        this.goalDistance = goal;
    }

    public int hopDistance() {
        return (testHops[nextHopIndex]);
    }

    public boolean simulate() {
        int frogDistance = 0;
        for (int i = 0; i < maxHops; i ++) {
            frogDistance += hopDistance();
            if (frogDistance >= goalDistance) {
                return true;
            }
            if (frogDistance < 0) {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        int successes = 0;
        for (int i = 0; i < num; i ++) {
            if (simulate()) {
                successes ++;
            }
        }
        return successes / num;
    }
}
