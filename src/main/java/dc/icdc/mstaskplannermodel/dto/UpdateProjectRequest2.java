package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateProjectRequest2 {
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "project_name")
    @NonNull
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
    private UpdateProjectRequest2.ProjectAccount projectAccount;
    @JsonProperty(value = "project_roles")
    private List<UpdateProjectRequest2.ProjectRoles> projectRoles;
    @JsonProperty(value = "project_resources")
    private List<ProjectResources> projectResources;
    @JsonProperty(value = "project_skills")
    private List<UpdateProjectRequest2.ProjectSkillRequired> projectSkill;
    @JsonProperty(value = "project_locations")
    private List<UpdateProjectRequest2.ProjectLocations> projectLocations;
    @JsonProperty(value = "availability")
    private UpdateProjectRequest2.ProjectAvailability projectAvailability;

    @Getter
    public static class ProjectRoles{
        @JsonProperty(value="project_role")
        private String projectRole;
        @JsonProperty(value="count")
        private int count;
        @JsonProperty(value="id")
        private final String id = null;
        @JsonProperty(value="deleted")
        private boolean deleted =false;
    }
    @Getter
    public static class ProjectAccount{
        @JsonProperty(value="account_name")
        private String AccountName;

        @JsonProperty(value="id")
        private String id;
    }

    @Getter
    public static class ProjectResources{
        @JsonProperty(value = "id")
        private String id = null;
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
        @JsonProperty(value = "deleted")
        private boolean deleted = false;
    }

    @Getter
    public static class ProjectSkillRequired{
        @JsonProperty(value = "id")
        private int id;
        @JsonProperty(value = "skill_name")
        private String skill;
    }
    @Getter
    public static class ProjectLocations{
        @JsonProperty(value = "id")
        private int id;
        @JsonProperty(value = "location_name")
        private String location;
    }

    @Getter
    public static class ProjectAvailability{
//        @JsonProperty(value = "status")
//        private int status;
        @JsonProperty(value = "availability_period")
        private List<Integer> availablePeriod;
        @JsonProperty(value = "id")
        private final String id = null;
//        @JsonProperty(value = "deleted")
//        private boolean deleted = false;

    }


}
