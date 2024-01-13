class Solution {
  public int minSteps(String s, String t) {
    var freq = new int[26];
    var sb = s.getBytes();
    var tb = t.getBytes();
    
    for (var i = 0; i < sb.length; i++) {
      freq[sb[i] - 'a']--;
      freq[tb[i] - 'a']++;
    }
    
    var steps = 0;
    for (var i = 0; i < 26; i++) {
      steps += Math.abs(freq[i]);
    }
    
    return steps >>> 1;
  }
}