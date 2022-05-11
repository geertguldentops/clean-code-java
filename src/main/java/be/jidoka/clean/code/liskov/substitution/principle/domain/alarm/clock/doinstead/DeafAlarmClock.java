package be.jidoka.clean.code.liskov.substitution.principle.domain.alarm.clock.doinstead;

public class DeafAlarmClock implements Clock, Alarm {

    @Override
    public void showCurrentTime() {
        // Lots of complicated code to show the time.
    }

    @Override
    public void wakeUp() {
        // Vibrate annoyingly.
    }

}
