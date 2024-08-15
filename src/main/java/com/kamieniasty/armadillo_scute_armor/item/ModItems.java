package com.kamieniasty.armadillo_scute_armor.item;

import com.kamieniasty.armadillo_scute_armor.ArmadilloScuteArmor;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArmadilloScuteArmor.MOD_ID);

    public static final Supplier<Item> ARMADILLO_PLAYER_HELMET = ITEMS.register("armadillo_player_helmet",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final Supplier<Item> ARMADILLO_PLAYER_CHESTPLATE = ITEMS.register("armadillo_player_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));
    public static final Supplier<Item> ARMADILLO_PLAYER_LEGGINGS = ITEMS.register("armadillo_player_leggings",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.LEGGINGS.getDurability(10))));
    public static final Supplier<Item> ARMADILLO_PLAYER_BOOTS = ITEMS.register("armadillo_player_boots",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.BOOTS.getDurability(10))));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}


