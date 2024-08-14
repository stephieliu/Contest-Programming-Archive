/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steph
 */
public class Position {
    public Position(int r, int c){
        //implementation not shown
        //refers to a position object with row r and column c
    }
    public static Position findPosition(int num, int [][] arr){
        int row = 0, column = 0;
        boolean found = false;
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j]==num){
                    found = true;
                    row = i;
                    column = j;
                }
            }
        }
        if(found==true){
            Position object = new Position(row, column);
            return object;
        }
        else return null;
    }
    public static Position[][] getSuccessorArray(int [][] intArr){
        Position [][] arr = new Position [intArr.length][intArr[0].length];
        for(int i = 0; i<intArr.length; i++){
            for(int j = 0; j<intArr[0].length; j++){
                int temp = intArr[i][j];
                Position t = findPosition(temp, intArr);
                arr[i][j] = t;
            }
        }
        return arr;
    }
}
