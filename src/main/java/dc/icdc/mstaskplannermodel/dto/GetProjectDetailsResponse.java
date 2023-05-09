package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProjectDetailsResponse {
        @JsonProperty(value = "id")
        private String id;
        @JsonProperty(value = "project_name")
        private String projName;
        @JsonProperty(value = "start_date")
        private Date startDate;
        @JsonProperty(value = "end_date")
        private Date endDate;
        @JsonProperty(value = "pic")
        private String pic;
        @JsonProperty(value = "project_status")
        private int projStatus;
        @JsonProperty(value = "priority")
        private String priority;
        @JsonProperty(value = "project_type")
        private String projType;
        @JsonProperty(value = "account")
        private GetProjectDetailsResponse.ProjectAccountResponse projectAccountResponse;
        @JsonProperty(value = "project_roles")
        private List<GetProjectDetailsResponse.ProjectRolesResponse> projectRolesResponse;
        @JsonProperty(value = "project_resources")
        private List<ProjectResourcesResponse> projectResourcesResponse;
        @JsonProperty(value = "project_skills")
        private List<GetProjectDetailsResponse.ProjectSkillRequiredResponse> projectSkillResponse;
        @JsonProperty(value = "project_locations")
        private List<GetProjectDetailsResponse.ProjectLocationsResponse> projectLocationsResponse;
    @JsonProperty(value = "availability")
    private GetProjectDetailsResponse.ProjectAvailabilityResponse projectAvailabilityResponse;
    //private List<GetProjectDetailsResponse.ProjectAvailabilityResponse> projectAvailabilityResponse;

    @Builder
    public static class ProjectRolesResponse{
        @JsonProperty(value="project_role")
        private String projectRole;
        @JsonProperty(value="count")
        private int count;
        @JsonProperty(value="id")
        private String id;
    }
    @Builder
    public static class ProjectAccountResponse{
        @JsonProperty(value="account_name")
        private String AccountName;

        @JsonProperty(value="id")
        private String id;
    }

    @Builder
    public static class ProjectResourcesResponse{
        @JsonProperty(value = "id")
        private String id;
        @JsonProperty(value = "remarks")
        private String remarks;
        @JsonProperty(value = "role")
        private String projRole;
        @JsonProperty(value = "email")
        private String email;
        @JsonProperty(value = "resource_name")
        private String resourceName;
        @JsonProperty(value = "user_id")
        private String userId;
        @JsonProperty(value = "tech_id")
        private String techId;
        @JsonProperty(value = "skills")
        private String skills;
    }
    @Builder
    @Getter
    public static class ProjectSkillRequiredResponse{
        @JsonProperty(value = "id")
        private String id;
        @JsonProperty(value = "skill_name")
        private String skill;

    }
    @Builder
    public static class ProjectLocationsResponse{
        @JsonProperty(value = "id")
        private String id;
        @JsonProperty(value = "location_name")
        private String location;
    }

    @Builder
    public static class ProjectAvailabilityResponse{
//        @JsonProperty(value = "status")
//        private int status;
        @JsonProperty(value = "availability_period")
        private List<Integer> availablePeriod;
        @JsonProperty(value = "id")
        private String id;
    }


}
