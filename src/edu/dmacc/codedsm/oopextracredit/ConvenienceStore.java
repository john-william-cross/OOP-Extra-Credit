package edu.dmacc.codedsm.oopextracredit;

import java.util.ArrayList;
import java.util.List;

public class ConvenienceStore extends Store {

    @Override
    public boolean openStore(String employeeName) {
        List<String> openers = new ArrayList<String>();
        openers.add("John");
        openers.add("Tim");
        openers.add("Katelin");

        return openers.contains(employeeName);

    }
}
