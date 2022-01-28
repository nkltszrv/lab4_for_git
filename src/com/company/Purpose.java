package com.company;

public interface Purpose {

    void runForOrCatchingUp(Pursuer pursuer) throws ShortyCannotDieException;
    void toCatchUp(Pursuer pursuer) throws ShortyCannotDieException;
    double getDistanceToThePursuer();
    void setDistanceToThePursuer(double distance);
    void setTimeOfRunning(double timeOfRunning);
    double getTimeOfRunning();

}
