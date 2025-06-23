public class RotatedString {
    public static boolean rotateString(String s, String goal) {

    if(s.length()!=goal.length()){
        return false;
    }

    for(int i=0;i<s.length();i++){
        String rotated = s.substring(i,s.length()) + s.substring(0,i);
        if(rotated.equals(goal)){return true;}
    }
    return false;

  }

  public static void main(String[] args) {
      System.out.println(rotateString("abcde", "bcdea"));
  }
    
}
