package bildirimsistemi;

public class SmsBildirim implements Bildirim {
    @Override
    public void gonder(String alici, String icerik) {
        System.out.println("Telekom API bağlandı. SMS gönderildi -> " + alici + ": " + icerik);
    }
}