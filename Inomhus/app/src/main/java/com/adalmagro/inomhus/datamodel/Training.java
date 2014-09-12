package com.adalmagro.inomhus.datamodel;

/**
 * Created by arturo.diaz on 08/09/2014.
 */
public class Training {

    protected class Step {
        protected int time; // in milis
        protected Range hrRange;
        protected Range cadRange;
        protected Range spdRange;
        protected Range pwrRange;
    }

    protected class Range {
        private float minValue;
        private float maxValue;

        protected Range(float minValue, float maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        boolean checkInRange(float value) {
            if (value >= minValue && value <= maxValue) {
                return true;
            } else {
                return false;
            }
        }
    }

    private List<Step> steps;

    public Training() {
        this.steps = new List<Step>();
    }
}
