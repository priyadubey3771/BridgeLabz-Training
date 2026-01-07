package eventease;

//Interface defining scheduling behavior for events
public interface ISchedulable {

    void schedule();
    void reschedule(String newDate);
    void cancel();
}
