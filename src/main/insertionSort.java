/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class insertionSort
{
    public static void main(String[] args)
    {
        int[] arr = {9, 12, 3, 21, 44};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionSort(int[] arr)
    {
        int len = arr.length;
        for (int j = 1; j < len; j++)
        {
            int key = arr[j];
            int i = j-1;
            while ((i>-1)&&(arr[i]>key))
            {
                arr[i+1] = arr[i];
                i--;
            }
        arr[i+1] = key;
        }
    }
}
