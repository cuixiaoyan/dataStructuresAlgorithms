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
        ArrayQueue queue = new ArrayQueue(3);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop) {
            System.out.println("s：显示队列，e：退出程序，a：添加数据到队列，g：从队列取出数据，" +
                    "h：查看队列头到数据，");
            char key = scanner.next().charAt(0);//接收一个字符。
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g'://取出数据
                    try{
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h': //查看队列头的数据
                    try {
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e'://退出
                    scanner.close();
                    loop =false;
                    break;
                    default:
                        break;
            }
        }
        System.out.println("程序退出");

    }

}