package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel>=0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPages = 0;
        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int ink) {
        if (ink > 0 && ink <= 100) {
           return this.tonerLevel = this.tonerLevel + ink;
        } else {
            return -1;
        }
    }

    public void printPage() {
        this.numberOfPages++;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
}
