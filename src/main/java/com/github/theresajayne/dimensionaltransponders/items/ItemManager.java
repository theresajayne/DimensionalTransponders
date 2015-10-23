package com.github.theresajayne.dimensionaltransponders.items;

import com.github.theresajayne.dimensionaltransponders.blocks.BlockManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Theresa on 18/10/2015.
 */
public class ItemManager {

    public static void createItems(){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(BlockManager.transponder), 0, new ModelResourceLocation("dimensionaltransponders:block/transponder", "inventory"));
    }
}
