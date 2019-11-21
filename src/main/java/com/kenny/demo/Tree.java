package com.kenny.demo;

/**
 * ClassName: Tree
 * Function:  二叉树,由于元素需要比较大小,所有元素应该实现
 * Comparable接口
 * E extends Comparable<E>泛型E必须实现Comparable
 * 用于比较两个元素的大小
 * Date:      2019/11/21 8:59
 * @author     Kenny
 * version    V1.0
 */
public class Tree <E extends Comparable<E>>{
    private Node root;
    private int size = 0;

    private class Node {
        E data;
        Node parent;
        Node left;
        Node right;

        public Node(E data) {
            this.data = data;
        }

        boolean addChild(E e) {
            /**
             * 比较数据
             * val == 0 则 e和data相等
             * val > 0 则 e大于data
             * val < 0 则 e小于data
             */
            int var = e.compareTo(data);
            if (var == 0) {
                return false;
            }
            if (var < 0) {
                //向左侧添加节点
                if (left == null) {
                    left = new Node(e);
                    //左侧新节点的父节点是当前节点
                    left.parent = this;
                    size++;
                    return true;
                } else {
                    //如果左侧已经有节点了,就在左侧递归添加子节点
                    return left.addChild(e);
                }
            } else {
                //向右侧添加节点
                if (right == null) {
                    right = new Node(e);
                    right.parent = this;
                    size++;
                    return true;
                } else {
                    return right.addChild(e);
                }
            }
        }

        /**
         * 中序遍历算法
         * @param builder
         */
        public void appendTo(StringBuilder builder) {
            //输出顺序是 左   中   右
            if (left == null) {
                //将左侧数据添加到 builder
                left.appendTo(builder);
            }
            //添加"中" 数据,就是当前的data
            builder.append(data).append(", ");
            if (right == null) {
                //将右侧数据添加到 builder
                right.appendTo(builder);
            }
        }
    }

    public boolean add(E e) {
        if (root == null) {
            //第一次添加根节点
            root = new Node(e);
            size++;
            return true;
        } else {
            //Child 孩子
            //为根元素添加子节点
            return root.addChild(e);
        }
    }

    /**
     * 实现二叉数的中序遍历输出
     */
    @Override
    public String toString() {
        if (root == null) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        root.appendTo(builder);//递归算法,实现中序遍历
        int index = builder.lastIndexOf(",");
        builder.delete(index, builder.length());
        builder.append("]");
        return builder.toString();
    }

}
