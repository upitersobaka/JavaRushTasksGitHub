package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    private static final String LEFT = "LEFT_CHILD";
    private static final String RIGHT = "RIGHT_CHILD";

    Entry<String> root = new Entry<>("Root");




    public String get(int index) {
        throw new UnsupportedOperationException();
        //return null;
    }

    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }



    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        int count = -1;

        Queue<Entry<String>> nodes = new LinkedList<>(Collections.singletonList(root));

        while (!nodes.isEmpty()) {
            Entry<String> node = nodes.poll();
            count++;

            if (node.leftChild != null)
                nodes.offer(node.leftChild);
            if (node.rightChild != null)
                nodes.offer(node.rightChild);
        }

        return count;
    }

    private boolean appendChild(String s, Entry<String> node, final String child) {
        switch (child) {
            case LEFT: {
                node.leftChild = new Entry<>(s);
                node.leftChild.parent = node;
                node.checkChildren();
                return true;
            }

            case RIGHT: {
                node.rightChild = new Entry<>(s);
                node.rightChild.parent = node;
                node.checkChildren();
                return true;
            }
        }

        return false;
    }
    @Override
    public boolean add(String s) {
        Queue<Entry<String>> nodes = new LinkedList<>(Collections.singletonList(root));

        while (!nodes.isEmpty()) {
            Entry<String> currentNode = nodes.poll();

            if (currentNode.isAvailableToAddChildren()) {
                if (currentNode.availableToAddLeftChildren)
                    return appendChild(s, currentNode, LEFT);
                if (currentNode.availableToAddRightChildren)
                    return appendChild(s, currentNode, RIGHT);
            } else {
                if (currentNode.leftChild != null)
                    nodes.offer(currentNode.leftChild);
                if (currentNode.rightChild != null)
                    nodes.offer(currentNode.rightChild);
            }
        }

        return false;
    }


    @Override
    public boolean remove(Object o) {
        if (!o.getClass().getSimpleName().equals("String"))
            throw new UnsupportedOperationException("Можно добавлять только строки.");

        Queue<Entry<String>> nodes = new LinkedList<>(Collections.singletonList(root));

        while (!nodes.isEmpty()) {
            Entry<String> node = nodes.poll();

            if (node.elementName.equals(o)) {
                if (node.parent.leftChild == node) {
                    node.parent.leftChild = null;
                    node.parent.availableToAddLeftChildren = true;
                }

                if (node.parent.rightChild == node) {
                    node.parent.rightChild = null;
                    node.parent.availableToAddRightChildren = true;
                }

                // restoreCorruptedNodes(); // если обрублены все узлы, освобождает нижний уровень для добавления новых элементов.

                return true;
            }

            if (node.leftChild != null)
                nodes.offer(node.leftChild);
            if (node.rightChild != null)
                nodes.offer(node.rightChild);
        }

        return false;
    }
    public String getParent(String elementName) {
        Queue<Entry<String>> nodes = new LinkedList<>(Collections.singletonList(root));

        while (!nodes.isEmpty()) {
            Entry<String> node = nodes.poll();

            if (node.elementName.equals(elementName))
                return node.parent.elementName;

            if (node.leftChild != null)
                nodes.offer(node.leftChild);
            if (node.rightChild != null)
                nodes.offer(node.rightChild);
        }

        return null;
    }
    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
        //return super.addAll(index, c);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
        //return super.subList(fromIndex, toIndex);
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
        //super.removeRange(fromIndex, toIndex);
    }

    static class Entry<T> implements Serializable {
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren() {
            if (leftChild != null)
                availableToAddLeftChildren = false;
            if (rightChild != null)
                availableToAddRightChildren = false;
        }

        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }

    /*
    public static void main(String[] args) {
        AbstractList<String> myList = new LinkedList<String>();
        for (int i=1; i<16; i++){
            myList.add(String.valueOf(i));
        }

        System.out.println("Elements in the AbstractList class = " + myList);
    } */
}
