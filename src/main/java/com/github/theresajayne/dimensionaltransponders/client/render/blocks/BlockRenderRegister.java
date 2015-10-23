package com.github.theresajayne.dimensionaltransponders.client.render.blocks;

import com.github.theresajayne.dimensionaltransponders.blocks.BlockManager;
import com.github.theresajayne.dimensionaltransponders.DimensionalTransponders;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Theresa on 18/10/2015.
 */
public final class BlockRenderRegister
{
    public static String modid = DimensionalTransponders.MODID;

    public static void registerBlockRenderer()
    {
        reg(BlockManager.transponder);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
