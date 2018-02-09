package com.lc.arithmetic.code366;



public class Lession366 {

    /*
      * @param n: an integer
      * @return: an ineger f(n)
      */
    public int fibonacci(int n) {
        // write your code here
        int[] intVal = new int[2+n];
        intVal[0]=0;
        intVal[1]=1;

        for(int i=2;i<n;i++){
            intVal[i]=intVal[i-1]+intVal[i-2];
        }
        return intVal[n-1];

    }

    public static void main(String[] args) {
        Lession366 lession366 = new Lession366();
        System.out.print(lession366.fibonacci(10));
    }

}
 