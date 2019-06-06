package alfresco.s.api.login.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ServiceMobileDocuments {
    private int totalItems;
    private List<Item> items;

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return
                "ServiceMobileDocuments{" +
                        "totalItems = '" + totalItems + '\'' +
                        ",items = '" + items + '\'' +
                        "}";
    }

}