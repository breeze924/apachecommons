package com.sample.apache.commons.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
/**
 * @author chenxiaofeng
 * @version 1.0
 * @created 18/8/21.
 */
public class TestDriveVehicle implements Command {
    public boolean execute(Context ctx) throws Exception {
        System.out.println("Test drive the vehicle");
        return false;
    }
}
