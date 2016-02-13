
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class DescentExiles
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private WorldAreas WorldAreasKey;
    @Order(2)
    private Characters CharactersKey;
    @Order(3)
    private MonsterVarieties MonsterVarietiesKey;
    @Order(4)
    private int Unknown7;

}
