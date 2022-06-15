# LOGO SPRING BOOT BOOTCAMP HAFTA 1 - İLK 4 SORU

## 1. Java’nın platform bağımsızlığını nasıl sağladığını anlatınız.

Öncelikle platform bağımsızlığı biraz açalım. Belirli bir dilde yazılan kodun
işletim sistemi fark etmezsizin çalışması bu uygulamanın **platform bağımsız**
çalıştığı anlamına gelir.

Java’nın platform bağımsız olarak çalışmasının sebebi ise diğer dillerin aksine 
software based bir dil olmasından kaynaklanır. Software based diller, uygun olan 
işlemciler üzerinde; işlemcinin uygulayacağı spesifik işlemleri set olarak yazarlar.
Kısaca ve daha basit olarak açıklamak gerekirse, kaynak kodumuz makine koduna çevrilirken
hardware based platformun üzerinde çalışıyor olmasıdır.

Yazılan kodun, makine koduna çevrilmesini inceleyecek olursak, 
    
1. Source kod, **Java Compiler** tarafından Bytecode adı verilen bir dosyaya 
dönüştürülür. Bytecode, Java’nın platform bağımsız çalışmasının kilit noktasıdır çünkü
makine native bir kod değildir.
    
1. Bytecode, makine tarafından çalıştırılamadığı için makine koduna yorumlanabilmesi 
için **JVM**'e (Java Virtual Machine) ihtiyaç duyar. Ardından da JVM, Bytecode'u
çalıştırır ve uygulamanız çıktı verir.

Uygulamanın çalışma zamanında arada kullanılan iki compiler sayesinde Java bize 
platform bağımsız bir yapı sağlar.


## 2. Java neden çoklu kalıtımı desteklemez? Hangi diller bu duruma neden izin verir?

OOP'de kalıtım yapısı, class'ların parent class'larına ait olan özellikleri miras alabilmesi şeklinde açıklanır. Miras alınan bu özellikler genellikle instance değişkenleri veya fonksiyonlar olabilir.

Java'nın çoklu kalıtıma destek vermemesi ise temel olarak, her class'ın tabiri caiz ise kendine ait bir yoğurt yiyişi vardır :) Bir işi her iki class'ta yapıyor olabilir fakat işlemin yapılışı farklı olabilir. Bu nedenle subclass kullanılacak bir fonksiyonu superclass'lardan çağırırken, compiler'ın kafası karışır. Oluşan karışıklığa **diamon problem** adı verilir.

Çoklu kalıtıma destek veren dillere örnek olarak C++, Python, Common Lisp gibi diller örnek verilebilir. Çoklu kalıtıma destek verilmesinin en önemli sebebi DRY prensibine uymaktır. Oluşabilecek hatalarla her dilin kendine ait bir başa çıkma yöntemi vardır.


## 3. Build Tool nedir? Java ekosistemindeki toollar neler?

Build tool'lar, kaynak kodun compile edilmesini ve executable dosyalara çevrilmesini otomatikleştiren programlardır. 
Java ekosisteminde kullanılan açık kaynak build tool'lar:
1.Apache Maven (Spring Boot için kullanacağımız Build Tool)
2.Ant with ivy
3.Gradle
4.SBT

## 4. Collection framework içerisindeki yapıları örnekleyip açıklayınız.

![Java Collection Framework'ün hiyerarşisi](images/java-collection.png)


Collection framework, aynı tipteki verileri tutup arama, sıralama, insert etme silme gibi işlemleri yapabildiğimiz veri gruplarıdır. İçerisinde Set, List gibi interface'ler ve ArrayList, Vector gibi class'lar barındırır.

Yukarıdaki şekli incelediğimizde Collection Framework'un hiyeraşik yapısının en tepesinde **Iterable** interface'inin olduğunu görürüz. Bu interface sayesinde Collection yapıları içerisinde forEach kullanarak dolaşabiliyoruz bu bize esneklik sağlayan bir özellik.

Collection interface'i hiyeraşideki bütün class'lar tarafından implement (subinterface'leri tarafından) edilir. Basit olarak Colleciton interface'inin Collection Framework'ünün temelini oluşturduğunu söyleyebilir. Element adı verilen obje grupları temsil edilir.

### Set
Set yapısı Collection'ı extend ettiğinden arayüzün metotlarını kullanılabilir fakat Set, içerisinde tekrarlanan objeler bulundurmaz. İçerisinde özel objeler depolamak istediğimizde, Set yapısını kullanmamız mantıklı olacaktır. Set interface'i HashSet ve LinkedHashSet class'ları tarafından implement edilir.

```
Set<T> hashExample = new HashSet<T>();  
Set<T> linkedHashExample = new LinkedHashSet<T>();  
Set<T> treeSetExample = new TreeSet<T>();  
```

#### HashSet
Elemanlar Hash tablosunda tutulur. Set implement edildiği için, elemanlar tekrarlanamaz. Aynı zamanda elemanlar düzensiz sırada bulunur. NULL elemanlara izin verilir.

```
import java.util.HashSet;

public class App 
{
    public static void main( String[] args )

        HashSet<String> myNamesHash = new HashSet<String>();
        myNamesHash.add("Sevim");
        myNamesHash.add("Selin");
        myNamesHash.add("Özsoy");

        for (String namesHash : myNamesHash) {
            System.out.println(namesHash);
        }
    }
}
```
#### LinkedHashSet
HashSet ile aynı işe yarar fakat LinkedHashSet verileri eklendiği sırada tutar.

```
import java.util.LinkedHashSet;

public class App 
{
    public static void main( String[] args )
    {

        LinkedHashSet<Integer> customerPhoneNumber = new LinkedHashSet<Integer>();

        customerPhoneNumber.add(0);
        customerPhoneNumber.add(5);
        customerPhoneNumber.add(4);
        customerPhoneNumber.add(2);
        customerPhoneNumber.add(1);
        customerPhoneNumber.add(3);
        customerPhoneNumber.add(6);
        customerPhoneNumber.add(7);
        customerPhoneNumber.add(8);

        for (Integer phoneNumber : customerPhoneNumber){
            System.out.println(phoneNumber);
        }
        System.out.println("Sıralı şekilde geldi!");
    }
}

```

#### SortedSet
Bu interface temelde Set interface'ine çok benzer fakat verilerin dizilimiyle alakalı ekstra metotlar içerir. Elemanlar sıralı bir şekilde saklanmak istediği zaman kullanılır. TreeSet class'ı tarafından implement edilir.

TreeSet depolama için Tree veri yapısını kullanır.