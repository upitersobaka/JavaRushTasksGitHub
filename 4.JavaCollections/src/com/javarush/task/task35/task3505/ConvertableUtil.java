package com.javarush.task.task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertableUtil {

    public static <K> Map convert(List<? extends Convertable<K>> list) {
        Map<K, Convertable<K>> result = new HashMap<>();
        list.forEach((convertable) -> result.put(convertable.getKey(), convertable));
        return result;
    }
}
