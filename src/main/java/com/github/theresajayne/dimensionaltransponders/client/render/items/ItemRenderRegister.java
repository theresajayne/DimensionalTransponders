package com.github.theresajayne.dimensionaltransponders.client.render.items;

import com.github.theresajayne.dimensionaltransponders.DimensionalTransponders;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Theresa on 18/10/2015.
 */
public class ItemRenderRegister {

    public static String modid = DimensionalTransponders.MODID;

    public static void registerItemRenderer() {

    }

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
