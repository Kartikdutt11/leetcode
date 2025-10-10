int reverse(int x){
int MAX = 2147483647;
int MIN = -2147483648;
    long reverse = 0;
    if(x<0){   
        while(x<0){
            reverse = reverse*10 + (x%10);
            x=x/10;
        }
    }
    if(x>0){
        while(x>0){
            reverse = reverse*10 + (x%10);
            x=x/10;
        }
    }
    if(reverse<MAX && reverse>MIN){
        return reverse;
    }
    else{
        return 0;
    }
}
