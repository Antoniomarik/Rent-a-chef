package start.JavaProject.data.Service;

import org.springframework.stereotype.Service;
import start.JavaProject.data.Entity.DateBooked;
import start.JavaProject.data.Repository.DateBookedRepository;

import java.util.List;

@Service
public class DateBookedService {

    DateBookedRepository bookedDatesRepo;

    public List<DateBooked> readDateBooked (){return bookedDatesRepo.findAll();}

    public DateBooked createDateBooked (DateBooked datebooked){return bookedDatesRepo.save(datebooked);}

    public void deleteBookedDate (long id ) {bookedDatesRepo.deleteById(id);}

    //update necemo radit

}
