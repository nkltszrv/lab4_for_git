package com.company;

import java.util.TimerTask;

public class PurposeDogTimerTask extends TimerTask {

    private final Purpose purpose;
    private final Pursuer pursuer;


    public PurposeDogTimerTask(DogWhoCanBeAPurpose dogWhoCanBeAPurpose, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer) {
        this.purpose = dogWhoCanBeAPurpose;
        this.pursuer = shortyWhoCanBeAPursuer;
    }



    public void run(){
        try {
            this.purpose.runForOrCatchingUp(this.pursuer);

        } catch (ShortyCannotDieException e) {
            e.printStackTrace();
        }

        this.purpose.setTimeOfRunning(this.purpose.getTimeOfRunning() + 0.5);

        if (this.purpose.getTimeOfRunning() == 60){
            this.cancel();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }









}
