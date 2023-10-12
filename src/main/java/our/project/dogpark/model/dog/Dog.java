package our.project.dogpark.model.dog;

import our.project.dogpark.model.owner.Owner;

public record Dog(String name, String ID, Breed breed, Owner owner) {
}
