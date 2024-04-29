package oop.labor08;

public class Mail {
    int from;
    int to;
    String subject;
    String message;
    long time;

    public Mail(int from, int to, long time, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
        this.time = time;
    }



    public int getFrom() {
        return from;
    }

    public long getTime() {
        return time;
    }

    public int getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "from=" + from +
                ", to=" + to +
                ", time='" + time + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                "}\n";
    }
}
