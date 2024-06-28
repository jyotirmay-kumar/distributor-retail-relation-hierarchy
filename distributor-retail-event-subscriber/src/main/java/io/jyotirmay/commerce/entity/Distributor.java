package io.jyotirmay.commerce.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Distributor {

	private String distributorId;

    private String distributorName;

    private String distributorHierarchy;

    private String region;

    private String eventStatus;

    private Date createdOn;

    private Date updatedOn;
}
