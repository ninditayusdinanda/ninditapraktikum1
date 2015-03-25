/**
 * Created by tita on 3/24/2015.
 */
public class tujuh {
    public static void main(String[] args) {
        System.out.println("deretan rata");
        double awal=1;
        double akhir=10;
        double jumlah=0;
        double rata;
        System.out.println("nilai awal="+awal);
        System.out.println("nilai akhir="+akhir);
        System.out.println("hasil deretan rata=");
    while (awal<=akhir){
        jumlah=jumlah+awal;
        awal++;
    }
        System.out.println("hasil");
        rata=jumlah/akhir;
        System.out.println("rata-rata deretan ="+rata);
    }
}
