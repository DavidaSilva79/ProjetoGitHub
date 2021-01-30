package br.com.socin.projetosocin.util;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Welcome {
    private long totalCount;
    private boolean incompleteResults;
    private List<Item> items;

    @JsonProperty("total_count")
    public long getTotalCount() { return totalCount; }
    @JsonProperty("total_count")
    public void setTotalCount(long value) { this.totalCount = value; }

    @JsonProperty("incomplete_results")
    public boolean getIncompleteResults() { return incompleteResults; }
    @JsonProperty("incomplete_results")
    public void setIncompleteResults(boolean value) { this.incompleteResults = value; }

    @JsonProperty("items")
    public List<Item> getItems() { return items; }
    @JsonProperty("items")
    public void setItems(List<Item> value) { this.items = value; }
}
