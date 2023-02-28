package day26overriding;

    /*
    1) Parent Class'daki method'u Child class içinde özelleştirerek kullanmaya "overriding" yapmak denir.
    2)Overriding'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si değiştirilir.
    3)@Overrite==> Onerrite Annotation: Overrite kurallarının Java tarafından kontrol edilmesini sağlar.
    4)Overriding'de parent class'daki method'a "overriden method" , child class'daki method'a ise "overriding method" denir.
    5)"private" method'lar override edilemezler.
    6)Child Class'daki overrite edilmiş method(overriding method)'un acces modifier'i Parent Class'daki overrite edilmiş(overridden)
    acces modifier'ınden dar olamaz.Child her zaman daha ozgurlukcu olmalıdır.
        Overridden Method==> protected ise overriding method ==protected, public olabilir
        Overridden Method==> default ise overriding method ==> default , protected ,public olabilir
        Overridden Method==> private ise overriding method ==> override olmaz ki acces modifier'i olsun(bkz 5.kural)
     7) Child Class'da overrite edilen method'un (Overriding method) return ettiği data type'inin aynısı veya o data type'inin
     parenti olarak seçilebilir.
     8)Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez. Cunku return type ya
    ayni olur ya da parent'dan secilir ama primitive'ler arasinda parent-child iliskisi olmadigindan parent'dan secmek
        mevzu olamaz. O zaman tek secenek aynisi olmalidir kalir.
     9)Method'un return type'i "Wrapper Class" ise Overriding yaparken return type degidtirilmez.Cunku; return type ya
    ayni olur ya da parent'dan secilir. Ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent''dan
    secme ihtimali yoktur,geriye sadece aynisi olma ihtimali kalir.
    10)Method'un return type'i "void" ise Overriding yaparken return type degistirilemez.

    11)Final kelimesinin Variable'larda kullanimi : Variable "final ise
    i)Mutlaka deger atanmalidir
    ii)Ilk atanan deger degistirilemez.
    Ornek kullanimi : public final double pi = 3.14;
    Final'leri isimlendirilirken büyük harf kullanılır.

    12)Final kelimesinin Method'larda kullanimi: Method "final" ise;
    i)Method'un body'si degistirilemez.
    ii)Method body'si degistirilemeyince "override" yapmak mumkun olmaz.
    Ornek kullanimi: public final int add(int a, int b){
                                return a+b;
                   }
     13)Final kelimesinin Class'larda kullanimi: Bir class "final" ise o class'in child'i olamaz.
     14)"Final" method'lar ve "static" method'lar "override" edilemezler.
     15)"Override" yapabilmek için "inheritance" şarttır.Baska bir ifadeyle parent-Child iliskisi şarttır.
     16)Method overloading Compile Time Polymorphism'dir. Method overriding Run Tıme polymorphism'dir.
     17) Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphism" dir.

        Polimorphism 2 oge var
        Overloading =Ayni isimli ama farkli isi yapan methodlar.
        Ovverriding =Parentlardaki her bir methodu ozellestirmek
        Parenttaki methodu degistirilerek her bir  child da kullanilirsa buna overriding denir Bu cok faydalidir, esneklik.
     */

public class Animal {
    public void eat (){//parent'daki overrite edilmiş eat() method'una "overridden method" denir
        System.out.println("Animals eat...");
    }
    public void drink (){
        System.out.println("Animals drink");
    }
    public Animal create(){
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;
    }
    public Integer multply(int a , int b){
        return a*b;
    }
}
