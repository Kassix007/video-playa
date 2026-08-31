package Q3;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.measurement.K1;
import k1.i;
import p3.z0;
import u3.InterfaceC1697b;
import u3.e;
import u3.f;
import v3.o;
import x3.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends K1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6588c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public InterfaceC1697b g(Context context, Looper looper, z0 z0Var, Object obj, e eVar, f fVar) {
        switch (this.f6588c) {
            case 0:
                z0Var.getClass();
                Integer num = (Integer) z0Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new R3.a(context, looper, z0Var, bundle, eVar, fVar);
            case 1:
                throw i.g(obj);
            case 2:
                return new com.google.android.gms.internal.clearcut.z0(context, looper, 40, z0Var, eVar, fVar, 0);
            default:
                return super.g(context, looper, z0Var, obj, eVar, fVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public /* synthetic */ InterfaceC1697b h(Context context, Looper looper, z0 z0Var, Object obj, o oVar, o oVar2) {
        switch (this.f6588c) {
            case 3:
                return new z3.c(context, looper, z0Var, (n) obj, oVar, oVar2);
            default:
                return super.h(context, looper, z0Var, obj, oVar, oVar2);
        }
    }
}
