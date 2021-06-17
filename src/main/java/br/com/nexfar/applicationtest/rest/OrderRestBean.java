package br.com.nexfar.applicationtest.rest;

import br.com.nexfar.applicationtest.holder.TotalHolder;
import br.com.nexfar.applicationtest.payload.Search;
import org.bson.Document;

import java.util.List;
import java.util.Map;

public interface OrderRestBean {

    List<Document> list(String email);

    List<Document> search(String email, Search search);

    TotalHolder total(String email);

    List<Map<String, Integer>> totalByClient(String email);

}
