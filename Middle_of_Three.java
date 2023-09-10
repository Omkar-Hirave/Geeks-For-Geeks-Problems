class Solution{
    int middle(int A, int B, int C){
       int max , min  ;
        max = min = A;
        if(B < min){
            min = B;
        }else if(B > max){
            max = B;
        }
        
        if(C < min){
            min = C;
        }else if(C > max){
            max = C;
        }
        return (A+B+C)-(max+min);
    }
}