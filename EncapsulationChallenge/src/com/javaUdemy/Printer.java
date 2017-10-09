package com.javaUdemy;

public class Printer {

    private int tonnerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonnerLevel, boolean duplex) {
        if(tonnerLevel >=-1 && tonnerLevel<=100)
            this.tonnerLevel = tonnerLevel;
        else
            this.tonnerLevel = -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }


    public int addTonner(int tonnerAmount) {
        if (tonnerAmount > 0 && tonnerAmount <=100 ) {
            if (this.tonnerLevel + tonnerAmount > 100)
                return -1;
            this.tonnerLevel += tonnerAmount;
            return this.tonnerLevel;
        }
        else
            return -1;
    }

    public int printPages(int pages) {
        if (this.duplex) {
            pages = pages/2;
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pages;
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
