
public class OdevOOP {
    public static class Musteri {
        private String ad;
        private String soyad;
        private String email;
        private double bakiye;

        public Musteri( String ad, String soyad, String email, double bakiye ) {
            this.ad = ad;
            this.soyad = soyad;
            this.email = email;
            this.bakiye = bakiye;
        }

        public String getAd() {
            return ad;
        }

        public void setAd( String ad ) {
            this.ad = ad;
        }

        public String getSoyad() {
            return soyad;
        }

        public void setSoyad( String soyad ) {
            this.soyad = soyad;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail( String email ) {
            this.email = email;
        }

        public double getBakiye() {
            return bakiye;
        }

        public void setBakiye( double bakiye ) {
            this.bakiye = bakiye;
        }
    }

    public static void main( String[] args ) {
        
        System.out.println("Şu an ki bilgiler");

        String ad = "John";
        String soyad = "Doe";
        String email = "john.doe@example.com";
        double bakiye = 1000.0;

        String add = "Jane";
        String soyadd = "Smith";
        String emaill = "jane.smith@example.com";
        double bakiyee = 2000.0;

        Musteri musteri = new Musteri(ad, soyad, email, bakiye);
        Musteri musterii = new Musteri(add, soyadd, emaill, bakiyee);

        System.out.println("\nMüşteri 1: " + musteri.getAd() + " " + musteri.getSoyad());
        System.out.println("E-posta: " + musteri.getEmail());
        System.out.println("Bakiye: " + musteri.getBakiye());


        System.out.println("\nMüşteri 2: " + musterii.getAd() + " " + musterii.getSoyad());
        System.out.println("E-posta: " + musterii.getEmail());
        System.out.println("Bakiye: " + musterii.getBakiye());

        musteri.setBakiye(musteri.getBakiye() + 300.0);
        musterii.setBakiye(musterii.getBakiye() - 250.0);

        System.out.println("\nGüncellenmiş Müşteri Bilgileri:");

        System.out.println("\nMüşteri 1: " + musteri.getAd() + " " + musteri.getSoyad());
        System.out.println("E-posta: " + musteri.getEmail());
        System.out.println("Bakiye: " + musteri.getBakiye());

        System.out.println("\nMüşteri 2: " + musterii.getAd() + " " + musterii.getSoyad());
        System.out.println("E-posta: " + musterii.getEmail());
        System.out.println("Bakiye: " + musterii.getBakiye());

    }
}