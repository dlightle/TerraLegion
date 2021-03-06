package com.jmr.terraria.game.item.impl;

import com.jmr.terraria.engine.views.drawables.Drawable;
import com.jmr.terraria.game.world.block.BlockType;
import com.jmr.terraria.game.item.ItemType;

/**
 * Created by Jon on 10/6/15.
 */
public class HammerItem extends ToolItem {

	public HammerItem(ItemType type, String name, Drawable icon, int maxItemStack, float damage, float power, float reach, float useDelay) {
		super(type, name, icon, maxItemStack, damage, power, reach, useDelay);
	}

	public boolean canDamageBlock(BlockType type) {
		return false;
	}

}
