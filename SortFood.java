package bsu.rfe.java.group10.lab1.Kosymbaev.varB12;

import java.util.*;

public class SortFood  implements Comparator<Food> {
        public int compare(Food arg0, Food arg1) {
            if (arg0==null) return 1;
            if (arg1==null) return -1;
            return arg1.calculateCalories()-arg0.calculateCalories()  ;
        }
    }

