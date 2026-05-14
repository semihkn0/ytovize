package bildirimsistemi;

public class BildirimFactory {
    public static Bildirim olustur(String tip) {
        if (tip.equalsIgnoreCase("EMAIL")) {
            return new EmailBildirim();
        } else if (tip.equalsIgnoreCase("SMS")) {
            return new SmsBildirim();
        }
        throw new IllegalArgumentException("Desteklenmeyen bildirim tipi!");
    }
}