package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0939v0 extends AbstractC0931r0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.AbstractC0931r0
    public final void a(long j, Object obj, Object obj2) {
        InterfaceC0924n0 interfaceC0924n0A = (InterfaceC0924n0) U0.l(j, obj);
        InterfaceC0924n0 interfaceC0924n0 = (InterfaceC0924n0) U0.l(j, obj2);
        int size = interfaceC0924n0A.size();
        int size2 = interfaceC0924n0.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC0924n0A.zza()) {
                interfaceC0924n0A = interfaceC0924n0A.a(size2 + size);
            }
            interfaceC0924n0A.addAll(interfaceC0924n0);
        }
        if (size > 0) {
            interfaceC0924n0 = interfaceC0924n0A;
        }
        U0.d(j, obj, interfaceC0924n0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.AbstractC0931r0
    public final void b(long j, Object obj) {
        ((InterfaceC0924n0) U0.l(j, obj)).f();
    }
}
