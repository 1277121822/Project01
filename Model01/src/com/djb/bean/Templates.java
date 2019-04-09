package com.djb.bean;

/**
 * @author djb
 * @create 2019-04-09 14:55
 */
public class Templates {
    /**
    *
    */
    private int age;





    //模板一:psvm
    public static void main(String[] args) {
        //模板二:syso/sout
        System.out.println();
        int[] arr = new int[]{1,2,3,5,9};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (int i : arr) {
            System.out.println(i);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println("i1 = " + i1);
        }
    }

    public void testUpdate(){
        //修改测试
    }

}
