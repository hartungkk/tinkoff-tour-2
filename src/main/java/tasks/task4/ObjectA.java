package tasks.task4;

import java.util.Objects;

public class ObjectA {

    private int id;
    private String field;
    private String fieldValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectA objectA = (ObjectA) o;
        return id == objectA.id &&
                Objects.equals(field, objectA.field) &&
                Objects.equals(fieldValue, objectA.fieldValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, fieldValue);
    }

    public ObjectA(int id, String field, String fieldValue) {
        this.id = id;
        this.field = field;
        this.fieldValue = fieldValue;
    }
}
