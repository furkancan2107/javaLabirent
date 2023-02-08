
public class App {
    static int kontrol = 0;

    static void run(int col, int row, int[][] labirent1, String[][] cozum) {
        // burada direk labirente 9 un yerine ulaşıyoruz
        for (int i = 0; i < labirent1.length; i++) {
            for (int j = 0; j < labirent1[i].length; j++) {
                if (labirent1[i][j] == 9) {
                    col = i;// değerleri col ve rowa atadık
                    row = j;
                }
            }
        }
        cozum[0][0] = "1";// ilk değere 1 veriyoruz
        if (labirent1[col][row] == 9) {
            cozum[col][row] = "9";
        }
        while (col != 0 && row != 0) {
            /*
             * 9 dan başlayarak terse gideceğiz ve labirentimizin başlangıcının
             * 0 a 0 olduğunu bildiğimizden döngümüzü bu şarta göre kuruyoruz
             */

            if (labirent1[0][0] != 1) {
                System.out.println("başlangiç 1 olmak zorunda");
                // ilk değerin 1 olduğını garanti ediyoruz aksi durumda döngüyü kırıyoruz
                break;
            }
            if (col > 0 && labirent1[col - 1][row] == 1) {// köşe kontrolleri yapıldı
                col--;
                cozum[col][row] = "1";
                labirent1[col + 1][row] = 2;// önceden baktığı yere tekrar bakmasin diye
                // orayı 2 ile değiştirdim

            } else if (row > 0 && labirent1[col][row - 1] == 1) {// köşe kontrolleri yapıldı
                row--;
                cozum[col][row] = "1";
                labirent1[col][row + 1] = 2;// önceden baktığı yere tekrar bakmasin diye
                // orayı 2 ile değiştirdim
            } else if (row < 19 && labirent1[col][row + 1] == 1) {// köşe kontrolleri yapıldı
                row++;
                cozum[col][row] = "1";
                labirent1[col][row - 1] = 2;// önceden baktığı yere tekrar bakmasin diye
                // orayı 2 ile değiştirdim
            } else {
                System.out.println("labirent çözülemedi");// eğer şartları sağlamıyorsa labirent çözülemedi diye //
                                                          // çıktı
                break;
            }
        }
        if (col == 0 || row == 0) {/*
                                    * labirente döngüde ulaşacağı son deger ikisinden biri 0 olacağı için
                                    * burada labirenti bulduğunu garantiledik
                                    */

            System.out.println("labirent çözüldü tebrikler");
            App.kontrol = 1;

        }

    }

    public static void main(String[] args) throws Exception {
        int[][] labirent = {

                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

        };

        String[][] czm = new String[20][20]; // 1 dışındaki yerleri göstermemek için string dizi tanımladım

        int i = 0;// column
        int j = 0;// row

        run(i, j, labirent, czm);// run methodu üzerinden çalıştırdım

        // czm[i][j] = "1";
        if (App.kontrol == 1)
            for (String[] a : czm) {
                for (String b : a) {

                    if (b == null) {// burada null değer göstermemek için boşluk bıraktık
                        System.out.print(" ");
                    } else {
                        System.out.print(b);
                    }
                }
                System.out.println();

            }

    }
}
// Furkan Can 210541106 1.öğretim B şubesi
