package com.sample.apache.commons.chains;

import com.sample.apache.commons.commands.ArrangeFinacing;
import com.sample.apache.commons.commands.CloseSale;
import com.sample.apache.commons.commands.GetCustomerInfo;
import com.sample.apache.commons.commands.NegotiateSale;
import com.sample.apache.commons.commands.TestDriveVehicle;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

/**
 * @author chenxiaofeng
 * @version 1.0
 * @created 18/8/21.
 */
public class SellVehicleChain extends ChainBase {
    public SellVehicleChain() {
        super();
        addCommand(new GetCustomerInfo());
        addCommand(new TestDriveVehicle());
        addCommand(new NegotiateSale());
        addCommand(new ArrangeFinacing());
        addCommand(new CloseSale());
    }

    public static void main(String[] args) throws Exception {
        Command process = new SellVehicleChain();
        Context ctx = new ContextBase();
        process.execute(ctx);
    }
}
