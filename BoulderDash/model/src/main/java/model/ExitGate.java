package model;

/**
 * <h1>The ExitClass Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class ExitGate extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "ExitGate";

    /** create DP singleton */
    private static ExitGate EXITGATE;

    /** constructor of ExitGate */
    private ExitGate(Position positon, String sprite){
        super(positon, STRING);
    }
    
    public ExitGate getInstance(){
		return EXITGATE;
    }
}
