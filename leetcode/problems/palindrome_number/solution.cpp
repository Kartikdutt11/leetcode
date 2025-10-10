class Solution {
public:
    bool isPalindrome(int x) {
        int num = x;
        long long reverse=0;
    if(num<0){
        return false;
    }
    while(num>0){
        reverse =reverse*10 + (num%10);
        num=num/10;
    }
    if(x==reverse){
        return true;
    }
    else{
        return false;
    }
    
    }
};