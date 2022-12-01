public class Wiedzmin {
    private String name;
    private String klasa;
    private int punktySily;
    private int punktyMany;
    private boolean nowaPostac;

    public Wiedzmin(String name, String klasa, int punktySily, int punktyMany, boolean nowaPostac) {
        this.name = name;
        this.klasa = klasa;
        this.punktySily = punktySily;
        this.punktyMany = punktyMany;
        this.nowaPostac = nowaPostac;
    }

    public Wiedzmin(String name, String klasa, boolean nowaPostac) {
        this.name = name;
        this.klasa = klasa;
        this.nowaPostac = nowaPostac;
    }

    public String getName() {
        return name;
    }

    public String getKlasa() {
        return klasa;
    }

    public int getPunktySily() {
        return punktySily;
    }

    public int getPunktyMany() {
        return punktyMany;
    }

    public boolean isNowaPostac() {
        return nowaPostac;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public void setNowaPostac(boolean nowaPostac) {
        this.nowaPostac = nowaPostac;
    }

    @Override
    public String toString() {
        return "Wiedzmin{" +
                "name='" + name + '\'' +
                ", klasa='" + klasa + '\'' +
                ", punktySily=" + punktySily +
                ", punktyMany=" + punktyMany +
                ", nowaPostac=" + nowaPostac +
                '}';
    }

    public int mocuderzeniowa() {
        return punktySily * punktyMany / 2;
    }

}