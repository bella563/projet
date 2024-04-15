package service;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Dossier;
import com.app_gestion_patient.projet_de_suivi_patients.repository.DossierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DossierService {

    @Autowired
    private DossierRepository dossierRepository;

    // Récupérer tous les dossiers
    public List<Dossier> getAllDossiers() {
        return dossierRepository.findAll();
    }

    // Ajouter un nouveau dossier
    public Dossier createDossier(Dossier dossier) {
        return dossierRepository.save(dossier);
    }

    // Modifier un dossier existant
    public Dossier updateDossier(Long id, Dossier dossierDetails) {
        Optional<Dossier> optionalDossier = dossierRepository.findById(id);
        if (optionalDossier.isPresent()) {
            Dossier existingDossier = optionalDossier.get();
            existingDossier.setNumero(dossierDetails.getNumero());
            existingDossier.setDateCreation(dossierDetails.getDateCreation());
            existingDossier.setAgentCreateur(dossierDetails.getAgentCreateur());
            existingDossier.setAntecedent(dossierDetails.getAntecedent());
            return dossierRepository.save(existingDossier);
        } else {
            // Gérer le cas où le dossier n'est pas trouvé
            // Vous pouvez lancer une exception ou retourner null, selon vos besoins
            return null;
        }
    }

    // Supprimer un dossier
    public void deleteDossier(Long id) {
        dossierRepository.deleteById(id);
    }
}
