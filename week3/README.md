# ActiveMQ, Kafka ve RabbitMQ karşılaştırın. Örnek kodlar ile nasıl çalıştığını anlatın.
Bu üç teknoloji de web uygulamalarında asenkron iletişimi sağlamak için kullanılıyor. Mesaj queue, mesaj broker ve mesaj tooları olarak da adlandırılıyorlar.
ActiveMQ ve RabbitMQ mesaj queue'ları olarak kategorilendiriliyorlar. Kafka, yüksek verilmli dağıtılmış mesaj sistemi olarak, Java kullanılarak geliştirilmiştir.


# Microservis ve monolith mimariyi karşılaştırın.
Mikroservisler, daha birkaç sene önce keşfedilmesine rağmen büyük şirketler tarafından sıkça kullanılan bir teknoloji halini aldı.

Monolitik yaklaşım bir uygulama geliştirmek için default model diyebiliriz. Monolith modeli arkamızda bırakmamızda, yazılımcılar olarak asla uğraşmak istediğimiz nedenler yatmakta. Öncelikle büyük boyuttaki verilerle uğraşmak ve yeni değişiklikleri implement etmeyi örnek verebiliriz.

Monolith modelde uygulamamızı bölünmez bir bütün halinde oluştururuz. Sadece tanım bile monolith mimarinin pek esnek olmadığını anlamamızı saplıyor. Uygulamamızda bir şey değiştirmek istediğimizde kodun iskeletinde değişiklikler yapmak zorunda oluruz. Ayrıca da bütün kodu değiştirmek zorunda kalabiliriz çünkü değişiklikler kodun yapısına uymayabilir.

Güçlü yanlarından bahsedecek olursak, düz bir bakış açısı olduğundan dolayı geliştirmesi geliştirmesi, testleri gerçekleştirmesi ve deploylaması kolaydır.

Mikroservisler ise, Monolith mimarinin aksine küçük parçalar halinde geliştirilir. Yazılımda küçük parçalara bölerek çalıştığımız (oop bunlara örnek olarak verilebilir) yaklaşımlar gibi, uygulamalarımız esneklik kazanır. Uygulamanın her bir fonksiyonu farklı ve ayrı(!) bir servise verilir, servisler yaptıkları işe göre kendi veri tabanlarını ve mantıklarını içerirler. Servisler tamamen birbirinden ayrı olduğundan ayrı ayır deploylanırlar.


# SOAP - RESTful karşılaştırın
Soap ve rest, web uygulamaları arasında veri aktarımı için iki farklı yaklaşımdır.

En basit olarak, rest’in (Representational state transfer) bir protokol olmaması.

Rest, daha web ve mobil uygulamalar için daha hafif, küçük veri aktarımına ihtiyaç duyulduğundan oluşturulan prensiplerdir. Prensipler bütünü olmasından kaynaklı olarak rest, soap’u veri aktarımı için kullanabilir.

Soap’un belirlediği kurallar sıkıca takip edilmeli fakat rest bize bu şekil bir dayatmada bulunmaz. Ayrıca Soap, rest’e göre daha büyük veriler gönderdiğinden (soap xml, rest JSON) daha fazla bant genişliği kaplar.