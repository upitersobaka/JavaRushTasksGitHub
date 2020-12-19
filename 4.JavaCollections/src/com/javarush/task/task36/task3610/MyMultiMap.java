package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {

    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return values().size();
    }

    @Override
    public V put(K key, V value) {
        List<V> list = map.get(key);

        if (list == null) {
            list = new ArrayList<>(Collections.singletonList(value));
            map.put(key, list);
            return null;
        }

        V lastElement = list.get(list.size() - 1);

        if (list.size() == repeatCount)
            list.remove(0);

        list.add(value);
        map.put(key, list);
        return lastElement;
    }

//    @Override
//    public V put(K key, V value) {
//        //напишите тут ваш код
//        List<V> values = map.get(key);
//        V oldValue = null;
//
//        if (values == null) {
//            values = new ArrayList<>();
//
//        } else {
//            oldValue = values.get(values.size()-1);
//            if (values.size() == repeatCount)
//                values.remove(0);
//        }
//
//        values.add(value);
//        map.put(key, values);
//        return oldValue;
//
//    }

    @Override
    public V remove(Object key) {
        //напишите тут ваш код
        List<V> values = map.get(key);
        if (values == null)
            return null;

        V storedValue = values.remove(0);

        if (values.size() == 0)
            map.remove(key);

        return storedValue;
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        return map.values().stream().flatMap(List::stream).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.values().stream().flatMap(Collection::stream).anyMatch((v) -> v.equals(value));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() >= 2 ? sb.length() - 2 : sb.length());
        return substring + "}";
    }
}