package com.demopackage;

public class OOPDemo01 {
    public static void main(String[] args) {

//        // define hp book
//        Book harryPotter = new Book("Harry 01. Goblet of fire", 784);
//        // print summary
//        harryPotter.shortSummary();
//
//        // define hp book
//        Book programming = new Book("Programming 101", 56);
//        // print summary
//        programming.shortSummary();

        // car book
        CarBook carBook = new CarBook("MY fav. car", 55, "Toyota");
        carBook.shortSummary();
        carBook.printCarModel();
        carBook.longSummary();

        // history book
        HistoryBook historyBook = new HistoryBook("MY fav. history book", 55, "20th century");
        historyBook.shortSummary();
        historyBook.printCentury();
        historyBook.longSummary();

        // interface example
        CountryTime time;

        time = new LatviaTime();
        System.out.println("Time in latvia: " + time.currentTime());

        time = new USATime();
        System.out.println("Time in USA: " + time.currentTime());
    }
}

interface CountryTime {
    public String currentTime();
    public boolean isHoliday();
}

class LatviaTime implements CountryTime {
    public String currentTime() {
        return "20:30";
    }

    public boolean isHoliday() {
        return false;
    }
}

class USATime implements CountryTime {
    public String currentTime() {
        return "10:30";
    }

    public boolean isHoliday() {
        return true;
    }
}


abstract class Book {
    String title;
    int pages;

    abstract public void longSummary();

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void shortSummary() {
        System.out.println("Title = " + title + "; Pages = " + pages);
    }
}

class CarBook extends Book {
    String carModel;

    CarBook(String title, int pages, String carModel) {
        super(title, pages);
        this.carModel = carModel;
    }

    public void printCarModel() {
        System.out.println("Car model is: " + carModel);
    }

    public void longSummary() {
        System.out.println("FULL SUMMARY --- " +
            "Title = " + title + "; Pages = " + pages +
            "; Car model = " + carModel);
    }
}

class HistoryBook extends Book {
    String century;

    HistoryBook(String title, int pages, String century) {
        super(title, pages);
        this.century = century;
    }

    public void printCentury() {
        System.out.println("Century is: " + century);
    }

    public void longSummary() {
        System.out.println("FULL SUMMARY --- " +
                "Title = " + title + "; Pages = " + pages +
                "; Century = " + century);
    }
}
