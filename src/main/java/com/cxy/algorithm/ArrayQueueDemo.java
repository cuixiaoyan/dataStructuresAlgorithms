package com.cxy.algorithm;

import java.util.Scanner;

/**
 * @author cuixiaoyan
 * @version 1.0
 * @ClassName ArrayQueue
 * @description: 数组模拟队列
 * @date 2020/12/6 5:35 PM
 * @Since：1.8
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        //创建一个队列。
//        ArrayQueue queue = new ArrayQueue(3);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop) {
            System.out.println("s：显示队列，e：退出程序，a：添加数据到队列，g：从队列取出数据，" +
                    "h：查看队列头到数据，");
            char key = scanner.next().charAt(0);//接收一个字符。
            switch (key) {
                case 's':

            }


        }


    }

    // 使用数组模拟队列-编写一个类。
    class ArrayQueue {
        private int maxSize; //表示数组的最大容量
        private int front;//队列头
        private int rear;//队列尾
        private int[] arr;//该数据用于存放数据，模拟队列

        //创建队列的构造器
        public ArrayQueue(int arrMaxSize){
            maxSize = arrMaxSize;
            arr = new int[maxSize];
            front = -1;//指向队列头部，分析出front是指向队列头的前一个位置。
            rear = -1;//指向队列尾，指向队列尾的数据，既就是队列的最后一个数据。
        }
        //判断队列是否满
        public boolean isFull(){
            return rear == maxSize -1;
        }




    }

}