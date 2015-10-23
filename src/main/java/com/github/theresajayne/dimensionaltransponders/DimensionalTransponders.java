package com.github.theresajayne.dimensionaltransponders;

import com.github.theresajayne.dimensionaltransponders.blocks.BlockManager;
import com.github.theresajayne.dimensionaltransponders.common.DimensionalTranspondersCommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Dimensional Transponders
 * Created by Theresa on 17/10/2015.
 */
@Mod(modid=DimensionalTransponders.MODID, version = DimensionalTransponders.VERSION)
public class DimensionalTransponders {

    public static final String MODID = "dimensionaltransponders";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static DimensionalTransponders instance;

    @SidedProxy(clientSide = "com.github.theresajayne.dimensionaltransponders.client.DimensionalTranspondersProxy", serverSide="com.github.theresajayne.dimensionaltransponders.common.DimensionalTranspondersCommonProxy")
    public static DimensionalTranspondersCommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        BlockManager.createBlocks();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    public static CreativeTabs dimensionalTransponderTab = new CreativeTabs("Dimensional Transponders")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
            return Items.ender_eye;
        }
    };
}
