
package net.mcreator.vanillaexpanded.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.vanillaexpanded.itemgroup.VanillaexpandedItemGroup;
import net.mcreator.vanillaexpanded.VanillaExpandedModElements;

@VanillaExpandedModElements.ModElement.Tag
public class LeatherparticleItem extends VanillaExpandedModElements.ModElement {
	@ObjectHolder("vanilla_expanded:leatherparticle")
	public static final Item block = null;
	public LeatherparticleItem(VanillaExpandedModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(VanillaexpandedItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("leatherparticle");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
