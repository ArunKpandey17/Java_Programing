package Array_work;
public class Array {
     static int num[]={12,7,3,11,9,6,2,21};

        static void evenArray( int[] num ){
          int eve=0;
      for (int i=0;i<num.length;i++){
        if (num[i]%2==0){ 
          System.out.println("Even :"+num[i]); 
           eve = eve +num[i];
      }           
    }
    System.out.println("even sum :="+eve);
}
      public static void oddArray(int[] num ) {
        System.out.println("");
        int odd =0;
        for (int i=0;i<num.length;i++){
          
            if (num[i]%2!=0){ System.out.println("Odd :"+num[i]); 
          odd = odd + num[i];  }
    }
    System.out.println("odd sum :="+odd);
    }

    public static void sumArray(int [] num){
      int sum =0;
      for (int i=0;i<num.length;i++){
          
             sum = sum + num[i];
             
      }
     System.out.println("Sum of array Element: "+sum);

    }
     public static void main(String[] args) {
        evenArray(num);
        oddArray(num);
        sumArray(num);
     }

}