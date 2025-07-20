package net.engineeringdigest.journalApp.repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import net.engineeringdigest.journalApp.entity.User;
// import java.util.List;



public interface UserRepository extends MongoRepository<User,ObjectId> {
    User findByUserName(String userName);

}
