package com.github.theresajayne.dimensionaltransponders.items;

import com.github.theresajayne.dimensionaltransponders.blocks.BlockManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Theresa on 18/10/2015.
 */
public class RecipeManager {

    public static void addRecipes(){
        GameRegistry.addRecipe(new ItemStack(BlockManager.transponder), "idi", " i ", "bbb", 'i', Items.iron_ingot, 'd', Items.diamond, 'b', Blocks.iron_block);
    }
}
