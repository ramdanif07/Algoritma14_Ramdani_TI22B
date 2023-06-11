public class Main {
    public static void main(String[] args) {
      int result1 = sum(10);
      int result2 = sum2(10);
      int result3 = sum3(10);
      
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
    
    // Fungsi 1 (Increment)
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }
    
    // Fungsi 2
    public static int sum2(int k) {
      if (k > 0) {
        return k + sum2(k - 1);
      } else {
        return 0;
      }
    }
    
    // Fungsi 3
    public static int sum3(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }
  }