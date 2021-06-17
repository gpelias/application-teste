package br.com.nexfar.applicationtest.rest;

import br.com.nexfar.applicationtest.facade.OrderFacade;
import br.com.nexfar.applicationtest.holder.TotalHolder;
import br.com.nexfar.applicationtest.payload.Search;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderRestBeanImpl implements OrderRestBean {

    private final OrderFacade orderFacade;

    public OrderRestBeanImpl(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @Override
    public List<Document> list(String email) {
        return orderFacade.list(email);
    }

    @Override
    public List<Document> search(String email, Search search) {
        return orderFacade.search(email, search);
    }

    @Override
    public TotalHolder total(String email) {
        return orderFacade.total(email);
    }

    @Override
    public List<Map<String, Integer>> totalByClient(String email) {
        return orderFacade.totalByClient(email);
    }
}
