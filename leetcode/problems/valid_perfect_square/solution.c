bool isPerfectSquare(int num) {
    if(num == 1){
        return true;
    }
    int is_perfect=0;
    for(long long i=0; i<=num/2; i++){
        if(i*i == num){
            is_perfect=1;
            break;
        }
    }
    if(is_perfect == 0){
        return false;
    }
    else{
        return true;
    }

}