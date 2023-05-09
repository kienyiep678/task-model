package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Builder
@Setter
public class SearchSuggestionResponse {
@JsonProperty(value="suggestions")
private List<String> suggestions;



}
