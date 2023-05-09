package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProjectRequest {
    @JsonProperty(value = "id")
    private String projID;
    @JsonProperty(value = "project_name")
    private String projName;
    @JsonProperty(value = "pic")
    private String pic;
    @JsonProperty(value = "project_status")
    private int projStatus;
    @JsonProperty(value = "priority")
    private String priority;
    @JsonProperty(value = "project_type")
    private String projType;
    @JsonProperty(value = "start_date")
    private Date startDate;
    @JsonProperty(value = "end_date")
    private Date endDate;
//    @JsonProperty(value = "skill")
//    private int[] skill;
//    @JsonProperty(value = "location")
//    private int[] location;

    @JsonProperty(value = "project_roles")
    private List<ProjectRoleReqRequest> projectRoleReqRequestsList;

    @JsonProperty(value = "account")
    private ProjectAccountRequest projectAccountRequestsList;

    @JsonProperty(value = "availability")
    private AvailabilityRequest availabilityRequestsList;

    @JsonProperty(value = "project_resources")
    private List<ResourcesRequest> resourcesRequestsList;

    @JsonProperty(value = "project_skills")
    private List<ProjectSkillRequest> projectSkill;
    @JsonProperty(value = "project_locations")
    private List<ProjectLocationsRequest> projectLocations;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProjectRoleReqRequest {
        @JsonProperty(value = "count")
        private int count;
        @JsonProperty(value = "project_role")
        private String projectRole;
        @JsonProperty(value="id")
        private final String id = null;
        @JsonProperty(value="deleted")
        private boolean deleted =false;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AvailabilityRequest {
        @JsonProperty(value = "period")
        private int[] availablePeriod;
        @JsonProperty(value = "availability_id")
        private String availableID;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResourcesRequest {
        @JsonProperty(value = "id")
        private String id = null;
        @JsonProperty(value = "remarks")
        private String remarks;
        @JsonProperty(value = "role")
        private String role;
        @JsonProperty(value = "email")
        private String email;
        @JsonProperty(value = "name")
        private String resourceName;
        @JsonProperty(value = "user_id")
        private String userID;
        @JsonProperty(value = "tech_id")
        private String techID;
        @JsonProperty(value = "deleted")
        private boolean deleted = false;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProjectAccountRequest {
        @JsonProperty(value = "account_name")
        private String accName;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class  ProjectSkillRequest{
        @JsonProperty(value = "id")
        private int id;
        @JsonProperty(value = "skill_name")
        private String skill;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProjectLocationsRequest {
        @JsonProperty(value = "id")
        private int id;
        @JsonProperty(value = "location_name")
        private String location;
    }
}
