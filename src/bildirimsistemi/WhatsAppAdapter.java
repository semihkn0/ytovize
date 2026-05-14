package bildirimsistemi;

public class WhatsAppAdapter implements Bildirim {
    private WhatsAppServisi wpServisi;

    public WhatsAppAdapter(WhatsAppServisi wpServisi) {
        this.wpServisi = wpServisi;
    }

    @Override
    public void gonder(String alici, String icerik) {
        wpServisi.mesajYolla(alici, icerik);
    }
}