package com.wg8.junior.my_collection;

/**
 * @author Harry
 * @date 2019/3/31 5:26 PM
 */
public class MyArrayList {

    private Object[] value;

    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int size) {
        if (size < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        value = new Object[size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object obj) {
        value[size] = obj;
        size++;
        // 装不下了，扩容吧
        if (size >= value.length) {
            int newCapacity = value.length * 2;
            Object[] newList = new Object[newCapacity];

            // 下面这个可以 copy 数组
            // System.arraycopy();

            for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];
            }

            value = newList;
        }
    }

    public Object get(int index) {
        if (index < 0 || index > size - 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return value[index];
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        } else {
            for (int i = 0; i < value.length; i++) {
                if (obj == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        } else {
            for (int i = value.length - 1; i >= 0; i--) {
                if (obj == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Object set(int index, Object object) {
        rangeCheck(index);
        Object old = value[index];
        value[index] = object;
        return old;
    }

    public void rangeCheck(int index) {
        if (index < 0 || index > size - 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("aaa");
    }
}
