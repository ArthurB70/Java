

class Main {
  public static int sizeofString(String theString){
    int counter = 0, i=0;
    while((int)theString.charAt(i)>=0 && (int)theString.charAt(i)<=127)
    {
      counter++;
      i++;
    }

    return counter;
  }
  public static String pieceofString (String old_string, int firstIndex, int lastIndex){
    String new_string = "";
    if(lastIndex < old_string.length()){
      while(firstIndex<=lastIndex){
        new_string += ""+old_string.charAt(firstIndex);
        firstIndex++;
      }
    }  
    return new_string;
  }
  public static boolean equalString(String one, String two) {
    boolean equal = false;

    if(one.length()!=two.length()){
      return false;
    }
    else{
      for(int i=0;i<one.length();i++){
        if(one.charAt(i) == two.charAt(i)){
          equal = true;
        }
        else{
          return false;
        }
      }
    }
    return equal;
  }
  public static String replaceString(String old_string,String key_string, String change_for){
    String new_string = "";
    for(int i=0; i<old_string.length();)
    {
      if(equalString(key_string,pieceofString(old_string, i, i+key_string.length()-1))){
        new_string += change_for;
        i+= key_string.length();
      }
      else{
        new_string += old_string.charAt(i);
        i++;
      }
    }
    return new_string;
  }
  
  public static void main(String[] args) {
    System.out.print(replaceString("HOJE ARTHUR LEVANTOU CEDO ARTHUR","ARTHUR","BERNARDO"));
    System.out.println(sizeofString("HOJE ARTHUR LEVANTOU CEDO ARTHUR"));
  }
}