public class Variable {
    public static void main(String[] args) {
        String fullName = "Rassel Muhammad Indra";
        String birthPlace = "Bogor";
        String birthDay = "17 January 2007";
        char gender = 'L';
        String address = "Gg. Warung Seri RT:02/08, Desa Bendungan, Kecamatan Ciawi, Kabupaten Bogor, Jawa Barat";
        String phoneNumber = "1234567890";
        long income = 300000000L;

        String genderDescription = (gender == 'L') ? "Laki-laki" : "Perempuan";

        System.out.println("Assalamu'alaikum");
        System.out.println("Izinkan saya memperkenalkan diri");
        System.out.println("Nama Lengkap\t\t: " + fullName);
        System.out.println("Tempat & Tanggal Lahir\t: " + birthPlace + ", " + birthDay);
        System.out.println("Jenis Kelamin\t\t: " + genderDescription);
        System.out.println("Alamat Lengkap\t\t: " + address);
        System.out.println("No Hp\t\t\t: " + phoneNumber);
        System.out.println("Penghasilan Sebulan\t: Rp " + income);
    }
}