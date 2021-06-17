package br.com.nexfar.applicationtest.facade;

import br.com.nexfar.applicationtest.holder.TotalHolder;
import br.com.nexfar.applicationtest.payload.Search;
import br.com.nexfar.applicationtest.service.OrderService;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderFacadeImpl implements OrderFacade {

    final
    OrderService orderService;

    public OrderFacadeImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public List<Document> list(String email) {
        return parseObjectIdToString(orderService.list(email));
    }

    @Override
    public List<Document> search(String email, Search search) {
        return orderService.search(email, search);
    }

    @Override
    public TotalHolder total(String email) {
        return TotalHolder.builder().total(orderService.total(email)).build();
    }

    @Override
    public List<Map<String, Integer>> totalByClient(String email) {
        List<Document> documentList = orderService.totalByClient(email);
        List<Map<String, Integer>> totalByClient = new ArrayList<>();
        if (documentList != null) {
            for (Document document : documentList) {
                Map<String, Integer> map = new HashMap<>();
                map.put(document.get("_id", Integer.class).toString(), document.get("count", Integer.class));
                totalByClient.add(map);
            }
        }

        return totalByClient;
    }

    private List<Document> parseObjectIdToString(List<Document> list) {
        for (Document item : list) {
            ObjectId mainSellerID = item.get("mainSeller", Document.class).get("id", ObjectId.class);
            item.get("mainSeller", Document.class).put("id", mainSellerID.toHexString());

            List<?> salesSupervisorsIds = (List<?>) item.get("mainSeller", Document.class).get("salesSupervisors", List.class);


            if (salesSupervisorsIds != null) {
                List<String> objectIdString = new ArrayList<>();
                for (Object objectId : salesSupervisorsIds) {
                    objectIdString.add(((ObjectId) objectId).toHexString());
                }
                item.get("mainSeller", Document.class).put("salesSupervisors", objectIdString);
            }

            List<?> items = (List<?>) item.get("items", List.class);
            if (items != null) {
                for (Object it : items) {
                    ObjectId objectId = ((Document) it).get("product", Document.class).get("id", ObjectId.class);
                    ((Document) it).get("product", Document.class).put("id", objectId.toHexString());
                }
            }

            List<?> payments = (List<?>) item.get("payment", List.class);
            if (payments != null) {
                for (Object it : payments) {
                    ObjectId objectId = ((Document) it).get("paymentCondition", Document.class).get("id", ObjectId.class);
                    ((Document) it).get("paymentCondition", Document.class).put("id", objectId.toHexString());
                }
            }

            List<?> promotionItems = (List<?>) item.get("promotionItems", List.class);
            if (promotionItems != null) {
                for (Object it : promotionItems) {
                    List<?> promotion = ((Document) it)
                            .get("promotion", Document.class)
                            .get("items", List.class);
                    if (promotion != null) {
                        List<?> itemsList = ((Document) it)
                                .get("promotion", Document.class)
                                .get("items", List.class);
                        for (Object it2 : itemsList) {
                            ObjectId objectId = ((Document) it2)
                                    .get("product", Document.class)
                                    .get("id", ObjectId.class);
                            ((Document) it2)
                                    .get("product", Document.class)
                                    .put("id", objectId.toHexString());
                        }
                    }
                    List<?> subsidizedItems = ((Document) it)
                            .get("promotion", Document.class)
                            .get("subsidizedItems", List.class);
                    if (subsidizedItems != null) {
                        for (Object it3 : subsidizedItems) {
                            ObjectId objectId = ((Document) it3)
                                    .get("product", Document.class)
                                    .get("id", ObjectId.class);
                            ((Document) it3)
                                    .get("product", Document.class)
                                    .put("id", objectId.toHexString());
                        }
                    }
                }
            }
            List<?> sellerManagers = (List<?>) item
                    .get("mainSeller", Document.class)
                    .get("sellerManagers", List.class);
            if (sellerManagers != null) {
                List<String> objectIdString = new ArrayList<>();
                for (Object objectId : sellerManagers) {
                    objectIdString.add(((ObjectId) objectId).toHexString());
                }
                item.get("mainSeller", Document.class).put("sellerManagers", objectIdString);
            }
        }
        return list;
    }

}
