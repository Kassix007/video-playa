package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import u3.InterfaceC1697b;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends BasePendingResult {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t3.c f10563h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t3.c cVar, v3.r rVar) {
        super(rVar);
        AbstractC1887A.h(rVar, "GoogleApiClient must not be null");
        AbstractC1887A.h(t3.a.j, "Api must not be null");
        this.f10563h = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B0(InterfaceC1697b interfaceC1697b) {
        t3.c cVar = this.f10563h;
        z0 z0Var = (z0) interfaceC1697b;
        y0 y0Var = new y0(this);
        try {
            cVar.getClass();
            w0 w0Var = cVar.f16739y;
            int iC = w0Var.c();
            byte[] bArr = new byte[iC];
            n0.a(w0Var, bArr, iC);
            cVar.f16732r = bArr;
            A0 a02 = (A0) z0Var.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i = r.f10542a;
            parcelObtain.writeStrongBinder(y0Var);
            parcelObtain.writeInt(1);
            cVar.writeToParcel(parcelObtain, 0);
            try {
                a02.f10376c.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RuntimeException e7) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e7);
            C0(new Status(10, "MessageProducer", null, null));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C0(Status status) {
        AbstractC1887A.b(!(status.f10312q <= 0), "Failed result must not be success");
        A0(status);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Status x0(Status status) {
        return status;
    }
}
