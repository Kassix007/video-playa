package e2;

import j2.InterfaceC1155a;

/* JADX INFO: renamed from: e2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1037b {
    public final int endVersion;
    public final int startVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1037b(int i, int i7) {
        this.startVersion = i;
        this.endVersion = i7;
    }

    public abstract void migrate(InterfaceC1155a interfaceC1155a);
}
