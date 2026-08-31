package E5;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E5.c
    public final int a(int i) {
        return b().nextInt(i);
    }

    public abstract Random b();
}
