package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f10369e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s(l lVar) {
        super(false, null, null);
        this.f10369e = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.common.t
    public final String a() {
        try {
            return (String) this.f10369e.call();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
