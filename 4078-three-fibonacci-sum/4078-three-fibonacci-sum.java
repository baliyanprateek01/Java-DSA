class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0; 
        int b = 1; 
        int c = 1;
        while((a+b+c) <= n){
            if(a+b+c == n){
            return true;
        }else {
            //swapping
        int temp = b+c;
        a = b;
        b = c;
        c = temp;
        }
        }
        return false;
    }
}