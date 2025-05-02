public class Search_in_String {
  public static void main(String[] args) {
    String str = "Mohammad Alim";
    char ch = 'r';

    System.out.println(search(str, ch));
  }

  // function for search in the string
  public static boolean search(String str , char target){
    // if array is empty then its false
      if(str.length() == 0){
          return false;
      }

      for(int i=0; i<str.length()-1; i++){
          if(str.charAt(i) == target){
              return true;
          }
      }

      // execute when the target not found at any index.
      return false;
  }
}
