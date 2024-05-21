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
            user.sendMessage(Text.literal("https://discord.gg/kaupenjoe").styled(style ->
                    style.withHoverEvent(
                            new HoverEvent(
                                    //TODO: Figure out creative uses of this the clickevent actions && the removal of this item upon usage
                                    HoverEvent.Action.SHOW_TEXT,
                                    Text.literal("https://discord.gg/kaupenjoe")
                            )
                    ).withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/kaupenjoe"))
            ));
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}