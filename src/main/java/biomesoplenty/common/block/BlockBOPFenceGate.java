/*******************************************************************************
 * Copyright 2014, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/

package biomesoplenty.common.block;

import biomesoplenty.api.block.IBOPBlock;
import biomesoplenty.common.item.ItemBOPBlock;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class BlockBOPFenceGate extends BlockFenceGate implements IBOPBlock
{
 
    // implement IBOPBlock
    // properties inherited from BlockFenceGate: FACING, OPEN, POWERED, IN_WALL
    @Override
    public Class<? extends ItemBlock> getItemClass() { return ItemBOPBlock.class; }
    @Override
    public int getItemRenderColor(IBlockState state, int tintIndex) { return this.getRenderColor(state); }
    @Override
    public IProperty[] getPresetProperties() { return new IProperty[] {}; }
    @Override
    public IProperty[] getNonRenderingProperties() { return new IProperty[] {POWERED}; }
    @Override
    public String getStateName(IBlockState state) {return "";}

    
    public BlockBOPFenceGate()
    {
        super();
        this.setHarvestLevel("axe", 0);
    }
    
}
    