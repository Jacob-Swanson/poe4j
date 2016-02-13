
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MissionTileMap
    extends BaseRow
{

    @Order(0)
    private NPCMaster NPCMasterKey;
    @Order(1)
    private Long MissionKey;
    @Order(2)
    private List<WorldAreas> WorldAreasKeys;

}
