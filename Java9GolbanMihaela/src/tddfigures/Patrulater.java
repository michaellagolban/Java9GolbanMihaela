/*
 * Clasa Patrulater
 */
package tddfigures;

/**
 *
 * @author Michaela
 */
public class Patrulater extends Plana {
    public static final String PATRULATER = " with four straight sides";
    @Override
    public String getDefinition(){
        String definition = super.getDefinition() + PATRULATER;
        return definition;
    }
}
