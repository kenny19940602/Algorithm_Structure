package com.kenny.demo;

/**
 * ClassName: MyLinkedList
 * Function:  基于链表实现的集合
 * Date:      2019/11/20 16:24
 * @author     Kenny
 * version    V1.0
 */
public class MyLinkedList<E> {
    private Node head;
    private int size = 0;

    private class Node {
        E data;
        Node next;
        Node prev;
        public Node(E data) {
            this.data = data;
        }
    }

    /**
     * 追加元素方法
     * @param e
     * @return
     */
    public boolean add(E e) {
        //添加第一个元素
        if (head == null) {
            head = new Node(e);
            //创建循环关系
            head.next = head;
            head.prev = head;
            size++;
            return true;
        } else {
            Node last = head.prev;
            Node node = new Node(e);
            head.prev = node;
            node.prev = last;
            last.next = node;
            node.next = head;
            size++;
            return true;
        }
    }

    /**
     * 插入元素算法
     * @param index
     * @param e
     * @return
     */
    public boolean add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            return add(e);
        }
        Node node = find(index);
        Node next = node;
        Node prev = node.prev;
        node = new Node(e);
        prev.next = node;
        node.next = next;
        node.prev = node;
        node.prev = prev;
        size++;
        if (index == 0) {
            head = node;
        }
        return true;
    }

    /**
     * 查找插入位置
     * @param index
     * @return
     */
    private Node find(int index) {
        Node node;
        if (index > size >> 1) {//反向查找
            node = head.prev;
            for (int i = 0; i < index; i++) {
                node = node.prev;
            }
        } else {//正向查找
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        return node;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = find(index);
        E e = node.data;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        if (index == 0) {
            head = node.next;
        }
        node.next = null;
        node.prev = null;
        size--;
        return e;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        builder.append(head.data);
        Node node = head.next;
        for (int i = 0; i < size; i++) {
            builder.append(", ").append(node.data);
        }
        return builder.append("]").toString();
    }
}
