package com.bbportfolio.personaljobtracker.jobad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_ad")
public class JobAdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cityInOffer;

    @NotNull
    private String companyName;

    private String position;

    private Integer yearsOfExpRequired;

    @Enumerated(value = EnumType.STRING)
    private OfficePresence officePresence;

    @NotNull
    private LocalDate applicationDate;

    private LocalDate responseDate;

    private String interviewFeedback;

    private String myFeedback;

    @NotNull
    private String adLink;

    private String responseLink;

    private boolean deletedPersonalData;

    private String dataDeletionAddress;


}
