package one.oktw.mixin.hack;

import net.minecraft.network.encryption.PlayerPublicKey;
import net.minecraft.network.message.*;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MessageChain.class)
public class MessageChain_SkipFirstMessageValidation {
//    @Shadow
//    private @Nullable MessageSignatureData precedingSignature;
//    private boolean firstMessage = true;
//
//    @Inject(method = "getUnpacker", at = @At(value = "HEAD"), cancellable = true)
//    private void allowUnknownMessage(PlayerPublicKey playerPublicKey, CallbackInfoReturnable<MessageChain.Unpacker> cir) {
//        if (!firstMessage) return;
//
//        firstMessage = false;
//        if (!lastSeenMessages.entries().isEmpty()) {
//            precedingSignature = signature.signature();
//            cir.setReturnValue(SignedMessage.ofUnsigned(contents));
//        }
//    }
}
