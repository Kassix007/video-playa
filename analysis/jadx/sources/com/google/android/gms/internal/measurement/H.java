package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class H extends I3.a implements J {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeLong(j);
        L(parcelK, 23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        AbstractC0887y.b(parcelK, bundle);
        L(parcelK, 9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeLong(j);
        L(parcelK, 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void generateEventId(L l7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getAppInstanceId(L l7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getCachedAppInstanceId(L l7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getConditionalUserProperties(String str, String str2, L l7) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getCurrentScreenClass(L l7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getCurrentScreenName(L l7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getGmpAppId(L l7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getMaxUserProperties(String str, L l7) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getSessionId(L l7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 46);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getTestFlag(L l7, int i) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, l7);
        parcelK.writeInt(i);
        L(parcelK, 38);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void getUserProperties(String str, String str2, boolean z5, L l7) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ClassLoader classLoader = AbstractC0887y.f11126a;
        parcelK.writeInt(z5 ? 1 : 0);
        AbstractC0887y.c(parcelK, l7);
        L(parcelK, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void initialize(D3.a aVar, V v6, long j) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, aVar);
        AbstractC0887y.b(parcelK, v6);
        parcelK.writeLong(j);
        L(parcelK, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        AbstractC0887y.b(parcelK, bundle);
        parcelK.writeInt(z5 ? 1 : 0);
        parcelK.writeInt(z6 ? 1 : 0);
        parcelK.writeLong(j);
        L(parcelK, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void logHealthData(int i, String str, D3.a aVar, D3.a aVar2, D3.a aVar3) {
        Parcel parcelK = K();
        parcelK.writeInt(5);
        parcelK.writeString(str);
        AbstractC0887y.c(parcelK, aVar);
        AbstractC0887y.c(parcelK, aVar2);
        AbstractC0887y.c(parcelK, aVar3);
        L(parcelK, 33);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityCreatedByScionActivityInfo(X x6, Bundle bundle, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        AbstractC0887y.b(parcelK, bundle);
        parcelK.writeLong(j);
        L(parcelK, 53);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityDestroyedByScionActivityInfo(X x6, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        parcelK.writeLong(j);
        L(parcelK, 54);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityPausedByScionActivityInfo(X x6, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        parcelK.writeLong(j);
        L(parcelK, 55);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityResumedByScionActivityInfo(X x6, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        parcelK.writeLong(j);
        L(parcelK, 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivitySaveInstanceStateByScionActivityInfo(X x6, L l7, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        AbstractC0887y.c(parcelK, l7);
        parcelK.writeLong(j);
        L(parcelK, 57);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityStartedByScionActivityInfo(X x6, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        parcelK.writeLong(j);
        L(parcelK, 51);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityStoppedByScionActivityInfo(X x6, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        parcelK.writeLong(j);
        L(parcelK, 52);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void registerOnMeasurementEventListener(S s6) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, s6);
        L(parcelK, 35);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void resetAnalyticsData(long j) {
        Parcel parcelK = K();
        parcelK.writeLong(j);
        L(parcelK, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void retrieveAndUploadBatches(N n7) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, n7);
        L(parcelK, 58);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, bundle);
        parcelK.writeLong(j);
        L(parcelK, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, bundle);
        parcelK.writeLong(j);
        L(parcelK, 45);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setCurrentScreenByScionActivityInfo(X x6, String str, String str2, long j) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, x6);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeLong(j);
        L(parcelK, 50);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setDataCollectionEnabled(boolean z5) {
        Parcel parcelK = K();
        ClassLoader classLoader = AbstractC0887y.f11126a;
        parcelK.writeInt(z5 ? 1 : 0);
        L(parcelK, 39);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, bundle);
        L(parcelK, 42);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setEventInterceptor(S s6) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, s6);
        L(parcelK, 34);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setMeasurementEnabled(boolean z5, long j) {
        Parcel parcelK = K();
        ClassLoader classLoader = AbstractC0887y.f11126a;
        parcelK.writeInt(z5 ? 1 : 0);
        parcelK.writeLong(j);
        L(parcelK, 11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelK = K();
        parcelK.writeLong(j);
        L(parcelK, 14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelK = K();
        AbstractC0887y.b(parcelK, intent);
        L(parcelK, 48);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setUserId(String str, long j) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeLong(j);
        L(parcelK, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void setUserProperty(String str, String str2, D3.a aVar, boolean z5, long j) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        AbstractC0887y.c(parcelK, aVar);
        parcelK.writeInt(z5 ? 1 : 0);
        parcelK.writeLong(j);
        L(parcelK, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J
    public final void unregisterOnMeasurementEventListener(S s6) {
        Parcel parcelK = K();
        AbstractC0887y.c(parcelK, s6);
        L(parcelK, 36);
    }
}
