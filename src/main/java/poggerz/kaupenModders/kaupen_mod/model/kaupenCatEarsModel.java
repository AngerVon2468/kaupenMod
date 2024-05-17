package poggerz.kaupenModders.kaupen_mod.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

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
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(10, 0).cuboid(-3.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 10).cuboid(1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(9, 3).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 5).cuboid(-5.0F, -8.0F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 12).cuboid(4.0F, -8.0F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData headtwo_r1 = head.addChild("headtwo_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

        ModelPartData headone_r1 = head.addChild("headone_r1", ModelPartBuilder.create().uv(5, 5).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -7.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
        return TexturedModelData.of(modelData, 16, 16);
    }
}