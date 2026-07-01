//this is a different code(another way) to print all the divisors of a number in sorted order



// class Solution {
//     public int[] divisors(int n) {
//         List<Integer> ls=new ArrayList<>();
//         for(int i=1;i*i<=n;i++){
//            if(n%i==0){
//             ls.add(i);
//             if(n/i!=i){
//                 ls.add(n/i);
//             }
//            }
//         }
//         Collections.sort(ls);
//         int[] arr=new int[ls.size()];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=ls.get(i);
//         }
//         return arr;
//     }
// }