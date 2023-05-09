package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

import java.util.Date;

@Data
public class ProjectDetailsResponse {

    public ProjectDetailsResponse(String id, String projName, String startDate, String endDate, String pic, String projStatus, String priority, String projType, String accName, int roles, Date createdDate) {
        this.id = id;
        this.projName = projName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pic = pic;
        this.projStatus = projStatus;
        this.priority = priority;
        this.projType = projType;
        this.Roles = roles;
        this.accName = accName;
        this.createdDate = createdDate;

    }
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "project_name")
    private String projName;
    @JsonProperty(value = "start_date")
    private String startDate;
    @JsonProperty(value = "end_date")
    private String endDate;

    @JsonProperty(value = "pic")
    private String pic;
    @JsonProperty(value = "project_status")
    private String projStatus;
    @JsonProperty(value = "priority")
    private String priority;
    @JsonProperty(value ="project_type")
    private String projType;
    @JsonProperty(value ="roles_total")
    private int Roles;
    @JsonProperty(value = "account_name")
    private String accName;

    @JsonProperty(value = "created_date")
    private Date createdDate;



}
