package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        boolean res = false;
        int inputOne = list.indexOf(str);
        int inputTwo = list.lastIndexOf(str);
        if (list.indexOf(str) != -1) {
            if (inputOne == inputTwo) {
                res = true;
            }
        }
        return res;
    }
}
