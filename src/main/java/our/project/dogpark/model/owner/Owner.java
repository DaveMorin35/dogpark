package our.project.dogpark.model.owner;

public record Owner (String name, String id){
    @Override
    public String toString() {
        return (name + "(id: " + id + ")");
    }
}