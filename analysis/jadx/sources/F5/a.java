package F5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends E5.a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E5.a
    public final Random b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        m.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
