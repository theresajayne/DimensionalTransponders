package com.github.theresajayne.dimensionaltransponders.blocks;

import com.github.theresajayne.dimensionaltransponders.DimensionalTransponders;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        GameRegistry.registerBlock(transponder = new Transponder("transponder"),"transponder");

    }
}
