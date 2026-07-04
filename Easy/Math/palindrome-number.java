/*
Problem: 9. Palindrome Number
Difficulty: Easy
Link: https://leetcode.com/problems/palindrome-number/
Approach: Two Pointer on String - O(n)
Runtime: 7ms, Memory: 45.2MB
Language: Java
*/

class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;
        
        String s = String.valueOf(x); 
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;  
            }
            left++;
            right--;
        }
        return true;  
    }
}