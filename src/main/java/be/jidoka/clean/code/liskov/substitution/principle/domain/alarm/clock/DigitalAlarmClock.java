package be.jidoka.clean.code.liskov.substitution.principle.domain.alarm.clock;

public class DigitalAlarmClock implements AlarmClock {

    @Override
    public void showCurrentTime() {
        // Lots of complicated code to show the time on a digital display.
    }

    @Override
    public void ringBell() {
        // Ring an annoying digital bell.
    }

}
