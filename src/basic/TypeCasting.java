package basic;

public class TypeCasting {

    public static void main(String[] args) {
        
        int num = 33;
        
        char ch = (char) num;
        
        char c = '$';
        int n = (int) c;
        
       // System.out.println(ch);
        
       // System.out.println(n);
        
        String s = "Java";
        
        for (int i = 0; i < s.length(); i++) {
            n = (int) s.charAt(i); 
            System.out.println("ASCII Value for " + s.charAt(i) + " is " + n);
        }
    }
}
