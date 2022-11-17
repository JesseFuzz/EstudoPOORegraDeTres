package org.example;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Historic {
    private int id;
    private LocalDateTime time;
    private ArrayList<CalcExample> calcExamples;

    public Historic(int id, LocalDateTime time) {
        this.id = id;
        this.time = time;
        calcExamples = new ArrayList<>();
    }

    public void addCalcExample(CalcExample calcExample){

        this.calcExamples.add(calcExample);
    }

    public double getTotalCalcs(){
        return this.calcExamples.size();
    }


    @Override
    public String toString() {
        return "Historic{" +
                "id=" + id +
                ", time=" + time +
                ", calcExamples=" + calcExamples +
                "total: " + this.getTotalCalcs() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

}
