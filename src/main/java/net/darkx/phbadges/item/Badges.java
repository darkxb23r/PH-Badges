package net.darkx.phbadges.item;

import net.darkx.phbadges.PHBadges;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Badges {
    public static final Item LIGHTNING_BADGE = registerBadge("lightning_badge", new Item(new Item.Settings()));
    public static final Item VOLCANO_BADGE = registerBadge("volcano_badge", new Item(new Item.Settings()));
    public static final Item MECHANICAL_BADGE = registerBadge("mechanical_badge", new Item(new Item.Settings()));
    public static final Item GHOST_BADGE = registerBadge("ghost_badge", new Item(new Item.Settings()));
    public static final Item NORMAL_BADGE = registerBadge("normal_badge", new Item(new Item.Settings()));
    public static final Item AIR_BALLOON_BADGE = registerBadge("air_balloon_badge", new Item(new Item.Settings()));
    public static final Item TRIDENT_BADGE = registerBadge("trident_badge", new Item(new Item.Settings()));

    private static Item registerBadge(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PHBadges.MOD_ID, name), item);
    }

    public static void registerBadges() {
        PHBadges.LOGGER.info("Registering Badges for " + PHBadges.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LIGHTNING_BADGE);
            entries.add(VOLCANO_BADGE);
            entries.add(TRIDENT_BADGE);
            entries.add(NORMAL_BADGE);
            entries.add(GHOST_BADGE);
            entries.add(AIR_BALLOON_BADGE);
            entries.add(MECHANICAL_BADGE);
        });
    }
}
