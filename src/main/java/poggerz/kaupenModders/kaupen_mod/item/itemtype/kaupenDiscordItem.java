package poggerz.kaupenModders.kaupen_mod.item.itemtype;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.*;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class kaupenDiscordItem extends Item {
    public kaupenDiscordItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            user.sendMessage(Text.literal("https://discord.gg/kaupenhub").styled(style ->
                    style.withHoverEvent(
                            new HoverEvent(
                                    //TODO: Figure out creative uses of this && the clickevent actions
                                    HoverEvent.Action.SHOW_TEXT,
                                    Text.literal("https://discord.gg/kaupenhub")
                            )
                    ).withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/kaupenhub-836324368803430400"))
            ));
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}