# ytovize


## Mimari Diyagram (Faz 1)
```mermaid
classDiagram
    class Bildirim {
        <<interface>>
        +gonder(alici: String, icerik: String)
    }
    class EmailBildirim {
        +gonder(alici: String, icerik: String)
    }
    class SmsBildirim {
        +gonder(alici: String, icerik: String)
    }
    class BildirimFactory {
        +olustur(tip: String) Bildirim
    }
    class BildirimSistemi {
        +main(args: String[])
    }
    
    Bildirim <|.. EmailBildirim
    Bildirim <|.. SmsBildirim
    BildirimFactory ..> Bildirim : "Üretir"
    BildirimSistemi ..> BildirimFactory : "Kullanır"
# Yazılım Tasarım Örüntüleri Vize Ödevi
A - Bildirim Sistemi

Gerçek hayat projelerinde (e-ticaret, bankacılık vb.) çok sık kullanılması ve farklı bildirim çeiştlerinn tasarım sorunlarına çok açık olması nedeniyle bu konuyu seçtim.
