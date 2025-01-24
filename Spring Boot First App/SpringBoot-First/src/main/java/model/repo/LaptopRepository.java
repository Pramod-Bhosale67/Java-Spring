package model.repo;

import model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void saveInDB(Laptop lap){
        System.out.println("Saved in the database..");
    }
}
