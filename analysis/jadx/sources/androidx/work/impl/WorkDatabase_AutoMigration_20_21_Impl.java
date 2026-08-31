package androidx.work.impl;

import e2.AbstractC1037b;
import j2.InterfaceC1155a;

/* JADX INFO: loaded from: classes.dex */
final class WorkDatabase_AutoMigration_20_21_Impl extends AbstractC1037b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkDatabase_AutoMigration_20_21_Impl() {
        super(20, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.AbstractC1037b
    public void migrate(InterfaceC1155a interfaceC1155a) {
        interfaceC1155a.l("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
