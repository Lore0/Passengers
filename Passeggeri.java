public class Passeggeri {
    
    int pos;
    String cod;
    String name, surname;
    Passeggeri nextPasseggeri = null;
    Passeggeri prexPasseggeri = null;
    
    public Passeggeri(){}
    
    public Passeggeri(String cod, String name, String surname, int pos){
        this.name = name;
        this.surname = surname;
        this.cod = cod; 
        this.pos = pos;
    }

    public Passeggeri(String cod, String name, String surname){
        this.name = name;
        this.surname = surname;
        this.cod = cod; 
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getCod() {
        return cod;
    }
    public int getPos() {
        return pos;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }

    public String toString(){
        return cod + " " + name + " " +surname;
    }
    
}   