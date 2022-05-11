package be.jidoka.clean.code.liskov.substitution.principle.domain.alarm.clock.avoid;

public class AnalogueClock implements AlarmClock {

    @Override
    public void showCurrentTime() {
        // Lots of complicated code to show the time on a analogue display.
    }

    @Override
    public void ringBell() {
        // Ring an annoying analogue bell.
    }

}
