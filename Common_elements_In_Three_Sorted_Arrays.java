// Intersection of 3 sorted arrays 
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
       int i = 0 , j = 0 , k = 0 ;
       ArrayList<Integer> list = new ArrayList<>();
       while(i < A.length && j < B.length && k < C.length){
           if(A[i] == B[j] && B[j] == C[k]){
               list.add(A[i]);
               int temp = A[i];
               i++;
               j++;
               k++;
               while(i < A.length && j < B.length && k < C.length && A[i] == temp && B[j] == temp && C[k] == temp){
                   i++;
                   j++;
                   k++;
                }    
           }else if(A[i] < C[k]){
               i++;
           }else if (B[j] < C[k]){
               j++;
           }else{
               k++;
           }
       }
       return list;
    }
}