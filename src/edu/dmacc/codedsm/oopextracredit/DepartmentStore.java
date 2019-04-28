package edu.dmacc.codedsm.oopextracredit;

public class DepartmentStore extends Store {

    @Override
    public boolean openStore(String employeeName) {

        String opener = employeeName;
        System.out.println(opener + " is here, but the store has been closed due to flooding.");
        return opener.contains(employeeName);

    }
}
