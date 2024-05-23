package poggerz.kaupenModders.kaupen_mod.model;

import net.fabricmc.api.*;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class kaupenCatEarsModel extends BipedEntityModel<LivingEntity> {

    public kaupenCatEarsModel(ModelPart root) {
        super(root);
        this.setVisible(false);
        this.head.visible = true;
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = BipedEntityModel.getModelData(Dilation.NONE, 0f);
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(12, 8).cuboid(-3.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 4).cuboid(1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 6).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 7).cuboid(-5.0F, -8.0F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 0).cuboid(4.0F, -8.0F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        head.addChild("rightearone_r1", ModelPartBuilder.create().uv(4, 12).cuboid(1.5F, 0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 12).cuboid(-2.5F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 13).cuboid(-0.5F, -2.25F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.5F, -1.25F, -0.5F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.5F, -10.75F, -0.5F, -3.1416F, 0.0F, -2.5744F));

        head.addChild("leftearthree_r1", ModelPartBuilder.create().uv(12, 10).cuboid(1.5F, 0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 0).cuboid(-2.5F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(7, 14).cuboid(-0.5F, -2.25F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 6).cuboid(-1.5F, -1.25F, -0.5F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.5F, -10.75F, -0.5F, 0.0F, 0.0F, -0.5672F));
        return TexturedModelData.of(modelData, 32, 32);
    }
}