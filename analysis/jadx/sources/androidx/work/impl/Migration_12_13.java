package androidx.work.impl;

import e2.AbstractC1037b;
import j2.InterfaceC1155a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Migration_12_13 extends AbstractC1037b {
    public static final Migration_12_13 INSTANCE = new Migration_12_13();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Migration_12_13() {
        super(12, 13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.AbstractC1037b
    public void migrate(InterfaceC1155a db) {
        m.e(db, "db");
        db.l("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db.l("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
