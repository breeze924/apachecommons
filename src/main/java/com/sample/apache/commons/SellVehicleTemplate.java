package com.sample.apache.commons;

/**
 * @author chenxiaofeng
 * @version 1.0
 * @created 18/8/21.
 */
public abstract class SellVehicleTemplate {

    public void sellVehicle() {
        getCustomerInfo();
        testDriveVehicle();
        negotiateSale();
        arrangeFinancing();
        closeSale();
    }

    public abstract void getCustomerInfo();

    public abstract void testDriveVehicle();

    public abstract void negotiateSale();

    public abstract void arrangeFinancing();

    public abstract void closeSale();
}
