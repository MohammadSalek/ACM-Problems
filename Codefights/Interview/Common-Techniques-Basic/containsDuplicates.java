// https://codefights.com/interview-practice/topics/common-techniques-basic

/*
Given an array of integers, write a function that determines whether the array contains any duplicates. Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.

Example

    For a = [1, 2, 3, 1], the output should be
    containsDuplicates(a) = true.

    There are two 1s in the given array.

    For a = [3, 1], the output should be
    containsDuplicates(a) = false.

    The given array contains no duplicates.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer a

    Guaranteed constraints:
    0 ≤ a.length ≤ 105,
    -2 · 109 ≤ a[i] ≤ 2 · 109.

    [output] boolean

*/

boolean containsDuplicates(int[] a) {
    HashSet<Integer> hash = new HashSet<>();
    for(int num : a){
        hash.add(num);
    }
    return hash.size() != a.length;
}

// It gets accepted, but is not a good way to do it:
boolean containsDuplicates2(int[] a) {
   Arrays.sort(a);
    for(int i=0; i<a.length-1; i++){
        if(a[i] == a[i+1]){
            return true;
        }
    }
    return false;
}    
