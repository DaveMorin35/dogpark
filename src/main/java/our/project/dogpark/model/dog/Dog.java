package our.project.dogpark.model.dog;

import our.project.dogpark.model.owner.Owner;

public record Dog(String name, String id, Breed breed, Owner owner) {
}
