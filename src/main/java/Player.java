public class Player {
    protected int id;
    protected String name;
    protected int strengt;

    public Player(int id, String name, int strengt) {
        this.id = id;
        this.name = name;
        this.strengt = strengt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrengt() {
        return strengt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrengt(int strengt) {
        this.strengt = strengt;
    }
}
