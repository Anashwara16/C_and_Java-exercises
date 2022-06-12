public int longestWord(Scanner word, int max){

  String nextWord = word.next();
  
  if(nextWord.isEmpty()){
    return 0;
  }  

  int next = nextWord.length();
    
  if(max < next){
    max = next;
  }
  
  if(word.hasNext()){
    return longestWord(word, max);
  }
  else{
    return max;
  }
}

public int longestWordLen(String words) {

  Scanner word = new Scanner(words);
  
  if(!word.hasNext())
    return 0;
  
  int max = -1;
  
  int newMax = longestWord(word, max);

  return newMax;
}
