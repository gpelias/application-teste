package br.com.nexfar.applicationtest.rest;

import br.com.nexfar.applicationtest.holder.TotalHolder;
import br.com.nexfar.applicationtest.payload.Search;
import org.bson.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public interface OrderRestController {

    @GetMapping("/list")
    ResponseEntity<List<Document>> list();

    @PostMapping("/search")
    ResponseEntity<List<Document>> search(@RequestBody Search search);

    @GetMapping("/total")
    ResponseEntity<TotalHolder> total();

    @GetMapping("/total-by-client")
    ResponseEntity<List<Map<String, Integer>>> totalByClient();
}
