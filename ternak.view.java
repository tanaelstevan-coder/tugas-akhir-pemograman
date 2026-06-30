    import java.util.Scanner;

public class TernakView {

    private Scanner input = new Scanner(System.in);
    private TernakController controller = new TernakController();

    public void menu() {

        controller.bacaFile();

        int pilih;

        do {

            System.out.println("\n======================================");
            System.out.println("   APLIKASI DATA PETERNAKAN");
            System.out.println("Nama : TANAEL STEVAN SITOHANG");
            System.out.println("NIM  : 241011401252");
            System.out.println("======================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Ubah Data");
            System.out.println("5. Hapus Data");
            System.out.println("6. Simpan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");

            try {
                pilih = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                pilih = -1;
            }

            switch (pilih) {

                case 1:
                    tambah();
                    break;

                case 2:
                    controller.tampil();
                    break;

                case 3:
                    cari();
                    break;

                case 4:
                    ubah();
                    break;

                case 5:
                    hapus();
                    break;

                case 6:
                    controller.simpan();
                    break;

                case 0:
                    controller.simpan();
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 0);

    }

    private void tambah() {

        try {

            System.out.print("Kode Ternak : ");
            String kode = input.nextLine();

            System.out.print("Jenis Ternak : ");
            String jenis = input.nextLine();

            System.out.print("Jumlah : ");
            int jumlah = Integer.parseInt(input.nextLine());

            System.out.print("Kondisi : ");
            String kondisi = input.nextLine();

            System.out.print("Pemilik : ");
            String pemilik = input.nextLine();

            controller.tambah(new Ternak(
                    kode,
                    jenis,
                    jumlah,
                    kondisi,
                    pemilik
            ));

            System.out.println("Data berhasil ditambahkan.");

        } catch (Exception e) {
            System.out.println("Input tidak valid.");
        }

    }

    private void cari() {

        System.out.print("Masukkan Kode : ");
        String kode = input.nextLine();

        Ternak t = controller.cari(kode);

        if (t != null) {

            System.out.println("Kode     : " + t.getKode());
            System.out.println("Jenis    : " + t.getJenis());
            System.out.println("Jumlah   : " + t.getJumlah());
            System.out.println("Kondisi  : " + t.getKondisi());
            System.out.println("Pemilik  : " + t.getPemilik());

        } else {

            System.out.println("Data tidak ditemukan.");

        }

    }

    private void ubah() {

        try {

            System.out.print("Masukkan Kode : ");
            String kode = input.nextLine();

            if (controller.cari(kode) == null) {
                System.out.println("Data tidak ditemukan.");
                return;
            }

            System.out.print("Jenis Baru : ");
            String jenis = input.nextLine();

            System.out.print("Jumlah Baru : ");
            int jumlah = Integer.parseInt(input.nextLine());

            System.out.print("Kondisi Baru : ");
            String kondisi = input.nextLine();

            System.out.print("Pemilik Baru : ");
            String pemilik = input.nextLine();

            controller.ubah(kode, jenis, jumlah, kondisi, pemilik);

            System.out.println("Data berhasil diubah.");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input.");
        }

    }

    private void hapus() {

        System.out.print("Masukkan Kode : ");
        String kode = input.nextLine();

        if (controller.hapus(kode)) {
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }

    }

}
