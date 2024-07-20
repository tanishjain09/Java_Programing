package variableDataTypeOperator;
public class LogicalOperator {
    public static void main(String[] args) {
        
        boolean  a = true;
        boolean b = false;
        boolean c = true;

        boolean d = (a && b) || (b && c) || !a;
        System.out.println("(a && b) || (b && c) || !a = "+ d );
    }
}
