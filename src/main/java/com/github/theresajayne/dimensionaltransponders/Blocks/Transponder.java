package com.github.theresajayne.dimensionaltransponders.blocks;

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
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public Transponder(String unlocalizedName, float hardness, float resistance)
    {
        this(unlocalizedName,Material.glass,hardness,resistance);
    }

    public Transponder(String unlocalizedName)
    {
        this(unlocalizedName,1.0f,10.0f);
    }
}
