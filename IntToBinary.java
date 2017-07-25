/*
 * Convert integer to binary. Then find maximum consecutive 1's in binary number
 */
public class IntToBinary {

  public static void main(String [] args) {
    System.out.println("Enter a decomal number to be converted to binary: ");
    
    int num = 11;
    StringBuffer sb = new StringBuffer();
    
    String bin = binary(num, sb);
    System.out.println("Binary is: " + bin);
    System.out.println("Max consecutive Ones: " + maxOnes(num));
  }
  
  public static String binary(int num, StringBuffer sb) {
    if (num == 1 || num == 0) {
      sb.append(Integer.toString(num));
      return sb.reverse().toString();
    }
    
    sb.append(num%2);
    return binary(num/2, sb);
  }
  
  public static int maxOnes(int num) {
    int counter = 0;
    int maxCount = 0;
    while(num>0) {
      int unitBit = num & 0x1;
      if (unitBit == 1) {
        counter++;
        if (counter>maxCount)
          maxCount = counter;
      } else {
        counter = 0;
      }
      num = num >> 1;
    }
    return maxCount;
  }
  
}
