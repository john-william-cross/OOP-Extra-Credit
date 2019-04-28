package edu.dmacc.codedsm.oopextracredit;

public class Runner {
    public static void main(String[] args) {

        StoreOpener validStoreOpener = new StoreOpener("Tim", "poop-scooper");
        ConvenienceStore convenienceStore = new ConvenienceStore();
        if (convenienceStore.openStore(validStoreOpener.getName())) {
            System.out.println("Store was opened.");
        } else {
            System.out.println("Store was not opened.");
        }

        /*StoreOpener anotherValidStoreOpener = new StoreOpener("Jack", "eye-candy");  <--
        DepartmentStore departmentStore = new DepartmentStore();                       <--  different implementation of Opener
        departmentStore.openStore(anotherValidStoreOpener.getName());                  <--

        /*StoreOpener someoneElse = new StoreOpener("Candy", "manager");               <--
        ShoeStore shoeStore = new ShoeStore();                                         <--   was harder to think of different impl this time
        shoeStore.openStore(someoneElse.getName());                                    <--
        */

    }
}
/*
Extra Credit
Create a program that demonstrates your knowledge of OOP by
* Creating a Runner with a main method
* Create three subclasses of the following type that represents a Store
    public abstract class Store {
        public abstract boolean openStore(String employeeName);
    }
    * each subclass should have a different implementation of openStore
* Create an implementation of the following that represents someone who can open the store
    public interface Openner {
        void performOpen();
    }
* Modify your Openner implementation to have properly encapsulated fields for a string name and string position
* Pick one of your Store subclasses and have the name from a new instance of your Openner implementation passed into the openStore method in your Runner main method.
* Make sure there is enough being written to the console that the user can tell what is happening.
 */