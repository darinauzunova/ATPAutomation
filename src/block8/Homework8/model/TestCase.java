package block8.Homework8.model;

public class TestCase {
    private int id;
    private String title;
    private TestStatus status;

    private static int count = 0;

    public TestCase(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = TestStatus.NOT_RUN;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TestStatus getStatus() {
        return status;
    }

    public static int getCount() {
        return count;
    }

    public void setStatus(TestStatus status) {
        this.status = status;
    }

    public String describe() {
        return "#" + id + " " + title + " [" + status + "]";
    }
}
