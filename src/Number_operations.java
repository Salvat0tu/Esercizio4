public class Number_operations {
    public static void main(String[] args) {
        int a = 3;
        a += 5;
        a -= 4;
        int b = a;
        b += 1;
        //System.out.println(a);
        //System.out.println(b);


        if(b % 2 == 0 ) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        if(b * (b+1) % 3==0) {
            System.out.println("The number is multiple of 3");
        }else{
            System.out.println("The number is NOT multiple of 3");}
        }
    }