package com.bbportfolio.personaljobtracker.jobads.dto;

import java.time.LocalDate;

public record JobAdResponseDto(Long id,
                               String cityInOffer,
                               String companyName,
                               String position,
                               Integer yearsOfExpRequired,
                               LocalDate applicationDate,
                               LocalDate responseDate,
                               String interviewFeedback,
                               String myFeedback,
                               String adLink,
                               String responseLink,
                               boolean deletedPersonalData,
                               String dataDeletionAddress) {
}
