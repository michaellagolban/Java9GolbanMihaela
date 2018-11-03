/*
 * Clasa Patrulater Dreptunghic
 */
package tdd;

/**
 *
 * @author Michaela
 */
public class PatrulaterDreptunghic extends Patrulater {

    public static final String DREPTUNGHI = " and four right angles";

    @Override
    public String getDefinition() {
        String definition = super.getDefinition() + DREPTUNGHI;
        return definition;
    }
}
