package backendimc.service;

import backendimc.entity.ImcDetails;
import backendimc.repository.ImcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImcService {

    private final ImcRepository imcRepository;

    public ImcService(ImcRepository imcRepository) {
        this.imcRepository = imcRepository;
    }

    public ImcDetails saveImc(ImcDetails imcDetails) {
        return imcRepository.save(imcDetails);
    }

    public List<ImcDetails> listImcs() {
        return imcRepository.findAll();
    }
}
