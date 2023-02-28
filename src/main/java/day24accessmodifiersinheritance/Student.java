package day24accessmodifiersinheritance;

public class Student {

    //name herkes tarafından bilinebilir o yüzden public yaptım
    public String name = "Tom Hanks";
    //Student ıd okul yönetimindeki insanlar tarafından bilinmelidir o yüzden default yaptık
    String stdId =" TH2023HU12001";//Default
    //account number ben, esim ve cocuklarım tarafından bilinebilir o yüzden protected yaptım
    protected int accountNum = 76512345;
    //hesabımdaki para miktarı sadece benım tarafımdan bilinmelidir o yüzden private yaptım.
    private  int balance = 123000;

    //default(package private) olanlara aynı package içinde oldugu sürece ulaşabilirim
    //class'lar ya public olur ya da default olur protected ve private olamaz.

    /*
Access modifierlar genisten dara dogru;
        public > protected > default > private
    Class'lar protected ve private olamazlar. Sadece public ve default olabilirler.

    Access Modifier'lar ne ise yarar?
    -Variablelara methodlara classlara ulasmayi duzenler.
    Kac tane access modifier var ? 4. public > protected > default > private

    publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
    protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
    default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
    private

    protected ile defaultun farki nedir ?
    Package disina ciktigimizda childlardan protectedlara ulasabiliriz. Defaultlarda ulasamayiz.

*/
}
