package com.algo.girl.numberSqrt;
/**
 * 思路:求解x的平方根，可以通过二分查找来实现，设置两个边界点，left和right，那么平方根的值就在这里面。
 * 每次取left和right的中心点，即为和的二分之一，比较中心点平方和给定数的大小，如果中心点平方大一些，
 * 取值区间必然在左区间，那么置右边界right为mid-1，否则置左边界left为mid+1，或者中心点平方与给定点相等，
 * 那么直接返回mid值即可，如果循环都结束了，还没有返回值，如给定数8，最后不会有返回值，因为没有8以下的数字的平方等于8，
 * 这时left=right的值为3，然后对right的值进行判断，如果right的平方大于8返回right-1；否则返回right；
 * @author mingle
 *
 */
public class BinarySearch {

	 public static int sqrt(int n){  
       int left=1,right=(n+1)/2;  
      
       while(left<right){  
          int mid=(left+right)/2;  
          int result= mid*mid;  
//          int result2=(mid+1)*(mid+1);  
          if(result == n){  
              return mid;  
          }else if(result > n){  // 说明mid值过大，右指针应该向左移动
              right=mid-1;  
          }else if(result < n){  // 说明mid值过小，左指针应该向右移动
             left=mid+1;  
          }  
       }  
       int temp=right*right;  
       if(temp>n){  
           return right-1;  
       }else{ 
    	   return right;
       }
         
   }   
}
