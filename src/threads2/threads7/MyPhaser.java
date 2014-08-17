package threads2.threads7;

import java.util.concurrent.Phaser;

/**
 * Created by USER on 07.07.2014.
 */
public class MyPhaser extends Phaser {
    int numPhasers;
    public MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhasers = phaseCount - 1;
    }

    @Override
    protected boolean onAdvance(int p, int registeredParties) {
        System.out.println("Phase " + p + " completed.\n");
        if (p == numPhasers || registeredParties == 0) {
            return true;
        }
        return false;
    }
}
