package com.esprit.offer.Service;

import com.esprit.offer.Exception.OffreNotFoundException;
import com.esprit.offer.Model.Offre;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface OffreService {
     List<Offre> getAllOffres();
     Optional<Offre> getOffreById(UUID id);
     Offre createOffre(Offre Offre);
     Offre updateOffre(Offre Offre, UUID id) throws OffreNotFoundException;
     void deleteOffre(UUID id);
}
