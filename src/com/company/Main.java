package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        //int[] arr= new int[5];
        int arr[]={1,2,3,4,5,0};
       // System.out.println("Enter value you want to add");
        System.out.println("Enter 1 if you want to add value at begining of array");
        System.out.println("Enter 2 if you want to add value at end of array");
        System.out.println("Enter 3 if you want to add value at specific position of array");
        int enter = s.nextInt();
        switch(enter){
            case 1:
                System.out.println("Enter value you want to add");
                int value= s.nextInt();
                insertbegin(arr,value);
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
                }
                break;
            case 2:
                System.out.println("Enter value you want to add");
                value= s.nextInt();
                insertend(arr,value);
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
                }
                break;
            case 3:
                System.out.println("Enter value you want to add");
                value= s.nextInt();
                System.out.println("Enter position at which you want to enetr");
                int pos = s.nextInt();
                insertelement(arr,value,pos);
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
                }
                break;
            default:
                System.out.print("Wrong input ");


        }


    }
    public static void insertbegin(int[] arr, int value){
        int n=arr.length-1;
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=value;

    }
    public static void insertend(int[] arr, int value){
        arr[arr.length-1]=value;
    }
    public static void insertelement(int[] arr,int value,int pos){
        for(int i=arr.length-1;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=value;

    }

}
