package br.com.socin.projetosocin.util;

import com.fasterxml.jackson.annotation.*;

import br.com.socin.projetosocin.model.GitUser;

import java.util.List;

public class Util {
    private long totalCount;
    private boolean incompleteResults;
    private List<GitUser> items;

    @JsonProperty("total_count")
    public long getTotalCount() { return totalCount; }
    @JsonProperty("total_count")
    public void setTotalCount(long value) { this.totalCount = value; }

    @JsonProperty("incomplete_results")
    public boolean getIncompleteResults() { return incompleteResults; }
    @JsonProperty("incomplete_results")
    public void setIncompleteResults(boolean value) { this.incompleteResults = value; }

    @JsonProperty("items")
    public List<GitUser> getItems() { return items; }
    @JsonProperty("items")
    public void setItems(List<GitUser> value) { this.items = value; }
}
