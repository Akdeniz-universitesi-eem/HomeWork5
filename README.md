# HomeWork5

Bülent Tamay batur 20200805010 

----UML nedir? En yaygın kullanılan UML nedir? İşlevleri ile yazınız. -----

UML Nedir? UML (Unified Modelling Language — Birleşik Modelleme Dili), iş sistemlerinin modellenmesi konusunda ortaya çıkmış bir dildir. Genellikle yazılım sektöründe kullanılmakla beraber, iş sistemlerini, bir süreci veya herhangi bir işi diyagramlar ile açıklamak isteyenler tarafından kullanılır.

UML Class Diyagramları
Class diyagramları, OOP(Nesne Tabanlı Programlama) temel alınarak tasarlanmıştır. Amaç yazılımımız içindeki sınıflar ve aralarındaki ilişkileri tanımlamaktır. En yaygın UML dir. YApısal Diyagram grubuna girer.

Diğer diyagram türleri ise;

Davranış Diyagramlar (Behaviour Diagrams):

Activity Diagram (Faaliyet Diyagramı): İş sistemlerinin modellenmesinde kullanılır.
State Machine Diagram (Durum Diyagramı): Nesnelerin durumlarını gösterir.
Use Case Diagram (Kullanım Senaryosu Diyagramı): Modellenen bir sistemde davranışı gösterir ve sistemdeki gereksinimleri tespit etmek için kullanılır.

Etkileşim Diyagramlar (Interaction Diagrams):

Communication Diagram (İletişim Diyagramı): Sistemdeki sınıflar arasında dinamik ilişkileri mesajlar aracılığıyla gösterir.
Interaction Overview Diagram (Etkileşime Bakış Diyagramı): Modellenen sistemin dinamik yönlerini göstermek için kullanılır.
Sequence Diagram (Sıralama Diyagramı): Nesnelerin birbirleriyle nasıl iletişim sağladıklarını sıralı iletiler şeklinde gösterir.
Timing Diagram (Zaman Akış Diyagramı): Odağın zaman kısıtlamaları olduğu etkileşim diagramıdır.

Yapısal Diyagramlar (Structure Diagrams):

Component Diagram (Bileşen Diyagramı): Yazılım sisteminin, hangi bileşenlere ayrıldığını ve ilişkili olduğunu göstermek için kullanılır.
Object Diagram (Nesne Diyagramı): Nesnelerin özelliklerini ve değerlerini göstermek için kullanılır.
Composite Structure Diagram (Birleşik Yapı Diyagramı): Özellikle sınıflandırıcı ve çevresiyle olan alışverişi gösterir.
Deployment Diagram (Dağılım Diyagramı): Sistemde kullanılan donanımları ve bu donanımların içindeki bileşenleri ve bu bileşenlerin arasındaki iletişimi gösterir.
Package Diagram (Paket Diyagramı): Paketler arasındaki iletişimi gösterir.
Profile Diagram (Profil Diyagramı): Kalıplaşmış şekiller, etiketli şekiller ve kısıtlamaları tanımlamak için kullanılır.


-- ArrayList, LinkedList, HashMap, HastSet farklarını ve kullanış amaçlarını belirtiniz --

ArrayList:

Verileri bir dizi şeklinde saklar.
Elemanlara hızlı erişim sağlar (indeks tabanlı).
Eleman eklemesi ve silmesi başlangıçta yavaş olabilir.
Bellek kullanımı sıralıdır ve genellikle daha fazla bellek kullanır.
Verileri düzenli bir şekilde tutmak istediğinizde veya sık sık erişim gerektiğinde kullanışlıdır.

LinkedList:

Verileri bağlı listede saklar.
İki bağlı elemana sahiptir ve bu sayede eleman eklemeleri ve silmeleri hızlıdır.
Elemanlara indeksle erişim daha yavaşdır.
Bellek kullanımı dinamiktir ve genellikle daha az bellek kullanır.
Elemanlar arasındaki ilişkilerin önemli olduğu ve sık sık eklemeler/silmeler olduğu durumlarda kullanışlıdır.

HashMap:

Anahtar-değer çiftlerini saklar.
Anahtarlar benzersiz olmalıdır ve aynı anahtarla farklı bir değer atanabilir.
Anahtarlarla ilgili verilere hızlı erişim sağlar.
Sıralama garantisi yoktur.
Genellikle verilerin hızlı bir şekilde eşleştirilmesi veya arama yapılması gerektiğinde kullanışlıdır.

HashSet:

Benzersiz elemanları saklar.
Elemanlar sırasızdır ve tekrarlayan elemanları kabul etmez.
Eleman eklemesi ve silmesi hızlıdır.
Sıralama garantisi yoktur.
Genellikle benzersiz elemanların bir koleksiyonunda saklanması gerektiğinde kullanışlıdır.

