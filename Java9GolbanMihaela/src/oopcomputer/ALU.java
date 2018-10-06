/*
 * Aritmetical and Logical Unit
 */
package oopcomputer;

/**
 *
 * @author Michaela
 */
public class ALU {

    private Integer operandUnu;
    private Integer operandDoi;
    private Character operand;
    private Integer rezultat;

    public Character getOperand() {
        return operand;
    }

    public void setOperand(Character operand) {
        this.operand = operand;
    }

    public Integer getOperandUnu() {
        return operandUnu;
    }

    public void setOperandUnu(Integer operandUnu) {
        this.operandUnu = operandUnu;
    }

    public Integer getOperandDoi() {
        return operandDoi;
    }

    public void setOperandDoi(Integer operandDoi) {
        this.operandDoi = operandDoi;
    }

    public Integer getRezultat() {
        return rezultat;
    }

    public void setResultat(Integer resultat) {
        this.rezultat = resultat;
    }

    public void calculeaza() {

        switch (operand) {

            case '+':
                rezultat = operandUnu + operandDoi;
                break;
                
            case '-':
                rezultat = operandUnu - operandDoi;
                break;
                
            case '*':
                rezultat = operandUnu * operandDoi;
                break;
                
            case '/':
                rezultat = operandUnu / operandDoi;
                break;
                
            default:
                System.out.println("Operator is incorrect. Use +, -, *, /");
        }

    }

}
