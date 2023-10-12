package our.project.dogpark.model.owner;

public class Owner {
    String name;
    String id;
    public Owner(String name, String id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString(){
        return (name+ "(id: "+id+")");
    }
}