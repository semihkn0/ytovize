package bildirimsistemi;

public abstract class BildirimDecorator implements Bildirim {
    protected Bildirim sarmalananBildirim;

    public BildirimDecorator(Bildirim sarmalananBildirim) {
        this.sarmalananBildirim = sarmalananBildirim;
    }

    @Override
    public void gonder(String alici, String icerik) {
        sarmalananBildirim.gonder(alici, icerik);
    }
}