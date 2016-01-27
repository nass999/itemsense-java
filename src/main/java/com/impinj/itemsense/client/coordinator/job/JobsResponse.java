/**
 * IMPINJ CONFIDENTIAL AND PROPRIETARY
 * <p>
 * This source code is the sole property of Impinj, Inc. Reproduction or utilization of this source
 * code in whole or in part is forbidden without the prior written consent of Impinj, Inc.
 * <p>
 * (c) Copyright Impinj, Inc. 2015. All rights reserved.
 */
package com.impinj.itemsense.client.coordinator.job;

import lombok.Data;

/**
 * Represents a response from the jobs endpoint
 *
 * @author Daniel Burton
 */
@Data
public class JobsResponse {
    String id;
    JobStatus status;
    // TODO: Create a date/time deserializer for this:
    String statusLastUpdated;
    Job job;
}
