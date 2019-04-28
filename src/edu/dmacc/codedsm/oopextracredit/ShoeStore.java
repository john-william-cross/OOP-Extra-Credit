package edu.dmacc.codedsm.oopextracredit;

public class ShoeStore extends Store {

    @Override
    public boolean openStore(String employeeName) {

        String opener = employeeName;
        System.out.println(opener + " is here, but due to a severe athlete's foot outbreak, she is too busy to help you.");
        return opener.contains(employeeName);

    }
}