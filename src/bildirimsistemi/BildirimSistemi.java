package bildirimsistemi;

public class BildirimSistemi {

    public static void main(String[] args) {
        BildirimSistemi sistem = new BildirimSistemi();
        
        sistem.mesajGonder("EMAIL", "mehmet@gmail.com", "Merhaba!");
        sistem.mesajGonder("SMS", "5450065485", "Nasılsın?");
    }

    public void mesajGonder(String tip, String alici, String icerik) {
        if (tip.equals("EMAIL")) {
            System.out.println("SMTP Sunucusuna bağlanılıyor (port: 587)");
            System.out.println("Email formatlanıyor");
            System.out.println("E-posta gönderildi -> " + alici + ": " + icerik);
        } 
        else if (tip.equals("SMS")) {
            System.out.println("Telekom API'sine token ile bağlanılıyor");
            System.out.println("Karakter sınırı kontrol ediliyor");
            System.out.println("SMS gönderildi -> " + alici + ": " + icerik);
        } 
        else if (tip.equals("PUSH")) {
            System.out.println("Firebase Cloud Messaging API'ye bağlanılıyor");
            System.out.println("Cihaz token'ı doğrulanıyor");
            System.out.println("Push Notification atıldı -> " + alici + ": " + icerik);
        } 
        else {
            throw new IllegalArgumentException("Desteklenmeyen bildirim tipi!");
        }

        System.out.println("[LOG]: " + tip + " mesajı " + alici + " kişisine iletildi.\n");
    }
}