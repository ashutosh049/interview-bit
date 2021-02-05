package com.util;

import java.util.ArrayList;

public class Util {

  public static void printArrayWithIndices(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print("[" + i + "]" + arr[i] + " ");
    }
    System.out.println();
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void printArrayList(ArrayList<Integer> list) {
    System.out.print("[");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
      if(i < list.size()-1){
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public static void printArrayListMatrix(ArrayList<ArrayList<Integer>> list) {
    System.out.println("[");
    for (int i = 0; i < list.size(); i++) {
      System.out.print("\t[");
      ArrayList<Integer> innerList = list.get(i);
      for (int j = 0; j < innerList.size(); j++) {
        System.out.print(innerList.get(j));
        if(j < innerList.size()-1){
          System.out.print(", ");
        }
      }
      System.out.print("]");
      if(i < list.size()-1){
        System.out.println(",");
      }
    }
    System.out.println("\n]");
  }

}
