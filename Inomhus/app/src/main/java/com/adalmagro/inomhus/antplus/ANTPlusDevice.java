package com.adalmagro.inomhus.antplus;

import java.util.HashMap;

/**
 * Created by arturo.diaz on 22/09/2014.
 */
public abstract class ANTPlusDevice {

    private enum DeviceType {   HEARTRATE,
                                CADENCE,
                                SPEED,
                                CADENCE_AND_SPEED,
                                TEMPERATURE,
                                POWER
                             }

    private DeviceType m_deviceType;
    private String m_ID;

    private HashMap<Float> m_timeStampedValues;

    public ANTPlusDevice(DeviceType type, String ID){
        m_deviceType = type;
        m_ID = ID;
        m_timeStampedValues = new HashMap<Float>();
    }


}
