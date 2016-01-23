import java.util.PriorityQueue;

public class User {
    private int userID;
    private String IP;

    private PriorityQueue<String> messageQueue;

    public User(int userID, String IP){
        messageQueue = new PriorityQueue<>();
        this.IP = IP;
        this.userID = userID;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public PriorityQueue<String> getMessageQueue() {
        return messageQueue;
    }
}
