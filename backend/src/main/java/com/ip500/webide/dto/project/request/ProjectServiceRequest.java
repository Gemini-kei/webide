package com.ip500.webide.dto.project.request;

import com.ip500.webide.domain.project.Project;
import com.ip500.webide.domain.user.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProjectServiceRequest {

    private String name;
    private String description;

    @Builder
    private ProjectServiceRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project toEntity(Long ownerId) {
        return Project.builder()
                      .name(name)
                      .description(description)
                      .ownerId(ownerId)
                      .build();
    }
}
