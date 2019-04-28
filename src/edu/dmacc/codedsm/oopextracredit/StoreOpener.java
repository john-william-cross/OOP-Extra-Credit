package edu.dmacc.codedsm.oopextracredit;

import java.util.Objects;

public class StoreOpener implements Opener {

    private String name;
    private String position;

    public StoreOpener(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreOpener that = (StoreOpener) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "StoreOpener{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public void performOpen() {

    }
}

