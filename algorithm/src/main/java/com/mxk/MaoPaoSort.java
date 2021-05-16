package com.mxk;

/**
 * @ClassName MaoPaoSort
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/8 13:39
 **/
public class MaoPaoSort {

    public static void main1(String[] args) {

        int[] a = {9,7,4,5,2,6,8,3,1,0};

        boolean flag = true;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j +1] = tmp;
                    flag = false;
                }

            }
            if (flag){
                break;
            }
        }

        for (int i : a) {
            System.out.println(i);
        }


    }


    public static void main(String[] args) {
        int[] arr = {9,7,4,5,2,6,8,3,1,0};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                a++;
            }
            a++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(a);



    }
}
