package com.emc.ideaforce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "challenges")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeDetail {

    @Id
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

}
