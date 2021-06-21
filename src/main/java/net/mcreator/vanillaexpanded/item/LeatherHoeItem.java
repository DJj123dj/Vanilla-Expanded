
package net.mcreator.vanillaexpanded.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.vanillaexpanded.VanillaExpandedModElements;

@VanillaExpandedModElements.ModElement.Tag
public class LeatherHoeItem extends VanillaExpandedModElements.ModElement {
	@ObjectHolder("vanilla_expanded:leather_hoe")
	public static final Item block = null;
	public LeatherHoeItem(VanillaExpandedModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 10;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return -2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.LEATHER, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("leather_hoe"));
	}
}
