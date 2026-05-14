package bildirimsistemi;

public class WhatsAppServisi {
    public void mesajYolla(String numara, String metin) {
        System.out.println("WhatsApp API'ye bağlanıldı. Mesaj: '" + metin + "' -> Kime: " + numara);
    }
}