package com.car.rental.model.car;

/**
 * Created by sindhya on 7/30/17.
 */
public enum TransmissionType {

    MANUAL("Manual"),
    AUTOMATIC("Automatic");

    private String transmissionType;

    TransmissionType(String transmission){
        this.transmissionType=transmission;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
