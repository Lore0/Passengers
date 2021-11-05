public class LineeAeree {
    private Volo head;
    private Volo tail;
    private int size = 0;

    public LineeAeree() {
        this.head = null;
        this.tail = null;
    }

    public Volo getHead() {
        return this.head;
    }

    public void setHead(Volo head) {
        this.head = head;
    }

    public Volo getTail() {
        return this.tail;
    }

    public void setTail(Volo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return this.size;
    }

    public void setSiza(int size) {
        this.size= size;
    }

    public void add(int i, Volo v) {
        if (size == 0) {
            this.head = new Volo(v.getCode(), v.getLoc_par(), v.getLoc_arr(), v.getOr_par(), v.getOr_arr(), v.getPrice(), 0);
            this.tail = this.head;
        } else {
            getVolo(i - 1).proxVolo = new Volo(v.getCode(), v.getLoc_par(), v.getLoc_arr(), v.getOr_par(), v.getOr_arr(), v.getPrice(), i);
            getVolo(i - 1).proxVolo.prexVolo = getVolo(i - 1);
            this.tail = getVolo(i - 1).proxVolo;
               
            }
        size++;
    }
    

    public void Cancella(int i) {
        if (getVolo(i) == head) {
            this.head = getVolo(i).proxVolo;
        } else if (getVolo(i) == tail) {
            this.tail = getVolo(i).prexVolo;
        } else {
            getVolo(i).prexVolo.proxVolo = getVolo(i).proxVolo;
            getVolo(i).proxVolo.prexVolo = getVolo(i).prexVolo;
        }
        this.size--;
        buildIndex();
    }

    public void buildIndex() {
        Volo attuale = getHead();
        int count = 0;
        while (attuale != null) {
            attuale.setPos(count++);
            attuale = attuale.proxVolo;
        }
    }

    public Volo getVolo(int i) {
        Volo attuale = getHead();
        while (attuale != null) {
            if (attuale.getPos() == i)
                return attuale;
            attuale = attuale.proxVolo;
        }
        return null;
    }

}