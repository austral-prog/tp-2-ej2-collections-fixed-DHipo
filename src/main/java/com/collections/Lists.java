package com.collections;

import java.util.List;

public class Lists {

    public static int indexOf(String black, List<String> colors) {
        for (int i = 0; i < colors.size(); i++)
            if (black.equals(colors.get(i))) return i;

        return -1;
    }

    public static int indexOfByIndex(String black, List<String> colors, int i) {
        for (int x = i; x < colors.size(); x++)
            if (black.equals(colors.get(x))) return x;
        return -1;
    }

    public static int indexOfEmpty(List<String> colors1) {
        for (int i = 0; i < colors1.size(); i++)
            if (colors1.get(i).isEmpty()) return i;
        return -1;
    }

    public static int put(String blue, List<String> colors1) {
        for (int i = 0; i < colors1.size(); i++)
            if (colors1.get(i).isEmpty()) colors1.set(i, blue);
        return -1;
    }

    public static int remove(String black, List<String> colors1) {
        int count = 0;

        for (int i = 0; i < colors1.size() && colors1.contains(black); i++)
        {
            if (!colors1.get(i).equals(black)) continue;
            count += 1;
            colors1.remove(i);
        }
        return count;
    }
}
