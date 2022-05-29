package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        boolean res = false;
        if (!check.contains(str)) {
            check.add(index, str);
            res = true;
        }
        return res;
    }
}
