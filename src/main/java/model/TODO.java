package model;

import java.util.Objects;

public class TODO {

    private long id;
    private boolean isDone;
    private String comment;

    public TODO(long id, boolean isDone, String comment) {
        this.id = id;
        this.isDone = isDone;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "TODO{" +
                "id=" + id +
                ", isDone=" + isDone +
                ", comment='" + comment + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TODO toDo = (TODO) o;
        return id == toDo.id &&
                isDone == toDo.isDone &&
                Objects.equals(comment, toDo.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isDone, comment);
    }
}
