package backendimc.controller;

import backendimc.entity.ImcDetails;
import backendimc.service.ImcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/imc")
public class ImcController {

    private final ImcService imcService;

    public ImcController(ImcService imcService) {
        this.imcService = imcService;
    }

    @PostMapping
    public ResponseEntity<ImcDetails> postImc(@Valid @RequestBody ImcDetails imcDetails) {
        return ResponseEntity.ok(imcService.saveImc(imcDetails));
    }
}
