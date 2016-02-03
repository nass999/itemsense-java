package com.impinj.itemsense.client.coordinator.zonemap;

/**
 * Created by jcombopi on 1/25/16.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZoneMap {
    private String name;
    private String facility;
    private Zone[] zones;
}
