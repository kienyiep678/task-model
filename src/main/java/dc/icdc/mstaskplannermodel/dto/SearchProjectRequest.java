package dc.icdc.mstaskplannermodel.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchProjectRequest {
    @JsonProperty(value = "sort_type")
    private String sortType;
    @JsonProperty(value = "filter_project_status")
    private String projectStatus;

    @JsonProperty(value = "search_term")
    private String searchTerm = "";
    @JsonProperty(value = "page_size")
    private int pageSize = 10;
    @JsonProperty(value = "page")
    private int pageNo = 1;
    @JsonProperty(value = "sort_by")
    private String sortBy = null;
}
