class Result {
  /*     
   * Complete the 'solveQuery' function below.
   * @params
   *   N -> Total numbers from 1 to N
   *   W -> Maximum numbers in each row
   *   i -> First part of the query, denoting row or column number
   *   ch -> Second part of the query (i.e 'R' or 'C')
   * 
   * @return
   *   The sum of numbers in the row or column, as per the query
   */
  static long solveQuery(int N, int W, int i, char ch) {
    // Write your code here
    if(ch=='R') {
        int start = (i-1) * W+1 ;
        if(start>N) return  0; 
        int end = Math.min(i*W , N);
        int count = end - start +1 ;
        long sum = (long)(count) * (start+end) / 2 ;
        return sum ;
    }
      if(ch=='C') {
          if(i>W) return 0 ;
          long sum = 0 ;
          for(int num = i ; num<N ; num+=W) sum+=num ;
          return sum ;
      }
      return 0 ;
  }
}
