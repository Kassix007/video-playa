package androidx.work.impl.model;

import B5.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ WorkSpecDao_Impl f9832r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.f9831q = i;
        this.f9832r = workSpecDao_Impl;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.model.WorkSpecDao_Impl.a(androidx.work.impl.model.WorkSpecDao_Impl, java.util.HashMap):m5.y */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f9831q) {
            case 0:
                return this.f9832r.lambda$__fetchRelationshipWorkTagAsjavaLangString$0((HashMap) obj);
            default:
                return this.f9832r.lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1((HashMap) obj);
        }
    }
}
