package com.github.theresajayne.dimensionaltransponders.blocks;

import com.github.theresajayne.dimensionaltransponders.DimensionalTransponders;
import com.github.theresajayne.dimensionaltransponders.tileentities.TransponderTE;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Theresa on 17/10/2015.
 */
public class Transponder extends BlockContainer
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

    @Override
    public TileEntity createNewTileEntity(World world,int var)
    {
        return new TransponderTE();
    }

    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int i, int j, int k, int l)
    {
        return false;
    }
    @Override
    public int getRenderType() { return 3; }

    @Override
    public boolean isOpaqueCube() { return false; }

    @Override
    public boolean isFullCube() { return false; }

    @Override
    public boolean isVisuallyOpaque() { return false; }
}
