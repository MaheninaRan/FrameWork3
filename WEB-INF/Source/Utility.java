package Util;

public class Utility {
  
  public static String getUrl(String url) {
    String[] decompose = url.split("/");
    String answ = "";
    int itterator = 0;
    for(int i = decompose.length - 1; i > 3; i --) {
      if(itterator != 0) {
        answ = "/" + answ;
      }
      decompose[i] = decompose[i].replace('?', '=');
      String[] tableau = decompose[i].split("=");
      answ = tableau[0] + answ;
      itterator += 1;
    }
    return answ;
  }

}
