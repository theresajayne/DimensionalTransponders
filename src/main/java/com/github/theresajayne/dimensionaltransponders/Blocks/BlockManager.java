package com.github.theresajayne.dimensionaltransponders.Blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Central point for block registration
 * Created by Theresa on 18/10/2015.
 */
public class BlockManager
{

    public static Transponder transponder;

    public static void createBlocks()
    {
        GameRegistry.registerBlock(transponder = new Transponder("dim_transponder"),"transponder");
    }
}
