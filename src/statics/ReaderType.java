package statics;

public enum ReaderType {

    STUDENT("Sinh viên"),
    POST_STUDENT("Học viên cao học"),
    TEACHER("Giảng viên");

    public String value1;

    ReaderType(String value) {
        this.value1 = value;
    }
}
