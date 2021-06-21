
package net.mcreator.vanillaexpanded.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.vanillaexpanded.VanillaExpandedModElements;

@VanillaExpandedModElements.ModElement.Tag
public class LeatherSwordItem extends VanillaExpandedModElements.ModElement {
	@ObjectHolder("vanilla_expanded:leather_sword")
	public static final Item block = null;
	public LeatherSwordItem(VanillaExpandedModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("leather_sword"));
	}
}
