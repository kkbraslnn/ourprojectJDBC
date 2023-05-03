package pojos;

public class IsciAdi {
    private String isim;
    private String sehir;
    private int maas;
    private String sirket;


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getSirket() {
        return sirket;
    }

    public void setSirket(String sirket) {
        this.sirket = sirket;
    }

    public IsciAdi(String isim, String sehir, int maas, String sirket) {
        this.isim = isim;
        this.sehir = sehir;
        this.maas = maas;
        this.sirket = sirket;
    }

    @Override
    public String toString() {
        return "IsciAdi{" +
                "isim='" + isim + '\'' +
                ", sehir='" + sehir + '\'' +
                ", maas=" + maas +
                ", sirket='" + sirket + '\'' +
                '}';
    }
}
