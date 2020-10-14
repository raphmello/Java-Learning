package com.company;

public class Main {
    private static StockList list = new StockList();

    public static void main(String[] args) {
        StockItem item1 = new StockItem("teste1",10,2);
        StockItem item2 = new StockItem("teste2",30,2);
        list.addStock(item1);
        list.addStock(item2);
        System.out.println(list);
    }
}
