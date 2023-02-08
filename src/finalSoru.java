//2.yol
public class finalSoru {

    public static void main(String[] args) throws Exception {
        int[][] matrisdizi = {
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
                { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };
        String[][] stringcevirmedizisi = new String[20][20];
        int satir = 0;
        int sutun = 0;
        while (matrisdizi[satir][sutun] != 9) {
            if (satir < 19 && matrisdizi[satir + 1][sutun] == 1) {
                satir++;
                stringcevirmedizisi[satir][sutun] = "1";
                matrisdizi[satir - 1][sutun] = 0;
            } else if (sutun < 19 && matrisdizi[satir][sutun + 1] == 1) {
                sutun++;
                stringcevirmedizisi[satir][sutun] = "1";
                matrisdizi[satir][sutun - 1] = 0;
            } else if (sutun > 0 && matrisdizi[satir][sutun - 1] == 1) {
                sutun--;
                stringcevirmedizisi[satir][sutun] = "1";
                matrisdizi[satir][sutun + 1] = 0;
            } else if (matrisdizi[satir + 1][sutun] == 9 || matrisdizi[satir][sutun + 1] == 9
                    || matrisdizi[satir][sutun - 1] == 9) {
                System.out.println("labirent çözüldü");
                break;
            } else {
                System.out.println("labirent çözülemedi");
                break;
            }
        }
        for (int k = 0; k < matrisdizi.length; k++) {
            for (int z = 0; z < matrisdizi[satir].length; z++) {
                if (matrisdizi[k][z] == 9) {
                    stringcevirmedizisi[k][z] = "9";
                }
            }
        }
        for (int a = 0; a < stringcevirmedizisi.length; a++) {
            for (int b = 0; b < stringcevirmedizisi[a].length; b++) {
                if (stringcevirmedizisi[a][b] == null) {
                    stringcevirmedizisi[a][b] = " ";
                }
                System.out.print(stringcevirmedizisi[a][b]);
            }
            System.out.println();
        }
    }
}
