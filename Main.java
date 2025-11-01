public class Main {
    public static void main(String[] args) {
        // Setup objek
        Dosen pakBudi = new Dosen("Dr. Budi", "112233");
        Mahasiswa ani = new Mahasiswa("Ani", "2024001");
        Mahasiswa tono = new Mahasiswa("Tono", "2024002");

        System.out.println("=== DEMO SPRINT 1 ===");
        System.out.println();

        // Menjalankan skenario User Story #1
        System.out.println("**Skenario 1: Dosen Menambah Bimbingan**");
        pakBudi.tambahMahasiswaBimbingan(ani);
        pakBudi.tambahMahasiswaBimbingan(tono);
        System.out.println();
        System.out.println();

        // Menjalankan skenario User Story #2
        System.out.println("**Skenario 2: Mahasiswa Mencatat & Melihat Pembimbing**");
        ani.setPembimbing(pakBudi);
        tono.setPembimbing(pakBudi);
        System.out.println();
        
        // Verifikasi hasil (Sprint Review / Demo)
        System.out.println("--- HASIL AKHIR ---");
        pakBudi.lihatDaftarBimbingan();
        ani.lihatDosenPembimbing();
        tono.lihatDosenPembimbing();
    }
}