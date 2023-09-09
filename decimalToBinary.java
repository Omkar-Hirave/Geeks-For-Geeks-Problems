public class decimalToBinary {
    public static String decimalToBinaryConversion(int n){
        String s = "";
        while(n >  0){
            int x = n % 2 ; 
            s = x + s ;
            n = n / 2 ;
        }
        return s ;
    }
    public static String octalToBinaryConversion(int n){
        String s = "";
        while(n >  0){
            int x = n % 8 ; 
            s = x + s ;
            n = n / 8 ;
        }
        return s ;
    }
    public static int binaryToDecimalConversion(String s){
        int result = 0 , powOf2  =  1 ;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            if(s.charAt(i) == '1'){
                result += powOf2;
            }
            powOf2 = powOf2 * 2;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 2 ; 
        System.out.println("The number entered for conversion is -->"+n);
        String binaryNumber = decimalToBinaryConversion(n);
        System.out.println("The binary to decimal conversion is --->"+binaryNumber);
        int decimalNumber = binaryToDecimalConversion(binaryNumber);
        System.out.println("The decimal to binary conversion is -->"+decimalNumber);
        String octalNumber = octalToBinaryConversion(n);
        System.out.println("The decimal to octal conversion is -->"+octalNumber);
    }
}
