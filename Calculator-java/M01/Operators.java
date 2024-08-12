import java.lang.Math;
import java.math.BigInteger;
 
public class Operators {
    public BigInteger getFatorial(int num) {
        BigInteger finalNum = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            finalNum = finalNum.multiply(BigInteger.valueOf(i));
        }
        return finalNum;
    }
 
    public double getSqrt(double num) {
        return Math.sqrt(num);
    }

  public double getSqrt(int num) {
    
    return Math.sqrt(num);
  }
}
