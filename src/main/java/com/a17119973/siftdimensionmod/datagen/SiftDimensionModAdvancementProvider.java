package com.a17119973.siftdimensionmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.util.Identifier;

public class SiftDimensionModAdvancementProvider extends FabricAdvancementProvider {
    public SiftDimensionModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement root = Advancement.Builder.create()
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
            .criterion("portal_created", CriterionConditions.create())
            .build(new Identifier("siftdimensionmod", "portal_created"));
        consumer.accept(root);
    }
}