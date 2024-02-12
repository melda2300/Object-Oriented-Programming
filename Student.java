public class Student {
    private int matematik;
    private int fizik;
    private int kimya;
    private int biyoloji;
    private double average;

    public void setGrades(int matematik, int fizik, int kimya, int biyoloji) {
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        this.biyoloji = biyoloji;
    }

    public int getMatematik() {
        return matematik;
    }

    public int getFizik() {
        return fizik;
    }

    public int getKimya() {
        return kimya;
    }

    public int getBiyoloji() {
        return biyoloji;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }
}