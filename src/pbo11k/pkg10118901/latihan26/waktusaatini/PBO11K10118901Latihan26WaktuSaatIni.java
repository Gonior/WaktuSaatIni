package pbo11k.pkg10118901.latihan26.waktusaatini;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
/**
 *
 * @author ACER
 * Nama     : Dedi Cahya
 * Nim      : 10118901
 * Kelas    : IF 11-k
 * Deskripsi Program : Program ini berisi program menampilkan waktu
 */
public class PBO11K10118901Latihan26WaktuSaatIni {
     private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO11K10118901Latihan26WaktuSaatIni tgl = new PBO11K10118901Latihan26WaktuSaatIni();  
        System.out.println("Hari ini adalah Hari : "+tgl.getTanggal()+" "+tgl.getWaktu()); 
    }
    
}