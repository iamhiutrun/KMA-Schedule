package hiutrun.example.kmaschedule.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "schedule")
public class Schedule {

    @PrimaryKey
    @SerializedName("date")
    @Expose
    @NonNull
    @ColumnInfo(name="date")
    private String date;

    @SerializedName("lessons")
    @Expose
    @ColumnInfo(name = "lessons")
    private List<Lesson> lessons;

    private boolean isClicked;

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    public String getDate() {
        return date;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}