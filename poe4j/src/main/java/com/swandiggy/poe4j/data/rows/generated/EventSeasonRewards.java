
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class EventSeasonRewards
    extends BaseRow
{

    @Order(0)
    private EventSeason EventSeasonKey;
    @Order(1)
    private int Point;
    @Order(2)
    private String RewardCommand;

}
