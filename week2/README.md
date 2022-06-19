# Homework-2

## Java dünyasındaki framework’ler ve çözdükleri problemler nedir?(Spring MVC, JSP, Struct, Vaadin). Örnekler ile açıklayın.

### Spring Framework

Java ve framework dendiğinde ilk akla gelen ve listenin başını çekecek olan isim tabi ki de Spring olmalıydı! Spring'i web uygulamaları ya da herhangi bir Java uygulaması geliştirmek için kullanabiliyoruz. Spring, birçok framewowk gibi daha hızlı geliştirme yapmamızın yanı sıra dependency injection/inversion control sayesinde loose coupling uygulayarak uygulamanın bağımlılığını azaltır ve esneklik kazandırır. Container'lar sayesinde uygulamanın lifecycle'ını kontrol eder. Spring MCV sayesinde ise bir temel oluştururak restful web uygulamaları geliştirilebilir.

### Hibernate

Hibernate, Java uygulamalarında, database'i kontrol edebildiğimiz bir framework. Bize sağladığı en önemli özellik ise, Java nesnelerinin direkt olarak database'e aktarılabilmesi. Bu da çözülen büyük problemlerden birisi çünkü JDBC – JDBC'de nesnelerle database arasındaki bağlantı desteklenmiyor. Ayrıca Hibernate bunu yaparken arada soyutlama da yaptığından dolayı kodunuz ve database loosly coupled olmuş oluyor, hız kazandırmak için CRUD gibi işlemler direkt olarak Hibernate tarafından hallediliyor.

### Struts

Struts ile MVC modelini kullanarak web uygulamarı geliştirebiliyoruz. View, Controller, Model katmanları birbirine configuration dosyaları kullanarak bağlanır. Struts, JSP API yapısını kullandığından dolayı View sayfasında bazı karışıklıklar meydana gelebiliyormuş anladığım kadarıyla. Struts yapısının bizim için çözdüğü problem ise MVC kullanıyor olması bence. Bu şekilde yazılımcının koda yaklaşımı daha net olabiliyor. View kısmında da oldukça zengin bir tag kütüphanesi sağlıyor.

### GWT

Google tarafından geliştirilen bu framework Java ekosistemine daha çeşitli web uygulamaları kazandırmak için geliştirilmiş. Yazılan Java kodları GWT aracılığı ile JavaScript kodlarına çevrilebiliyor. Java kodlarıyla tarayıcı testleri yapmak çok uzun bir süreç olduğundan yararlı bir çözüm olduğunu düşünüyorum!


## Katmanlı mimari nedir?

Katmanlı mimari özellikle takım olarak çalışan yazışımcılar için bulunmaz bir nimet. Katmanlı mimari aslında bir kod yazma yaklaşımıdır.(Tıpkı oop gibi) Yazılımcıların projeleyi kafalarında daha iyi canlandırması ve kodları yazarken fikirlerini daha iyi uygulamarını sağlayan ve genel olarak projeye esneklik sağlanması için kullanılır.

Proje olası değişikliklere uyum sağlamak için 3 katmana ayrılır.

    1.Sunum katmanı
    2.İş Katmanı
    3.Veri katmanı

**Sunum Katmanı:** Genel olarak arayüzü oluşturan kodların bulunduğu kısımdır.
**Veri Katmanı:** Bu katmanda veri alışverişleri olur. Arayüz ile veritabanı bu katmanda anlaşırlar.
**İş Katmanı:** İş katmanı da veri katmanından yararlanır. Database'ten çekilen veriler bu katmanda işlenir.


## Garbage collector nedir, nasıl çalışır? Diğer C++ ile karşılaştırın.

Garbage collector'ler hafıza yönetiminde müthiş önemli bir yere sahiptirler. Garbage collector, program için ayrılmış ama referansa sahip alanları boşaltarak hafızayı temizler. Bu sebeple yazılımcı kafasını yormak zorunda kalmaz arkada bıraktığı çöpleri ile :D

Java'da bu süreç otomatik olarak gerçekleşir. JVM çalıştığında heap'te programa ait nesneler için alan alınır. Program çalıştıkça bazı nesnelerin sahip olduğumuz alanı işgal etmesinin bir manası kalmaz ve bu nesneler collector tarafından marklanır ve silinir. (ben mapusa atma terimini kullanmayı seviyorum burda :D)

C++ tarafında ise bu işlem manual bir şekilde gerçekleşir.

## Spring frameworkünün kullandığı design patternlar neler?

### Proxy Design Pattern

Proxy pattern'ı genel olarak AOP (Aspect Oriented Programming: karışıklık azaltma ve modülariteyi arttırmak için kullanılan yaklaşık biçimi) ve remoting (Kodun tek bir process ile bir servisi çağırması) kullanılır.

### Singelton Design Pattern

Aslında bu pattern, bellek yönetimi için kullanılır diyebiliriz. Sigleton Pattern, bir objenin bellekte yalnızca bir defa yaratılmasını sağlar. 

```

@Configuration
public class AppConfiguration {

    @Bean
    @Scope("singleton") // default scope 
    public UserService userService(){
        return new UserService();
    }
}

```

### Factory Design Pattern

Bu design pattern, bir objeyi factory isimli static bir metot ile initialize etmemize yarar. Beanlerin yaratılışı için iki farklı yaklaşım kullanır.

**Spring BeanFactory Container:** Spring'in sağladığı Dependency Injection desteği bulunan basit bir container'dır. BeanFactory interface'i ile kullanılır.

**Spring ApplicationContext Container:** Bu container ekstra enterpise'a özel özellikler ekler uygulamaya.

### Template Design Pattern

Template Design Pattern, tekrarlanan kodlar için kullanılır.

### Model View Controller Pattern

MVC, uygulamayı yazarken mantık, kontrol ve bilgilerin displaylendiği kısımları ayırmak için kullanılır.

### Front Controller Pattern

Controller'lara gelen isteklerin düzgün şekilde iletilmesini handler ile sağlayan bir pattern'dır. Bu handler authentication/ authorization/ logging gibi işlemlerin takip eder ve gerekli Controller'lara iletir.




## Creational Patterns neler? Önceki ödevde oluşturulan nesnelerinizi factory Design patterni ile oluşacak şekilde düzenleyin. (25 Puan)

## Singleton ve AbstractFactory patterlerini implemente eden kodu yazın.(25 Puan)
