package poggerz.kaupenModders.kaupen_mod.item.itemtype.trinket;

import com.google.common.collect.Multimap;

import dev.emi.trinkets.api.*;
import dev.emi.trinkets.api.client.TrinketRenderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.*;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import org.jetbrains.annotations.Nullable;

import poggerz.kaupenModders.kaupen_mod.kaupenMod;
import poggerz.kaupenModders.kaupen_mod.model.kaupenCatEarsModel;

import wiiu.mavity.mavity_lib.config.MavityLibConfig;

import java.util.*;

public class kaupenCatEarsTrinket extends TrinketItem implements TrinketRenderer {
    private static final Identifier TEXTURE = new Identifier(kaupenMod.MOD_ID, "textures/item/trinkets/kaupen_cat_ears.png");
    private BipedEntityModel<LivingEntity> model;
    public kaupenCatEarsTrinket(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        return modifiers;
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        BipedEntityModel<LivingEntity> model = this.getModel();
        model.setAngles(entity, limbAngle, limbDistance, animationProgress, animationProgress, headPitch);
        model.animateModel(entity, limbAngle, limbDistance, tickDelta);
        TrinketRenderer.followBodyRotations(entity, model);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(model.getLayer(TEXTURE));
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1, 1, 1, 1);
    }

    @Environment(EnvType.CLIENT)
    private BipedEntityModel<LivingEntity> getModel() {
        if (this.model == null) {
            // Vanilla 1.17 uses EntityModels, EntityModelLoader and EntityModelLayers
            this.model = new kaupenCatEarsModel(kaupenCatEarsModel.getTexturedModelData().createModel());
        }
        return this.model;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext options) {
        if (MavityLibConfig.showTooltips == true) {
            tooltip.add(Text.translatable("tooltip.kaupen_mod.kaupen_cat_ears.one"));
            tooltip.add(Text.translatable("tooltip.kaupen_mod.kaupen_cat_ears.two"));
            tooltip.add(Text.translatable("tooltip.kaupen_mod.kaupen_cat_ears.three"));
            super.appendTooltip(stack, world, tooltip, options);
        }
    }
}