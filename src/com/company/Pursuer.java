package com.company;

public interface Pursuer {

    void toCheckTheDistanceToThePurpose(Purpose purpose);
    double getDistanceToThePurpose();
    void setDistanceToThePurpose(double distanceToThePurpose);
    double getSpeed();
    void getHurtByPurpose(double damage) throws ShortyCannotDieException, ShortyCannotDieException;
}
