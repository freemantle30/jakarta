import java.util.Objects;

public class Event {
    private String name;
    private String date;
    private String place;

    public Event(String name, String date, String place){
        this.name = name;
        this.date = date;
        this.place = place;
    }

    @Override
    public String toString() {
        return name + " se déroulera à " + place + ", le " + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name) &&
                Objects.equals(date, event.date) &&
                Objects.equals(place, event.place);
    }
}
