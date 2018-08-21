package com.sample.apache.commons;

import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.config.ConfigParser;
import org.apache.commons.chain.impl.CatalogFactoryBase;
import org.apache.commons.chain.impl.ContextBase;

/**
 * @author chenxiaofeng
 * @version 1.0
 * @created 18/8/21.
 */
public class CatalogLoader {
    private static final String CONFIG_FILE = "/chain-config.xml";

    private ConfigParser parser;

    private Catalog catalog;

    public CatalogLoader() {
        parser = new ConfigParser();
    }

    public Catalog getCatalog() throws Exception {
        if (catalog == null) {
            parser.parse(this.getClass().getResource(CONFIG_FILE));
        }
        catalog = CatalogFactoryBase.getInstance().getCatalog("auto-sales");
        return catalog;
    }

    public static void main(String[] args) throws Exception {

        CatalogLoader loader = new CatalogLoader();
        Catalog sampleCatalog = loader.getCatalog();
        Command command = sampleCatalog.getCommand("sell-vehicle");
        Context ctx = new ContextBase();
        command.execute(ctx);
    }
}
