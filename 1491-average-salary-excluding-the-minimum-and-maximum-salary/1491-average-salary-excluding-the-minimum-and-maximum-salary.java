class Solution {
    public double average(int[] arr) {
    double sum=0;
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]<min) {
               min=arr[i];
           }
           if (arr[i]>max) {
               max=arr[i];
           }
           sum+=arr[i];
       }
       double avg=(sum-(min+max))/(arr.length-2);
       return  avg;
    }
}