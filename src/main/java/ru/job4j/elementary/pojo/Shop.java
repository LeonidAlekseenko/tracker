package ru.job4j.elementary.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int res = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                res = i;
                break;
            }
        }
        return  res;
    }
}
