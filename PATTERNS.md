# Uygulanan Tasarım Örüntüleri

# Phase 1: Creational - Factory Method
* Nerede uygulandı? BildirimFactory sınıfında.
* Neden uygulandı? Ana programın (`BildirimSistemi`) hangi bildirim sınıfını (Email, SMS) üreteceğini bilmemesi ve nesne yaratma kodlarının iş mantığından ayrılması için.
* Ne kazanıldı? Ana sınıftaki spagetti if-else zincirleri silindi. Polimorfizm sayesinde tüm bildirimler tek bir `gonder()` arayüzü üzerinden tetiklenebilir hale geldi.