package androidx.work.impl.model;

import B5.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RawWorkInfoDao_Impl f9830r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, int i) {
        this.f9829q = i;
        this.f9830r = rawWorkInfoDao_Impl;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.model.RawWorkInfoDao_Impl.a(androidx.work.impl.model.RawWorkInfoDao_Impl, java.util.HashMap):m5.y */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f9829q) {
            case 0:
                return this.f9830r.lambda$__fetchRelationshipWorkTagAsjavaLangString$0((HashMap) obj);
            default:
                return this.f9830r.lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1((HashMap) obj);
        }
    }
}
