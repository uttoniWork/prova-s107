package backendimc.controller;

import backendimc.entity.ImcDetails;
import backendimc.service.ImcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/imc")
public class ImcController {

    private final ImcService imcService;

    public ImcController(ImcService imcService) {
        this.imcService = imcService;
    }

    @CrossOrigin(origins = "http://localhost:15003/imc")
    @PostMapping
    public ResponseEntity<ImcDetails> postImc(@Valid @RequestBody ImcDetails imcDetails) {
        return ResponseEntity.ok(imcService.saveImc(imcDetails));
    }

    @CrossOrigin(origins = "http://localhost:15003/imc")
    @GetMapping
    public ResponseEntity<List<ImcDetails>> getImcs() {
        return ResponseEntity.ok(imcService.listImcs());
    }
}
