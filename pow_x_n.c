double myPow(double x, int n){
    double output=1;
    if(n<0){
      output=1/x*myPow(x,n+1);
      return output;
    }
    if(n==1){
      return x;
    }
    else if(n==0){
        return 1;
    }
    else{
      output=x*myPow(x,n-1);
      return output;
    }
}
