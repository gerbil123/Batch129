package day22staticblocksconstructors;

/*
   Constructor nedir?
   Class'dan object üretmemize yarayan code block'larıdır.

   Class oluşturdugumuzda Java bize otomatik olarak bir constructor verir
   Ama bu constructor gözle görülmez, gözle gorulmeyen otomatik olarak Java tarafından verilen bu constructor'lara
   "default constructor" denir.

   "default constructor" lar "Car(){}" şeklindedir.
   Siz kendi constructor'unuzu oluşturdugunuzda Java default constructor'ı siler.

   Bir Class'da farklı parametreler kullanarak istediğiniz kadar contructor oluşturabilirsiniz.
   Farklı constructor'ler sayesinde bir class'dan farklı farklı objeler oluşturabiliriz.

   INTERVİEW SORUSU: METHOD İLE CONSTRUCTOR FARKI VARMIDIR, VARSA NEDİR?
   CEVAP: METHOD İLE CONSTRUCTOR FAKLI YAPILARDIR.
            i)method'larda return type vardır, ama constructor'larde return type yoktur.
            ii)method'ların ismi yaptıkları işe göre developerlar tarafından belirlenir.
               constructor'ların ismi ise her zaman class ismi ile aynı olmalıdır.


    */
public class Car {
   String make = "Honda";
   String model = "Accord";
   int year = 2023;
   boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid){
      this.make=make;
      this.model=model;
      this.year=year;
      this.hybrid=hybrid;
   }

   public Car(String make, String model){ //public yazmamızın sebebi her classdan görünebilmesi
      this.make=make;
      this.model=model;
      if (year==2023){     //sadece marka ve model aramamız lazım oldugunda böyle yaptık.
         this.year=0;
      }
      if (hybrid==true){
         this.hybrid=false;
      }
   }


   public Car(String make, int year) {//otomatik olarak yaptırmak için sağ tık, generate,constructor
      this.make = make;
      this.year = year;
   }

   @Override
   public String toString() {  // sağ tık, generate, toString,
      return "Car{" +
              "make='" + make + '\'' +
              ", model='" + model + '\'' +
              ", year=" + year +
              ", hybrid=" + hybrid +
              '}';
   }
}

