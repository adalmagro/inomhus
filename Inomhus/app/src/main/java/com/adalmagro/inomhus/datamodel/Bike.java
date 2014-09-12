package com.adalmagro.inomhus.datamodel;

import java.util.Vector;

/**
 * Created by arturo.diaz on 08/09/2014.
 */
public class Bike {

    private class Crank {
        protected Vector<Integer> teeth; //0-small; 1-mid; 2-big

        Crank(int numPlates) {
            this.teeths = new Vector<Integer>(numPlates);
        }

        /**
         *
         * @return Number of plates. -1 if not configured
         */
        int getNumPlates() {
            if (teeth != null) {
                return teeth.size();
            }
            else {
                return -1;
            }
        }

        int setTeethOf(int plate, int teeth) {
            if (this.teeth == null) {
                this.teeth = new Vector<Integer>(plate+1);
            }
            if (plate > 0 && plate < getNumPlates()-1) {
                return teeth.set(plate, new Integer(teeth));
            } else {
                return -1;
            }
        }

        int getTeethOf(int plate) {
            if (plate > 0 && plate < getNumPlates()-1) {
                return teeth.get(plate);
            } else {
                return -1;
            }
        }
    }

    private class Cassette {
        protected Vector<Integer> cassette;

        Cassette(int num) {
            cassette = new Vector<Integer>(num);
        }

        int setTeethOf(int ring, int teeth) {
            if (this.cassette == null) {
                this.cassette = new Vector<Integer>(ring+1);
            }
            if (ring > 0 && ring < getNumRings()-1) {
                return cassette.set(ring, new Integer(teeth));
            } else {
                return -1;
            }
        }

        int getTeethOf(int ring) {
            if (ring > 0 && ring < getNumRings()-1) {
                return cassette.get(ring);
            } else {
                return -1;
            }
        }

        int getNumRings() {
            if (cassette != null) {
                return cassette.size();
            }
            else {
                return -1;
            }
        }
    }
    private int wheelSize; // in milimeters
    private int crankPlates;

}
