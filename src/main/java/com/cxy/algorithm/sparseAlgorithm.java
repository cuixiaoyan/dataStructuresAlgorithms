package com.cxy.algorithm;

/**
 * @author cuixiaoyan
 * @version 1.0
 * @ClassName sparseAlgorithm
 * @description: 稀疏算法
 * @date 2020/12/2 8:21 PM
 * @Since：1.8
 */
public class sparseAlgorithm {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11 * 11
        // 0代表没有棋子，1表示黑子，2表示白子。
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[4][5] = 2;
        //输出原始的二维数组
        System.out.println("原始的二维数组--");
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        //将二维数组，转稀疏数组。
        //1、先便利二维数组，得到非0数据的个数。
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArr[i][j] != 0)
                    sum++;
            }
        }
        //2、创建对应的稀疏数组
        int sparseArr[][] = new int [sum + 1][3];
        //给稀疏数组赋值。
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组，将非0的记录存放到sparseArr中
        //count 用于记录第几个是非0数据。
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr [i][j];
                }
            }
        }
        //输出稀疏数组的形式。
        System.out.println();
        System.out.println("得到稀疏数组为--");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();




    }

}