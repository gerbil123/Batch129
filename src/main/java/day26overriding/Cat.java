package day26overriding;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override//parentteki methodu alıp değiştirerek kullanmaya overriding denir.
    public void eat() {//sağ tık+ generate+ overrite
        System.out.println("Cat eat...");
    }
    // override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
    // Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
    // Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
    // Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.

    @Override//Override Annotation:Override kurallarının Java tarafından kontrol edilmesini sağlar.
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public Integer multply(int a, int b) {
        return a*b;
    }
}
