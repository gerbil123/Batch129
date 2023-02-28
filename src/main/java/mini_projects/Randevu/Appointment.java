package mini_projects.Randevu;

import java.time.LocalDate;

public class Appointment {
    public static int counter=0;
    private int id;
    private String name;
    private LocalDate date;

    public Appointment(String name, LocalDate date) {
        counter++;
        this.id=counter;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

