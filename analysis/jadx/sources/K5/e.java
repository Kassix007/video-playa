package K5;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends IllegalArgumentException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String message) {
        super(message);
        m.e(message, "message");
    }
}
