public String string1UpToN(int n) {
    if(n == 1)
      return "1"; 
        
    return RAppendUpTo("", 1, n);   
}

private String RAppendUpTo(String strSoFar, int i, int n) { 
    
    if(i==n+1)
      return strSoFar;  
    
    if(i<n){
      strSoFar = strSoFar + i + " ";
    }     
    if(i==n){
      strSoFar = strSoFar + i;
      return RAppendUpTo(strSoFar, i+1, n);
    }
    
    return RAppendUpTo(strSoFar, i+1, n);

}
