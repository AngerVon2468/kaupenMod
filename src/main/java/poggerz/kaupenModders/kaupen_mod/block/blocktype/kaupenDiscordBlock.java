package poggerz.kaupenModders.kaupen_mod.block.blocktype;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.*;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class kaupenDiscordBlock extends Block {
    public kaupenDiscordBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(Text.literal("https://discord.gg/kaupenjoe").styled(style ->
                    style.withHoverEvent(
                            new HoverEvent(
                                    HoverEvent.Action.SHOW_TEXT,
                                    Text.literal("https://discord.gg/kaupenjoe")
                            )
                    ).withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/kaupenjoe"))
            ));
        }
        return ActionResult.SUCCESS;
    }
}