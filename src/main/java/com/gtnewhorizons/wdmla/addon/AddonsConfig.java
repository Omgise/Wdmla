package com.gtnewhorizons.wdmla.addon;

import com.gtnewhorizon.gtnhlib.config.Config;
import com.gtnewhorizons.wdmla.WDMla;

@Config(modid = WDMla.MODID, category = "addons", configSubDirectory = "WDMla", filename = "addons")
@Config.LangKey("option.addon.category")
public class AddonsConfig {

    public static final Core core = new Core();

    public static final Vanilla vanilla = new Vanilla();

    public static final Harvestability harvestability = new Harvestability();

    @Config.LangKey("option.core.category")
    public static class Core {

        public final DefaultBlock defaultBlock = new DefaultBlock();
        public final DefaultEntity defaultEntity = new DefaultEntity();

        public static class DefaultBlock {

            @Config.LangKey("option.core.show.icon")
            @Config.DefaultBoolean(true)
            public boolean showIcon;

            @Config.LangKey("option.core.show.blockname")
            @Config.DefaultBoolean(true)
            public boolean showBlockName;

            @Config.LangKey("option.core.show.modname")
            @Config.DefaultBoolean(true)
            public boolean showModName;
        }

        public static class DefaultEntity {

            @Config.LangKey("option.core.show.entityname")
            @Config.DefaultBoolean(true)
            public boolean showEntityName;

            @Config.LangKey("option.core.show.modname")
            @Config.DefaultBoolean(true)
            public boolean showModName;

            @Config.LangKey("option.core.maxentityhealth")
            @Config.DefaultInt(40)
            @Config.Comment("If the maximum health of an entity is above this value, texts will be shown instead of heart icons")
            public int maxEntityHealth;
        }
    }

    @Config.LangKey("option.vanilla.category")
    public static class Vanilla {

        public final RedstoneState redstoneState = new RedstoneState();
        public final Pet pet = new Pet();
        public final Animal animal = new Animal();

        public static class RedstoneState {
            @Config.LangKey("option.vanilla.leverstate")
            @Config.DefaultBoolean(true)
            public boolean showLeverState;

            @Config.LangKey("option.vanilla.repeater")
            @Config.DefaultBoolean(true)
            public boolean showRepeaterDelay;

            @Config.LangKey("option.vanilla.comparator")
            @Config.DefaultBoolean(true)
            public boolean showComparatorMode;
        }

        public static class Pet {
            @Config.LangKey("option.vanilla.show.petsitting")
            @Config.DefaultBoolean(true)
            public boolean showPetSit;

            @Config.LangKey("option.vanilla.show.petowner")
            @Config.DefaultBoolean(true)
            public boolean showPetOwner;
        }

        public static class Animal {
            @Config.LangKey("option.vanilla.show.animalgrowth")
            @Config.DefaultBoolean(true)
            public boolean showAnimalGrowth;

            @Config.LangKey("option.vanilla.show.breedcooldown")
            @Config.DefaultBoolean(true)
            public boolean showBreedCooldown;
        }
    }

    @Config.LangKey("option.harvestability.category")
    public static class Harvestability {

        public final Legacy legacy = new Legacy();
        public final Modern modern = new Modern();

        public static class Legacy {

            @Config.LangKey("option.harvestability.harvestlevel")
            @Config.DefaultBoolean(true)
            public boolean harvestLevel;

            @Config.LangKey("option.harvestability.harvestlevelnum")
            @Config.DefaultBoolean(false)
            public boolean harvestLevelNum;

            @Config.LangKey("option.harvestability.effectivetool")
            @Config.DefaultBoolean(true)
            public boolean effectiveTool;

            @Config.LangKey("option.harvestability.currentlyharvestable")
            @Config.DefaultBoolean(true)
            public boolean currentlyHarvestable;

            @Config.LangKey("option.harvestability.harvestlevel.sneakingonly")
            @Config.DefaultBoolean(false)
            public boolean harvestLevelSneakingOnly;

            @Config.LangKey("option.harvestability.harvestlevelnum.sneakingonly")
            @Config.DefaultBoolean(false)
            public boolean harvestLevelNumSneakingOnly;

            @Config.LangKey("option.harvestability.effectivetool.sneakingonly")
            @Config.DefaultBoolean(false)
            public boolean effectiveToolSneakingOnly;

            @Config.LangKey("option.harvestability.currentlyharvestable.sneakingonly")
            @Config.DefaultBoolean(false)
            public boolean currentlyHarvestableSneakingOnly;

            @Config.LangKey("option.harvestability.oresonly")
            @Config.DefaultBoolean(false)
            public boolean oresOnly;

            @Config.LangKey("option.harvestability.minimal")
            @Config.DefaultBoolean(false)
            public boolean minimal;

