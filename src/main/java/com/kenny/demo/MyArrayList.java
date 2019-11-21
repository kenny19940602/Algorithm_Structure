package com.kenny.demo;

import java.util.Arrays;

/**
 * ClassName: MyArrayList
 * Function:  基于数组实现的集合
 * Date:      2019/11/20 15:56
 * @author     Kenny
 * version    V1.0
 */
public class MyArrayList<E> {
    private Object[] elementData = {};
    private int size = 0;

    /**
     * 追加元素
     * @param e
     * @return
     */
    public boolean add(E e) {
        expand();
        elementData[size++] = e;
        return true;
    }

    public boolean add(int index, E e) {
        expand();
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = e;
        size++;
        return true;
    }

    private void expand() {
        if (size == 0) {
            elementData = new Object[10];
        }
        if (size == elementData.length) {
            elementData = Arrays.copyOf(elementData, size + (size >> 1));
        }
    }

    public E remove(int index) {
        E e = (E) elementData[index];
        for (int i = index + 1; i < size; i++) {
            elementData[i - 1] = elementData[i];
        }
        elementData[--size] = null;
        return e;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        builder.append(elementData[0]);
        for (int i = 1; i < size; i++) {
            builder.append(", ").append(elementData[i]);
        }
        builder.append("]");
        return builder.toString();
    }

}
