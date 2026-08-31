package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public class SystemClock implements Clock {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
