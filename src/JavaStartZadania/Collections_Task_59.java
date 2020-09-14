package JavaStartZadania;

import static java.lang.CharSequence.compare;

public class Collections_Task_59 implements Comparable<Collections_Task_59>  {
    private String name;
    private String description;
    private Priority priority;


    public Collections_Task_59(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nickname='" + name + '\'' +
                ", ordersNumber=" + description +
                '}';
    }

    @Override
    public int compareTo(Collections_Task_59 c) {
        return priority.compareTo(c.priority);
    }
public enum Priority{
        HIGH,MEDIUM,LOW
}

}

