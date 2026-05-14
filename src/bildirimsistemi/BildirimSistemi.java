package bildirimsistemi;

public class BildirimSistemi {
    public static void main(String[] args) {
        Bildirim email = BildirimFactory.olustur("EMAIL");
        email.gonder("mehmet@gmail.com", "Merhaba!");

        Bildirim sms = BildirimFactory.olustur("SMS");
        sms.gonder("5450065485", "Nasılsın?");
    }
}