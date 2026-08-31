package v3;

import F.D;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p3.z0;
import s3.C1591a;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class x extends E4.a implements u3.e, u3.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Q3.b f17602k = Q3.c.f6589a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f17603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f17604e;
    public final Q3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f17605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f17606h;
    public R3.a i;
    public D j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(Context context, I3.e eVar, z0 z0Var) {
        super(2);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f17603d = context;
        this.f17604e = eVar;
        this.f17606h = z0Var;
        this.f17605g = (Set) z0Var.f15875a;
        this.f = f17602k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.e
    public final void onConnected(Bundle bundle) {
        GoogleSignInAccount googleSignInAccountW;
        R3.a aVar = this.i;
        aVar.getClass();
        int i = 1;
        try {
            aVar.f6706Q.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.f18433s;
                ReentrantLock reentrantLock = C1591a.f16453c;
                AbstractC1887A.g(context);
                ReentrantLock reentrantLock2 = C1591a.f16453c;
                reentrantLock2.lock();
                try {
                    if (C1591a.f16454d == null) {
                        C1591a.f16454d = new C1591a(context.getApplicationContext());
                    }
                    C1591a c1591a = C1591a.f16454d;
                    reentrantLock2.unlock();
                    String strA = c1591a.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = c1591a.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountW = GoogleSignInAccount.W(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountW = null;
                            }
                        }
                    }
                    googleSignInAccountW = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountW = null;
            }
            Integer num = aVar.f6708S;
            AbstractC1887A.g(num);
            x3.s sVar = new x3.s(2, account, num.intValue(), googleSignInAccountW);
            R3.c cVar = (R3.c) aVar.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cVar.f2411e);
            int i7 = I3.b.f2412a;
            parcelObtain.writeInt(1);
            int iY = AbstractC0836n2.Y(parcelObtain, 20293);
            AbstractC0836n2.b0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            AbstractC0836n2.U(parcelObtain, 2, sVar, 0);
            AbstractC0836n2.a0(parcelObtain, iY);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                cVar.f2410d.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th2;
            }
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f17604e.post(new q(this, new R3.e(1, new com.google.android.gms.common.b(8, null), null), i));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.f
    public final void onConnectionFailed(com.google.android.gms.common.b bVar) {
        this.j.a(bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.e
    public final void onConnectionSuspended(int i) {
        D d5 = this.j;
        o oVar = (o) ((e) d5.f1781v).j.get((C1763a) d5.f1778s);
        if (oVar != null) {
            if (oVar.f17587k) {
                oVar.m(new com.google.android.gms.common.b(17));
            } else {
                oVar.onConnectionSuspended(i);
            }
        }
    }
}
