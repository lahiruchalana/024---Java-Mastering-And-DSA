package stackoerflow.filter;

public class Position {
    String account;
    String Date;
    String Cycle;
    String Status;

    public Position(String account, String date, String cycle, String status) {
        this.account = account;
        Date = date;
        Cycle = cycle;
        Status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCycle() {
        return Cycle;
    }

    public void setCycle(String cycle) {
        Cycle = cycle;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
