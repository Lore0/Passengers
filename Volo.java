public class Volo {
    String code;
    String loc_par;
    String loc_arr;
    String or_par;
    String or_arr;
    String price;
    int pos;
    Volo proxVolo = null;
    Volo prexVolo = null;
    Passeggeri head = null;
    Passeggeri tail = null;
    int size = 0;

    public Volo(){}

    public Volo(String code, String loc_par, String loc_arr, String or_par, String or_arr, String price){
        this.code = code;
        this.loc_par = loc_par;
        this.loc_arr = loc_arr;
        this.or_par = or_par;
        this.or_arr = or_arr;
        this.price = price;
    }

    public Volo(String code, String loc_par, String loc_arr, String or_par, String or_arr, String price, int pos){
        this.code = code;
        this.loc_par = loc_par;
        this.loc_arr = loc_arr;
        this.or_par = or_par;
        this.or_arr = or_arr;
        this.price = price;
        this.pos = pos;
    }

    public void addP(int i, Passeggeri p) {
        if (size == 0) {
            this.head = new Passeggeri(p.getCod(), p.getSurname(), p.getName(), 0);
            this.tail = this.head;
        } else {
            getPasseggeri(i - 1).nextPasseggeri = new Passeggeri(p.getCod(), p.getSurname(), p.getName(), i);
            getPasseggeri(i - 1).nextPasseggeri.prexPasseggeri = getPasseggeri(i - 1);
            this.tail = getPasseggeri(i - 1).nextPasseggeri;
        }
        size++;
    }

    public Passeggeri getPasseggeri(int i) {
        Passeggeri pass = getHead();
        while (pass != null) {
            if (pass.getPos() == i) {
                return pass;
            }
            pass = pass.nextPasseggeri;
        }
        return null;
    }

    public Passeggeri getHead() {
        return head;
    }
    public Passeggeri getTail() {
        return tail;
    }
    public int getSize() {
        return size;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos){
        this.pos = pos;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOr_par() {
        return or_par;
    }

    public void setOr_par(String or_par) {
        this.or_par = or_par;
    }

    public String getOr_arr() {
        return or_arr;
    }

    public void setOr_arr(String or_arr) {
        this.or_arr = or_arr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLoc_arr() {
        return loc_arr;
    }

    public void setLoc_arr(String loc_arr) {
        this.loc_arr = loc_arr;
    }

    public String getLoc_par() {
        return loc_par;
    }

    public void setLoc_par(String loc_par) {
        this.loc_par = loc_par;
    }

    @Override
    public String toString() {
        return "code='" + code + '\'' +
                ", loc_par='" + loc_par + '\'' +
                ", loc_arr='" + loc_arr + '\'' +
                ", or_par='" + or_par + '\'' +
                ", or_arr='" + or_arr + '\'' +
                ", price=" + price;
    }
}