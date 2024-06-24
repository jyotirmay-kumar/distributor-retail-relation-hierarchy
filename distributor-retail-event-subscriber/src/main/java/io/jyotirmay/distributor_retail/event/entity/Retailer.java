package io.jyotirmay.distributor_retail.event.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Retailer {

    private String retailedId;

    private String retailerName;

    private String directDistributor;

    private String linkedDistributors;

    private String region;

    private String eventType;

    private String operationType;

    private String eventStatus;

    private Date createdOn;

    private Date updatedOn;
}
