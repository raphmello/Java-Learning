package com.company;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String,StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = list.getOrDefault(item.getName(),item);
            if (inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(),item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item,null);
        if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return  0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String,StockItem> items() {
        return Collections.unmodifiableMap(list);
    }


    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem +". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }
//        System.out.println(s + "Total stock value " + totalCost);
        //testing another way of printing
        s = "\nStock List\n";
        totalCost = 0.0;
        for (String item : list.keySet()) {
            double itemValue = list.get(item).getPrice() * list.get(item).quantityInStock();

            s = s + list.get(item) +". There are " + list.get(item).quantityInStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f" ,itemValue) + "\n";
            totalCost += itemValue;
        }
//        System.out.println(s + "Total stock value " + totalCost);

        return s + "Total stock value " + totalCost;

    }
}
