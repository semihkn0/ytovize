package bildirimsistemi;

public class LoglamaDecorator extends BildirimDecorator {
    public LoglamaDecorator(Bildirim sarmalananBildirim) {
        super(sarmalananBildirim);
    }

    @Override
    public void gonder(String alici, String icerik) {
        System.out.println("\n[SİSTEM LOGU] Bildirim işlemi başlatılıyor.");
        super.gonder(alici, icerik);
        System.out.println("[SİSTEM LOGU] Bildirim başarıyla tamamlandı.");
    }
}