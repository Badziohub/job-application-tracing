package com.bbportfolio.personaljobtracker.jobad.dto;


import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record JobAdRequestDto(String cityInOffer,
                              @NotBlank
                              String companyName,
                              String position,
                              Integer yearsOfExpRequired,
                              @NotBlank
                              LocalDate applicationDate,
                              LocalDate responseDate,
                              String interviewFeedback,
                              String myFeedback,
                              @NotBlank
                              String adLink) {
}
