package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Binder implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9767c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9767c = multiInstanceInvalidationService;
        attachInterface(this, m.f9747b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i7) {
        String str = m.f9747b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        l callback = null;
        l callback2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(l.f9746a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) {
                    k kVar = new k();
                    kVar.f9745c = strongBinder;
                    callback = kVar;
                } else {
                    callback = (l) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            kotlin.jvm.internal.m.e(callback, "callback");
            int i8 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9767c;
                synchronized (multiInstanceInvalidationService.f9710s) {
                    try {
                        int i9 = multiInstanceInvalidationService.f9708q + 1;
                        multiInstanceInvalidationService.f9708q = i9;
                        if (multiInstanceInvalidationService.f9710s.register(callback, Integer.valueOf(i9))) {
                            multiInstanceInvalidationService.f9709r.put(Integer.valueOf(i9), string);
                            i8 = i9;
                        } else {
                            multiInstanceInvalidationService.f9708q--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i8);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(l.f9746a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof l)) {
                    k kVar2 = new k();
                    kVar2.f9745c = strongBinder2;
                    callback2 = kVar2;
                } else {
                    callback2 = (l) iInterfaceQueryLocalInterface2;
                }
            }
            int i10 = parcel.readInt();
            kotlin.jvm.internal.m.e(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f9767c;
            synchronized (multiInstanceInvalidationService2.f9710s) {
                multiInstanceInvalidationService2.f9710s.unregister(callback2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i7);
        }
        int i11 = parcel.readInt();
        String[] tables = parcel.createStringArray();
        kotlin.jvm.internal.m.e(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f9767c;
        synchronized (multiInstanceInvalidationService3.f9710s) {
            String str2 = (String) multiInstanceInvalidationService3.f9709r.get(Integer.valueOf(i11));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.f9710s.beginBroadcast();
                for (int i12 = 0; i12 < iBeginBroadcast; i12++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.f9710s.getBroadcastCookie(i12);
                        kotlin.jvm.internal.m.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.f9709r.get(num);
                        if (i11 != iIntValue && str2.equals(str3)) {
                            try {
                                ((l) multiInstanceInvalidationService3.f9710s.getBroadcastItem(i12)).o(tables);
                            } catch (RemoteException e7) {
                                Log.w("ROOM", "Error invoking a remote callback", e7);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService3.f9710s.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
