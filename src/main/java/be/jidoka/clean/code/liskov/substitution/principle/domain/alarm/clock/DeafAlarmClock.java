package be.jidoka.clean.code.liskov.substitution.principle.domain.alarm.clock;

public class DeafAlarmClock implements AlarmClock {

    @Override
    public void showCurrentTime() {
        // Lots of complicated code to show the time.
    }

    @Override
    public void ringBell() {
        // Oops this class doesn't have a bell to ring and breaks LSP because it does LESS than its interface suggests!
    }

    public void vibrate() {
        // Vibrate annoyingly.
    }

}
