package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {

        if (o==null) return false;

        if(o== this) return true;

        if  (getClass() != o.getClass()) {
            return false;
        }

        if (!(o instanceof Solution))
            return false;

        Solution solution = (Solution) o;

        return (first != null ? first.equals(solution.first) : solution.first == null) && (last != null
                ? last.equals(solution.last) : solution.last == null);


    }

    @Override
    public int hashCode() {
        //  return 31 * first.hashCode() + last.hashCode();

        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
