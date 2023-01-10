package studentpractice;

public class TersYarımDiamond {
    public static void main(String[] args) {
        // Lutfen loop ile asagidaki sekli cikariniz:


//          1 2 3 4 5 6
//           2 3 4 5 6
//            3 4 5 6
//             4 5 6
//              5 6
//               6

        for (int satır= 1; satır <=6 ; satır++) {
            for (int bosluk = 0; bosluk <satır; bosluk++) {
                System.out.print(" ");
            }
            for (int sayı = satır ; sayı <=6 ; sayı++) {
                System.out.print(sayı + " ");
            }
            System.out.println();
        }
    }
}
