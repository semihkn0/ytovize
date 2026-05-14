# Tasarım Sorunları (Faz 0)

1. Açık/Kapalı Prensibi İhlali: Yeni bir bildirim tipi eklemek için mevcut `if-else` yapısını değiştirmek zorundayız.
2. Tek Sorumluluk Prensibi İhlali: Sınıf hem mesaj oluşturuyor hem bağlantı kuruyor hem de loglama yapıyor.
3. Sıkı Bağımlılık: Loglama işlemi doğrudan metoda gömülmüş.
4. Nesne Yaratma Karmaşası: Ağ bağlantısı ve API hazırlıkları ana iş mantığına karışmış.
5. Okunabilirlik: Uzayan if-else blokları spagetti koda yol açıyor.

## AI Değerlendirme
1. Open/Closed Principle İhlali
mesajGonder metodu her yeni bildirim tipi eklendiğinde değiştirilmek zorunda. Mevcut kodu bozmadan genişletmek mümkün değil.
Çözüm → Strategy Pattern
Her bildirim tipi için ayrı bir sınıf (EmailBildirimi, SmsBildirimi, PushBildirimi) yaz, hepsi ortak bir Bildirim arayüzünü implement etsin. Yeni tip eklemek için sadece yeni sınıf oluşturmak yeterli olur.

2. Single Responsibility Principle İhlali
BildirimSistemi sınıfı tek başına email gönderme, SMS gönderme, push notification ve loglama sorumluluklarını taşıyor.
Çözüm → Strategy + Separation of Concerns
Her bildirim kanalı kendi sınıfına taşınır. Loglama ayrı bir servis (LogServisi) olarak ayrıştırılır.

3. Factory Logic Eksikliği
tip string'ine göre nesne davranışı seçiliyor ama bu seçim mantığı mesajGonder içine gömülü. Tip yönetimi dağınık ve kırılgan — "email" yazılsa çalışmaz.
Çözüm → Factory Pattern
BildirimFactory.olustur("EMAIL") gibi merkezi bir üretici sınıf, string-to-object dönüşümünü tek noktada yönetir.

4. Nesne Yönelimli Tasarım Yok — Polimorfizm Kullanılmıyor
if/else if zinciri, OOP'nin temel gücü olan polimorfizmi tamamen devre dışı bırakıyor. Bu yapı prosedürel bir yaklaşım.
Çözüm → Interface + Polymorphism
