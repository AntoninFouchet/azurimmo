package bts.sio.azurimmo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import bts.sio.azurimmo.model.dto.BatimentDTO;
import bts.sio.azurimmo.service.BatimentService;

@RestController
@RequestMapping("/api/batiments")
public class BatimentController {

    @Autowired 
    private BatimentService batimentService; 
    
    @GetMapping("/")
    public List<BatimentDTO> getAllBatiments() {
        return batimentService.getBatimentsDTO(); 
    }
    

/*    
    @GetMapping("/{batimentId}")
    public Optional <BatimentDTO> getBatimentDTO(@PathVariable long batimentId) {
        return batimentService.getBatimentDTO(batimentId);
    }
*/

    
    @GetMapping("/{batimentId}")
    public ResponseEntity<BatimentDTO> getBatimentReDTO(@PathVariable long batimentId) {
            return batimentService.getBatimentDTO(batimentId)
                                  .map(ResponseEntity::ok)   // batiment trouvé → 200
                                  .orElse(ResponseEntity.notFound().build()); // pas trouvé → 404
    }
}