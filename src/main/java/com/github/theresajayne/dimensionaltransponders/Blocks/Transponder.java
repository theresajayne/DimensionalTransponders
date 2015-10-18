package com.github.theresajayne.dimensionaltransponders.Blocks;

import com.github.theresajayne.dimensionaltransponders.DimensionalTransponders;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Theresa on 17/10/2015.
 */
public class Transponder extends Block
{
    public Transponder(String unlocalizedName, Material material, float hardness, float resistance)
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(DimensionalTransponders.dimensionalTransponderTab);
    }
}
