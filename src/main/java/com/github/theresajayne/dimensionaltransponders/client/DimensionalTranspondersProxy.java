package com.github.theresajayne.dimensionaltransponders.client;

import com.github.theresajayne.dimensionaltransponders.client.render.blocks.BlockRenderRegister;
import com.github.theresajayne.dimensionaltransponders.common.DimensionalTranspondersCommonProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Created by Theresa on 18/10/2015.
 */
public class DimensionalTranspondersProxy extends DimensionalTranspondersCommonProxy
{
    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        BlockRenderRegister.registerBlockRenderer();
    }
}
