package org.appfuse.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.junit.client.GWTTestCase;

public abstract class AbstractGwtTestCase extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "org.appfuse.Autocomplete";
    }

    /**
     * Global setUp to print out test that's being executed. This allows
     * developers to see where stack traces are coming from in the TestSuite
     * logs.
     */
    @Override
    public void gwtSetUp() throws Exception {
        super.gwtSetUp();
        System.out.println("Running " + this.getClass().getName() + "...");
    }

}
