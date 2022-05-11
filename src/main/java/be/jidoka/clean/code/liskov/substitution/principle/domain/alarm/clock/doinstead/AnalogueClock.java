package be.jidoka.clean.code.liskov.substitution.principle.domain.alarm.clock.doinstead;

public class AnalogueClock implements Clock, Alarm {

    @Override
    public void showCurrentTime() {
        // Lots of complicated code to show the time on a analogue display.
    }

    @Override
    public void wakeUp() {
        // Ring an annoying analogue bell.
    }

}
