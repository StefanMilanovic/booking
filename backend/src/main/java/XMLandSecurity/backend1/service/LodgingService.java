package XMLandSecurity.backend1.service;

import XMLandSecurity.backend1.domain.AdditionalService;
import XMLandSecurity.backend1.domain.City;
import XMLandSecurity.backend1.domain.Lodging;

import java.util.Date;
import java.util.List;

public interface LodgingService {

    List<Lodging> findAll();

    Lodging findOne(Long id);

    Lodging save(Lodging user);

    void delete(Long id);

    Lodging findByAgent(Long id);

    List<Lodging> findByCityAndPersons_number(String city, Integer personsNbr, String typeLodging, String catLodging);


   // List<Lodging> findByAdditionalServiceList(Long id);
    List<Lodging>findByReservationsDateStartBetweenAndReservationsDateEndBetween( Date startDate, Date endDate,Date startDate1, Date endDate1);

}
