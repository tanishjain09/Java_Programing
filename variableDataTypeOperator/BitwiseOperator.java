package variableDataTypeOperator;

public class BitwiseOperator {
    public static void main(String[] args) {
        
        int a = 5; //in binary -> 0101 
        int b = 3; //in binary -> 0011

        int and = a & b; // AND Operator
        System.out.println(and); //1

        int or = a | b; //OR operator
        System.out.println(or); //7

        int xor = a^b; //(XOR operator) 0101 ^ 0011 = 0110
        System.out.println(xor); //6
        
        int not = ~a; //signed changed
        System.out.println(not); 

        int sl = a << 2;//Left shift
        System.out.println(sl); 

        int sr = a >> 2;//Right Shift
        System.out.println(sr);
    }
}
