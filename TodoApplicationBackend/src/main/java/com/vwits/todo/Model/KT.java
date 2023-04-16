package com.vwits.todo.Model;

interface calculate
{
    int add(int a,int b);
}
public class KT {
    public static void main(String[] args) {
        calculate add = Integer::sum;
        System.out.println(add.add(2,3));



    }
}
