package com.a17119973.siftdimensionmod.advancement;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.util.Identifier;

public class SiftDimensionModAdvancement {
    public static void register() {
        Advancement.Builder.create()
            .display(
                new Identifier("siftdimensionmod", "portal_created"),
                "Portal Created",
                "Create a Sift Dimension portal",
                null,
                AdvancementFrame.TASK,
                true,
                true,
                false
            )
            .parent(new Identifier("minecraft:story/root"))
            .criterion("portal_created", CriterionConditions.create())
            .rewards(AdvancementRewards.Builder.experience(10))
            .build(new Identifier("siftdimensionmod", "portal_created"));
    }
}