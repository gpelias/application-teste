package br.com.nexfar.applicationtest.rest;

import br.com.nexfar.applicationtest.holder.TotalHolder;
import br.com.nexfar.applicationtest.payload.Search;
import org.bson.Document;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderRestControllerImpl implements OrderRestController {

    private final OrderRestBean orderRestBean;

    public OrderRestControllerImpl(OrderRestBean orderRestBean) {
        this.orderRestBean = orderRestBean;
    }

    @Override
    public ResponseEntity<List<Document>> list() {
        String email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        return ResponseEntity.status(HttpStatus.OK).body(orderRestBean.list(email));
    }

    @Override
    public ResponseEntity<List<Document>> search(Search search) {
        String email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        return ResponseEntity.status(HttpStatus.OK).body(orderRestBean.search(email, search));
    }

    @Override
    public ResponseEntity<TotalHolder> total() {
        String email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        return ResponseEntity.status(HttpStatus.OK).body(orderRestBean.total(email));
    }

    @Override
    public ResponseEntity<List<Map<String, Integer>>> totalByClient() {
        String email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        return ResponseEntity.status(HttpStatus.OK).body(orderRestBean.totalByClient(email));
    }
}
