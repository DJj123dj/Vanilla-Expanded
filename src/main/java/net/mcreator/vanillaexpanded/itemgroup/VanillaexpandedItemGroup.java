
package net.mcreator.vanillaexpanded.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.vanillaexpanded.VanillaExpandedModElements;

@VanillaExpandedModElements.ModElement.Tag
public class VanillaexpandedItemGroup extends VanillaExpandedModElements.ModElement {
	public VanillaexpandedItemGroup(VanillaExpandedModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvanillaexpanded") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.ZOMBIE_HEAD, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
