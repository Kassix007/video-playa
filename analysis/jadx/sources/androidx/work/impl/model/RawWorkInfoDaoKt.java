package androidx.work.impl.model;

import M5.AbstractC0257s;
import P5.InterfaceC0397h;
import j2.InterfaceC1160f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class RawWorkInfoDaoKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0397h getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, AbstractC0257s dispatcher, InterfaceC1160f query) {
        m.e(rawWorkInfoDao, "<this>");
        m.e(dispatcher, "dispatcher");
        m.e(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
