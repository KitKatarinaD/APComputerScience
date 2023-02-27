package Q3;

import Q3.prog408ahelper;

public class SortingAlgs {
    public static int[] bubbleSort(int[] Array) {
        for (int lcv = 0; lcv <Array.length; lcv++){
            for (int lcv2 = 0; lcv2 <Array.length-1; lcv2++){
                if (Array[lcv2] > Array[lcv2+1]) {
                    int temp = Array[lcv2];
                    Array[lcv2] = Array[lcv2 + 1];
                    Array[lcv2+1] = temp;
                }
            }
        }
        return Array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int i2 = i + 1; i2 <array.length; i2++) {
                if (array[i2] < array[min]) min =i2;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i<array.length; i ++) {
            int temp = array[i];
            int i2 = i - 1;
            while (i2 >=0 && array[i2] > temp) {
                array[i2 +1] = array[i];
                i2--;
            }
            array[i2+1] = temp;

        }
        return array;
    }
    public static prog408ahelper[] insetionSort(prog408ahelper[] array) {
            for (int i = 1; i<array.length; i ++) {
                prog408ahelper temp = array[i];
                int i2 = i - 1;
                while (i2 >=0 && array[i2].getScore() < temp.getScore()) {
                    array[i2 +1] = array[i];
                    i2--;
                }
                array[i2+1] = temp;

            }
            return array;
       }
    }
