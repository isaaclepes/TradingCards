package net.tinetwork.tradingcards.api.model;


import net.tinetwork.tradingcards.api.model.schedule.Mode;
import net.tinetwork.tradingcards.api.model.schedule.Schedule;

public class Series {
    private final String name;
    private final Mode mode;
    private final String displayName;

    private final Schedule schedule;

    public Series(final String name, final Mode mode, final String displayName, final Schedule schedule) {
        this.name = name;
        this.mode = mode;
        this.displayName = displayName;
        this.schedule = schedule;
    }

    public boolean isActive() {
        if(mode == Mode.DISABLED)
            return false;
        if(mode == Mode.ACTIVE)
            return true;

        if(mode == Mode.SCHEDULED) {
            return schedule.isActive();
        }

        //fallthrough
        return false;
    }

    public String getDisplayName() {
        return displayName;
    }
    
    public Schedule getSchedule() {
        return schedule;
    }

    public String getName() {
        return name;
    }

    public Mode getMode() {
        return mode;
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", mode=" + mode +
                ", displayName='" + displayName + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
