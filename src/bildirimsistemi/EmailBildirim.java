package bildirimsistemi;

public class EmailBildirim implements Bildirim {
    @Override
    public void gonder(String alici, String icerik) {
        System.out.println("SMTP Bağlantısı kuruldu. E-posta gönderildi -> " + alici + ": " + icerik);
    }
}