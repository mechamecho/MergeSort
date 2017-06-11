package com.company;

/**
 * Created by Engineer on 6/11/2017.
 */
public class MergeSort {
    public static void mergesort(int[] array){
        mergesort(array, new int[array.length],0, array.length-1);
    }

    public static void mergesort(int[] array,int[] temp, int leftStart, int rightEnd){
        if(leftStart>=rightEnd){
            return;
        }
        int middle=(leftStart+rightEnd)/2;
        mergesort(array,temp,leftStart, middle);//left half
        mergesort(array, temp,middle+1, rightEnd);//right half
        mergeHalves(array,temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] array,int[] temp, int leftStart,int rightEnd){
        int leftEnd=(rightEnd+leftStart)/2;
        int rightStart=leftEnd+1;
        int size=rightEnd-leftStart+1;
        int left=leftStart;
        int right=rightStart;
        int index=leftStart;//index of temporary array

        //copying the merged array, sorted increasingly
        while(left<=leftEnd&&right<=rightEnd){
            if (array[left]<array[right]){
                temp[index]=array[left];
                left++;
            }else{
                temp[index]=array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftEnd-left+1);
        System.arraycopy(array, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
        for (int i=0;i<size;i++){
            System.out.print(temp[i]);
        }
    }
}