            @Config.LangKey("option.harvestability.unharvestableonly")
            @Config.DefaultBoolean(false)
            public boolean unHarvestableOnly;

            @Config.LangKey("option.harvestability.toolrequiredonly")
            @Config.DefaultBoolean(true)
            public boolean toolRequiredOnly;

            @Config.LangKey("option.harvestability.shearability")
            @Config.DefaultBoolean(true)
            public boolean shearability;

            @Config.LangKey("option.harvestability.shearability.sneakingonly")
            @Config.DefaultBoolean(false)
            public boolean shearabilitySneakingOnly;

            @Config.LangKey("option.harvestability.silktouchability")
            @Config.DefaultBoolean(true)
            public boolean silkTouchability;

            @Config.LangKey("option.harvestability.silktouchability.sneakingonly")
            @Config.DefaultBoolean(false)
            public boolean silkTouchabilitySneakingOnly;

            @Config.LangKey("option.harvestability.minimalseparator.string")
            @Config.DefaultString(" : ")
            public String minimalSeparatorString;

            @Config.LangKey("option.harvestability.currentlyharvestable.string")
            @Config.DefaultString("\u2714")
            public String currentlyHarvestableString;

            @Config.LangKey("option.harvestability.notcurrentlyharvestable.string")
            @Config.DefaultString("\u2718")
            public String notcurrentlyHarvestableString;

            @Config.LangKey("option.harvestability.shearability.string")
            @Config.DefaultString("\u2702")
            public String shearabilityString;

            @Config.LangKey("option.harvestability.silktouchability.string")
            @Config.DefaultString("\u2712")
            public String silkTouchabilityString;
        }

        public static class Modern {

            public final TinkersConstruct tinkersConstruct = new TinkersConstruct();

            @Config.Comment("IDs of the TiC effective pickaxe material corresponding to the harvest level.\n"
                    + "Note that the default values are tuned for GTNH Iguana tweaks (TiC itself only has the harvest level up to 6)")
            public static class TinkersConstruct {

                @Config.DefaultInt(0)
                @Config.Comment("default: wood")
                public int harvestLevel0;

                @Config.DefaultInt(13)
                @Config.Comment("default: copper")
                public int harvestLevel1;

                @Config.DefaultInt(2)
                @Config.Comment("default: iron")
                public int harvestLevel2;

                @Config.DefaultInt(14)
                @Config.Comment("default: tin")
                public int harvestLevel3;

                @Config.DefaultInt(16)
                @Config.Comment("default: redstone")
                public int harvestLevel4;

                @Config.DefaultInt(6)
                @Config.Comment("default: obsidian")
                public int harvestLevel5;

                @Config.DefaultInt(11)
                @Config.Comment("default: ardite")
                public int harvestLevel6;

                @Config.DefaultInt(10)
                @Config.Comment("default: cobalt")
                public int harvestLevel7;

                @Config.DefaultInt(12)
                @Config.Comment("default: manyullyn")
                public int harvestLevel8;

                @Config.DefaultInt(12)
                @Config.Comment("default: manyullynplus")
                public int harvestLevel9;
            }

            @Config.LangKey("option.harvestability.currentlyharvestable.string")
            @Config.DefaultString("✔")
            @Config.Comment("The string below the Harvest Tool icon after the item name")
            public String currentlyHarvestableString;

            @Config.LangKey("option.harvestability.notcurrentlyharvestable.string")
            @Config.DefaultString("✕")
            @Config.Comment("The string below the Harvest Tool icon after the item name")
            public String notCurrentlyHarvestableString;

            @Config.LangKey("option.harvestability.shearability.item")
            @Config.DefaultString("minecraft:shears")
            @Config.Comment("The icon after an item represents that the item is shearable")
            public String shearabilityItem;

            @Config.LangKey("option.harvestability.silktouchability.item")
            @Config.DefaultString("minecraft:grass")
            @Config.Comment("The icon after an item represents that the item can be harvested by silk touch")
            public String silkTouchabilityItem;

            @Config.LangKey("option.harvestability.harvestlevelnum")
            @Config.DefaultBoolean(false)
            @Config.Comment("Shows the Harvest Level number text without enabling legacy mode")
            public boolean modernHarvestLevelNum;

            @Config.LangKey("option.harvestability.currentlyHarvestable.icon")
            @Config.DefaultBoolean(true)
            public boolean modernCurrentlyHarvestableIcon;

            @Config.LangKey("option.harvestability.effectivetool.icon")
            @Config.DefaultBoolean(true)
            public boolean modernEffectiveToolIcon;

            @Config.LangKey("option.harvestability.shearability.icon")
            @Config.DefaultBoolean(true)
            public boolean modernShowShearabilityIcon;

            @Config.LangKey("option.harvestability.silktouchability.icon")
            @Config.DefaultBoolean(true)
            public boolean modernShowSilkTouchabilityIcon;
        }
    }
}
