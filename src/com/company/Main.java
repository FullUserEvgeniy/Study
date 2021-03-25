package com.company;

class Outer{
    int [] nums;
    Outer(int [] n){
        nums=n;
    }
    void Analize(){
        Inner inOB=new Inner();
        System.out.println("минимум: "+inOB.min());
        System.out.println("максимум: "+inOB.max());
        System.out.println("среднее: "+inOB.avg());
    }
    class Inner{
        int min(){
            int m=nums[0];
            for (int i=1;i<nums.length;i++)
                if (nums[i]<m) m=nums[i];
                return m;
        }
        int max() {
            int m = nums[0];
            for (int i=1;i< nums.length;i++) if (nums[i]>m) m=nums[i];
            return m;
        }
        int avg(){
            int a =0;
            for (int i=0;i< nums.length;i++) a+=nums[i];
            return a/ nums.length;
        }
    }
}
public class Main {

    public static void main(String[] args) {
	int[]x={3,2,1,5,6,9,7,8};
	Outer outOb=new Outer(x);
	outOb.Analize();
    }
}
