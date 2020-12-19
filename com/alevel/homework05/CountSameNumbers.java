package com.alevel.homework05;

public class CountSameNumbers {
    public static void main(String[] args) {
        int[] arr = {5,6,5,4,3,4,3,3,4,5,3,5}; // 3 = 4шт, 4 = 3 шт,5 = 4шт, 6 = 1шт
        System.out.println("The most repeated number is: " + MoreRepeat(arr));
    }
    static int MoreRepeat(int... Array){
        int a = 0 ,b= 0;
        int count =0;
        int number =0;
        for (int i = 0; i < Array.length; i++) {
            a = Array[i];
            int tempCount =0;
            for (int j = 0; j < Array.length; j++) {
                b = Array[j];
                if(a == b){
                    tempCount++;
                }
            }
            if(count < tempCount){
                count = tempCount;
                number = a;
            } else if(count == tempCount){
                if(number > a){
                    number = a;
                }
            }
        }
        return number;
    }
}
