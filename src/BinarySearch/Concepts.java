package BinarySearch;

import java.util.HashMap;

public class Concepts {

    public void fn1(int[] a, int key){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        int loc = -1;
        while(start<=end){
            mid= start + (end-start)/2;
            if(a[mid] == key){
                loc = mid;
                break;
            } else if (key>a[mid]) {
                start = mid +1;
            }else
                end = mid-1;
        }
        if(loc==-1)
            System.out.println("Key not found!");
        else
            System.out.println("Key found at position:"+(loc+1));
    }

    public void fn2(int[] a, int key){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        int loc = -1;
        while(start<=end){
            mid= start + (end-start)/2;
            if(a[mid] == key){
                loc = mid;
                break;
            } else if (key>a[mid]) {
                end = mid-1;
            }else
                start = mid +1;
        }
        if(loc==-1)
            System.out.println("Key not found!");
        else
            System.out.println("Key found at position:"+(loc+1));
    }

    public void fn3(int[] a, int key){
        boolean asc = a[0]<a[a.length-1];
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        int loc = -1;
        while(start<=end){
            mid= start + (end-start)/2;
            if(a[mid] == key) {
                loc = mid;
                break;
            }
            else if (asc){
                if (key>a[mid]) {
                    start = mid +1;
                }else
                    end = mid-1;
            }
            else{
                if (key>a[mid]) {
                    end = mid-1;
                }else
                    start = mid +1;
            }

        }
        if(loc==-1)
            System.out.println("Key not found!");
        else
            System.out.println("Key found at position:"+(loc+1));
    }

    public int fn4(int[]a, int key){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        int loc = -1;
        while (start<=end){
            mid = start + (end-start)/2;
            if(a[mid]==key){
                loc = mid;
                end = mid-1;
            } else if (key>a[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        if (loc!=-1)
            System.out.println("Key found! It's first Occurrence is at :"+(loc+1));
        else
            System.out.println("Key not found!");
        return loc;
    }

    public int fn5(int[]a, int key){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        int loc = -1;
        while (start<=end){
            mid = start + (end-start)/2;
            if(a[mid]==key){
                loc = mid;
                start = mid+1;
            } else if (key>a[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        if (loc!=-1)
            System.out.println("Key found! It's last Occurrence is at :"+(loc+1));
        else
            System.out.println("Key not found!");
        return loc;
    }

    public void fn6(int[] a, int key){
        int firstOcc = fn4(a,key);
        int lastOcc = fn5(a,key);
        if(firstOcc==-1 && lastOcc==-1)
            System.out.println("Key not found!");
        else
            System.out.println("Count of key is:"+ (lastOcc-firstOcc+1));
    }


}
