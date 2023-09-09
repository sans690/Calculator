
public class Calculator {
    private int mem1;
    private int mem2;
    private String op;

    public static void main(String[] args) {
        method();

    }

    private static void method() {
        Calculator calculator1 = new Calculator(1, 2, "+");
        System.out.println(calculator1.mem1 + calculator1.op + calculator1.mem2);
        int result = calculator1.perform();
        System.out.println(result);
    }

    public Calculator(int op1, int op2, String newOp) {
        mem1 = op1;
        mem2 = op2;
        op = newOp;

    }

    public int perform() {

        return mem1 + mem2;

    }

    public int getMem1(){
        return mem1;
    }

    // public Calculator() {
    // mem1 = 0;
    // mem2 = 0;
    // op = " ";

    // }

}
/*
 * You will implement the Calculator class that stores two operands (mem1 and
 * mem2) and an operation to
 * perform on them (op).
 * 1. Constructors:
 * Calculator()
 * Calculator(int op1, int op2, String newOp)
 * The no-argument constructor should initialize the mem1 and mem2 attributes to
 * 0 and the op attribute to a
 * space.
 * The overloaded constructor should validate the parameter values and then
 * assign the values to the associated
 * attribute.
 * 2. Accessors:
 * + getMem1() : int
 * + getMem2() : int
 * + getOp() : String
 * Each accessor method should return the appropriate value.
 * 3. Mutators:
 * + setMem1(int op1) : void
 * + setMem2(int op2) : void
 * + setOp(String newOp) : void
 * Each mutator method should validate the parameter values and then assign the
 * value to the appropriate attribute.
 * Valid operators are +, -, /, *, and ^. If the input value is invalid, the
 * attribute should remain unchanged.
 * 4. toString:
 * + toString() : String
 * The toString method should return a string that contains the mem1 value
 * followed by a space, followed by the
 * operator followed by a space, followed by mem2.
 * 5. Others:
 * + perform() : int
 * The perform method computes the operation where mem1 is the first operand and
 * mem2 is the second operand.
 * The result of the calculation should be returned and assigned to mem2. If
 * division is attempted with mem2
 * having a value of 0, the value 0 should be returned.
 * + performDiv() : double
 * If the operator is “/” and mem2 is not 0, then division is performed using
 * double arithmetic. The result of the
 * operation is returned. Otherwise, 0.0 is returned.
 * + swap() : void
 * Swaps the values of mem1 and mem2.
 */