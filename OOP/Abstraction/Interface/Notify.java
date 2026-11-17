
interface Alert {
    void notifyUser();
}

class Notify implements Alert {
    public void notifyUser() {
        System.out.println("Notification sent");
    }

    public static void main(String[] args) {
        Notify obj = new Notify();
        obj.notifyUser();
    }
}
