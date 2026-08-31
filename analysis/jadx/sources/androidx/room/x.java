package androidx.room;

import j2.InterfaceC1155a;
import m5.InterfaceC1364c;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public final int version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(int i) {
        this.version = i;
    }

    public abstract void createAllTables(InterfaceC1155a interfaceC1155a);

    public abstract void dropAllTables(InterfaceC1155a interfaceC1155a);

    public abstract void onCreate(InterfaceC1155a interfaceC1155a);

    public abstract void onOpen(InterfaceC1155a interfaceC1155a);

    public abstract void onPostMigrate(InterfaceC1155a interfaceC1155a);

    public abstract void onPreMigrate(InterfaceC1155a interfaceC1155a);

    public abstract y onValidateSchema(InterfaceC1155a interfaceC1155a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC1364c
    public void validateMigration(InterfaceC1155a db) {
        kotlin.jvm.internal.m.e(db, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
