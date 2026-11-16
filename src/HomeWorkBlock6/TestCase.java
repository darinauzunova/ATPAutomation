package HomeWorkBlock6;

public class TestCase {
    private int id;
    private String title;
    private String status;

    private static int count = 0;

    public TestCase(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "NOT_RUN";
        count++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public static int getCount() {
        return count;
    }

    public void setStatus(String status) {
        if (status.equals("PASSED") ||
                status.equals("FAILED") ||
                status.equals("SKIPPED")) {
            this.status = status;
        } else {
            System.out.println("Invalid status!");
        }
    }

    public String describe() {
        return "#" + id + " " + title + " [" + status + "]";
    }
}
