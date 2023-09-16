package com.dataStructure.practice.array;

public class FindDiagonalElementOf2DArray {

    /**
     *    1 2 3
     *    4 5 6
     *    7 8 9
     * @param args
     */
    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rows=array.length;
        int col= array[0].length;
        System.out.println("Rows :: "+rows+" Columns :: "+col);
        if(rows!=col)
            return;
        for(int i=0;i<rows;i++){
            System.out.println(array[i][i]);
        }
    }
}
