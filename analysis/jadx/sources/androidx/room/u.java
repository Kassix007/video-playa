package androidx.room;

import j2.InterfaceC1155a;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onCreate(InterfaceC1155a db) {
        kotlin.jvm.internal.m.e(db, "db");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onDestructiveMigration(InterfaceC1155a db) {
        kotlin.jvm.internal.m.e(db, "db");
    }

    public abstract void onOpen(InterfaceC1155a interfaceC1155a);
}
