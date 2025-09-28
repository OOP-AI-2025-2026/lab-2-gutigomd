package ua.opnu;

public class TimeSpan {

    private int totalMinutes;

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.totalMinutes = 0;
        } else {
            this.totalMinutes = hours * 60 + minutes;
        }
    }

    public int getHours() {
        return totalMinutes / 60;
    }

    public int getMinutes() {
        return totalMinutes % 60;
    }

    public double getTotalHours() {
        return (double) totalMinutes / 60.0;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }

        int addedMinutes = hours * 60 + minutes;
        this.totalMinutes += addedMinutes;
    }

    public void addTimeSpan(TimeSpan timespan) {
        if (timespan == null) return;
        this.totalMinutes += timespan.getTotalMinutes();
    }

    public void subtract(TimeSpan span) {
        if (span == null) return;
        int totalOther = span.getTotalMinutes();

        if (totalOther > this.totalMinutes) {
            return;
        }

        this.totalMinutes -= totalOther;
    }

    public void scale(int factor) {
        if (factor <= 0) {
            return;
        }

        this.totalMinutes *= factor;
    }
}