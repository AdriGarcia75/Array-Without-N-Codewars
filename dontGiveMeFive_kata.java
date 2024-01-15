public class Kata{
  //note: i tried to not do the "% 10 technique but i think its not doable on an easy way and still use maths"
  public static int dontGiveMeFive(int start, int end){
    int countLength = 0;
    for (int i = start; i <= end; i++){
      //si % 5 ""= 0 pues se cuenta
      if (!contains5(i)){
        countLength++;
      }
    }
    return countLength;
  }
  
  public static boolean contains5(int value){
    //if its negative
    if (value < 0){
      value *= -1;
    }
    //we start dividing by 10 (by doing it so we go frmo 6712 to 671 to 67 to )
    while (value > 0){
      //translated -> if last value equals 5 means that value contains 5 so its true
      if (value % 10 == 5){
        return true;
      } else {
        value /= 10;
      }
    }
    //if it does not contain a 5
    return false;
  }
}
