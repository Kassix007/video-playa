package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends AbstractBinderC0882x implements J {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static J asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof J ? (J) iInterfaceQueryLocalInterface : new H(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0882x
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        boolean z5;
        L k7 = null;
        N m4 = null;
        L k8 = null;
        L k9 = null;
        L k10 = null;
        L k11 = null;
        S o6 = null;
        S o7 = null;
        S o8 = null;
        L k12 = null;
        L k13 = null;
        L k14 = null;
        L k15 = null;
        L k16 = null;
        L k17 = null;
        U t6 = null;
        L k18 = null;
        L k19 = null;
        L k20 = null;
        L k21 = null;
        L k22 = null;
        switch (i) {
            case 1:
                D3.a aVarJ = D3.b.J(parcel.readStrongBinder());
                V v6 = (V) AbstractC0887y.a(parcel, V.CREATOR);
                long j = parcel.readLong();
                AbstractC0887y.d(parcel);
                initialize(aVarJ, v6, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z5 = false;
                    z = true;
                } else {
                    z5 = false;
                }
                boolean z6 = parcel.readInt() != 0 ? true : z5;
                long j7 = parcel.readLong();
                AbstractC0887y.d(parcel);
                logEvent(string, string2, bundle, z, z6, j7);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k7 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new K(strongBinder);
                }
                L l7 = k7;
                long j8 = parcel.readLong();
                AbstractC0887y.d(parcel);
                logEventAndBundle(string3, string4, bundle2, l7, j8);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                D3.a aVarJ2 = D3.b.J(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC0887y.f11126a;
                z = parcel.readInt() != 0;
                long j9 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setUserProperty(string5, string6, aVarJ2, z, j9);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0887y.f11126a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k22 = iInterfaceQueryLocalInterface2 instanceof L ? (L) iInterfaceQueryLocalInterface2 : new K(strongBinder2);
                }
                AbstractC0887y.d(parcel);
                getUserProperties(string7, string8, z, k22);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k21 = iInterfaceQueryLocalInterface3 instanceof L ? (L) iInterfaceQueryLocalInterface3 : new K(strongBinder3);
                }
                AbstractC0887y.d(parcel);
                getMaxUserProperties(string9, k21);
                break;
            case 7:
                String string10 = parcel.readString();
                long j10 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setUserId(string10, j10);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                long j11 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setConditionalUserProperty(bundle3, j11);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                AbstractC0887y.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k20 = iInterfaceQueryLocalInterface4 instanceof L ? (L) iInterfaceQueryLocalInterface4 : new K(strongBinder4);
                }
                AbstractC0887y.d(parcel);
                getConditionalUserProperties(string13, string14, k20);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC0887y.f11126a;
                z = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setMeasurementEnabled(z, j12);
                break;
            case 12:
                long j13 = parcel.readLong();
                AbstractC0887y.d(parcel);
                resetAnalyticsData(j13);
                break;
            case 13:
                long j14 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setMinimumSessionDuration(j14);
                break;
            case 14:
                long j15 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setSessionTimeoutDuration(j15);
                break;
            case 15:
                D3.a aVarJ3 = D3.b.J(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j16 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setCurrentScreen(aVarJ3, string15, string16, j16);
                break;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k19 = iInterfaceQueryLocalInterface5 instanceof L ? (L) iInterfaceQueryLocalInterface5 : new K(strongBinder5);
                }
                AbstractC0887y.d(parcel);
                getCurrentScreenName(k19);
                break;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k18 = iInterfaceQueryLocalInterface6 instanceof L ? (L) iInterfaceQueryLocalInterface6 : new K(strongBinder6);
                }
                AbstractC0887y.d(parcel);
                getCurrentScreenClass(k18);
                break;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    t6 = iInterfaceQueryLocalInterface7 instanceof U ? (U) iInterfaceQueryLocalInterface7 : new T(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                AbstractC0887y.d(parcel);
                setInstanceIdProvider(t6);
                break;
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k17 = iInterfaceQueryLocalInterface8 instanceof L ? (L) iInterfaceQueryLocalInterface8 : new K(strongBinder8);
                }
                AbstractC0887y.d(parcel);
                getCachedAppInstanceId(k17);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k16 = iInterfaceQueryLocalInterface9 instanceof L ? (L) iInterfaceQueryLocalInterface9 : new K(strongBinder9);
                }
                AbstractC0887y.d(parcel);
                getAppInstanceId(k16);
                break;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k15 = iInterfaceQueryLocalInterface10 instanceof L ? (L) iInterfaceQueryLocalInterface10 : new K(strongBinder10);
                }
                AbstractC0887y.d(parcel);
                getGmpAppId(k15);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k14 = iInterfaceQueryLocalInterface11 instanceof L ? (L) iInterfaceQueryLocalInterface11 : new K(strongBinder11);
                }
                AbstractC0887y.d(parcel);
                generateEventId(k14);
                break;
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                String string17 = parcel.readString();
                long j17 = parcel.readLong();
                AbstractC0887y.d(parcel);
                beginAdUnitExposure(string17, j17);
                break;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                String string18 = parcel.readString();
                long j18 = parcel.readLong();
                AbstractC0887y.d(parcel);
                endAdUnitExposure(string18, j18);
                break;
            case 25:
                D3.a aVarJ4 = D3.b.J(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityStarted(aVarJ4, j19);
                break;
            case 26:
                D3.a aVarJ5 = D3.b.J(parcel.readStrongBinder());
                long j20 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityStopped(aVarJ5, j20);
                break;
            case 27:
                D3.a aVarJ6 = D3.b.J(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                long j21 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityCreated(aVarJ6, bundle5, j21);
                break;
            case 28:
                D3.a aVarJ7 = D3.b.J(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityDestroyed(aVarJ7, j22);
                break;
            case 29:
                D3.a aVarJ8 = D3.b.J(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityPaused(aVarJ8, j23);
                break;
            case 30:
                D3.a aVarJ9 = D3.b.J(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityResumed(aVarJ9, j24);
                break;
            case 31:
                D3.a aVarJ10 = D3.b.J(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k13 = iInterfaceQueryLocalInterface12 instanceof L ? (L) iInterfaceQueryLocalInterface12 : new K(strongBinder12);
                }
                long j25 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivitySaveInstanceState(aVarJ10, k13, j25);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k12 = iInterfaceQueryLocalInterface13 instanceof L ? (L) iInterfaceQueryLocalInterface13 : new K(strongBinder13);
                }
                long j26 = parcel.readLong();
                AbstractC0887y.d(parcel);
                performAction(bundle6, k12, j26);
                break;
            case 33:
                int i7 = parcel.readInt();
                String string19 = parcel.readString();
                D3.a aVarJ11 = D3.b.J(parcel.readStrongBinder());
                D3.a aVarJ12 = D3.b.J(parcel.readStrongBinder());
                D3.a aVarJ13 = D3.b.J(parcel.readStrongBinder());
                AbstractC0887y.d(parcel);
                logHealthData(i7, string19, aVarJ11, aVarJ12, aVarJ13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o8 = iInterfaceQueryLocalInterface14 instanceof S ? (S) iInterfaceQueryLocalInterface14 : new O(strongBinder14);
                }
                AbstractC0887y.d(parcel);
                setEventInterceptor(o8);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o7 = iInterfaceQueryLocalInterface15 instanceof S ? (S) iInterfaceQueryLocalInterface15 : new O(strongBinder15);
                }
                AbstractC0887y.d(parcel);
                registerOnMeasurementEventListener(o7);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o6 = iInterfaceQueryLocalInterface16 instanceof S ? (S) iInterfaceQueryLocalInterface16 : new O(strongBinder16);
                }
                AbstractC0887y.d(parcel);
                unregisterOnMeasurementEventListener(o6);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(AbstractC0887y.f11126a);
                AbstractC0887y.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k11 = iInterfaceQueryLocalInterface17 instanceof L ? (L) iInterfaceQueryLocalInterface17 : new K(strongBinder17);
                }
                int i8 = parcel.readInt();
                AbstractC0887y.d(parcel);
                getTestFlag(k11, i8);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC0887y.f11126a;
                z = parcel.readInt() != 0;
                AbstractC0887y.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k10 = iInterfaceQueryLocalInterface18 instanceof L ? (L) iInterfaceQueryLocalInterface18 : new K(strongBinder18);
                }
                AbstractC0887y.d(parcel);
                isDataCollectionEnabled(k10);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                AbstractC0887y.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j27 = parcel.readLong();
                AbstractC0887y.d(parcel);
                clearMeasurementEnabled(j27);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setConsent(bundle8, j28);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                long j29 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setConsentThirdParty(bundle9, j29);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k9 = iInterfaceQueryLocalInterface19 instanceof L ? (L) iInterfaceQueryLocalInterface19 : new K(strongBinder19);
                }
                AbstractC0887y.d(parcel);
                getSessionId(k9);
                break;
            case 48:
                Intent intent = (Intent) AbstractC0887y.a(parcel, Intent.CREATOR);
                AbstractC0887y.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case Scheduler.MAX_SCHEDULER_LIMIT /* 50 */:
                X x6 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j30 = parcel.readLong();
                AbstractC0887y.d(parcel);
                setCurrentScreenByScionActivityInfo(x6, string20, string21, j30);
                break;
            case 51:
                X x7 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                long j31 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityStartedByScionActivityInfo(x7, j31);
                break;
            case 52:
                X x8 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                long j32 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityStoppedByScionActivityInfo(x8, j32);
                break;
            case 53:
                X x9 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityCreatedByScionActivityInfo(x9, bundle10, j33);
                break;
            case 54:
                X x10 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                long j34 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityDestroyedByScionActivityInfo(x10, j34);
                break;
            case 55:
                X x11 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                long j35 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityPausedByScionActivityInfo(x11, j35);
                break;
            case 56:
                X x12 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                long j36 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivityResumedByScionActivityInfo(x12, j36);
                break;
            case 57:
                X x13 = (X) AbstractC0887y.a(parcel, X.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k8 = iInterfaceQueryLocalInterface20 instanceof L ? (L) iInterfaceQueryLocalInterface20 : new K(strongBinder20);
                }
                long j37 = parcel.readLong();
                AbstractC0887y.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(x13, k8, j37);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    m4 = iInterfaceQueryLocalInterface21 instanceof N ? (N) iInterfaceQueryLocalInterface21 : new M(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                AbstractC0887y.d(parcel);
                retrieveAndUploadBatches(m4);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
