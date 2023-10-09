package our.project.dogpark.model.dog;

public class Dog {
    private String name;
    private String id;
    private Breed Breed;

    public Dog(String name, String id, Breed breed){
        this.name = name;
        this.id = id;
        Breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Breed getBreed() {
        return Breed;
    }

    public void setBreed(Breed breed) {
        Breed = breed;
    }
}
