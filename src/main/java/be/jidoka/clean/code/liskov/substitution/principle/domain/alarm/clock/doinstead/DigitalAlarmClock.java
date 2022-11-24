package be.jidoka.clean.code.liskov.substitution.principle.domain.alarm.clock.doinstead;

public class DigitalAlarmClock implements Clock, Alarm {

    @Override
    public void showCurrentTime() {
        // Lots of complicated code to show the time on a digital display.
    }

    @Override
    public void wakeUp() {
        // Ring an annoying digital bell.
    }

}
