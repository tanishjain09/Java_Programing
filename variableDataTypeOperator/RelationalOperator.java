package variableDataTypeOperator;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        System.out.println(a-- > ++b); //true
        System.out.println(++a < b++); //false
        System.out.println(a++ >= --b); //true
        System.out.println(b++ <= a--);//true
        System.out.println(b++ != --a);//true
        System.out.println(--a == b--); //false
        System.out.println(a); //13
        System.out.println(b); //9
    }
}
