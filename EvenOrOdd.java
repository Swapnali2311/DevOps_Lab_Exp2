public class EvenOrOdd {
    public static void Even_Odd(int n){
     int bitMask = 1;
     if((n & bitMask )== 0){
        // even 
        System.out.println("Even number");
     }
     else{
        System.out.println("Odd number");
     }
    }
    public static void main(String[] args) {
        Even_Odd(3);
        Even_Odd(6);
        Even_Odd(15);
    }
}
