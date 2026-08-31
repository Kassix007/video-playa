package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface J extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(L l7);

    void getAppInstanceId(L l7);

    void getCachedAppInstanceId(L l7);

    void getConditionalUserProperties(String str, String str2, L l7);

    void getCurrentScreenClass(L l7);

    void getCurrentScreenName(L l7);

    void getGmpAppId(L l7);

    void getMaxUserProperties(String str, L l7);

    void getSessionId(L l7);

    void getTestFlag(L l7, int i);

    void getUserProperties(String str, String str2, boolean z5, L l7);

    void initForTests(Map map);

    void initialize(D3.a aVar, V v6, long j);

    void isDataCollectionEnabled(L l7);

    void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, L l7, long j);

    void logHealthData(int i, String str, D3.a aVar, D3.a aVar2, D3.a aVar3);

    void onActivityCreated(D3.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(X x6, Bundle bundle, long j);

    void onActivityDestroyed(D3.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(X x6, long j);

    void onActivityPaused(D3.a aVar, long j);

    void onActivityPausedByScionActivityInfo(X x6, long j);

    void onActivityResumed(D3.a aVar, long j);

    void onActivityResumedByScionActivityInfo(X x6, long j);

    void onActivitySaveInstanceState(D3.a aVar, L l7, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(X x6, L l7, long j);

    void onActivityStarted(D3.a aVar, long j);

    void onActivityStartedByScionActivityInfo(X x6, long j);

    void onActivityStopped(D3.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(X x6, long j);

    void performAction(Bundle bundle, L l7, long j);

    void registerOnMeasurementEventListener(S s6);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(N n7);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(D3.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(X x6, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z5);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(S s6);

    void setInstanceIdProvider(U u6);

    void setMeasurementEnabled(boolean z5, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, D3.a aVar, boolean z5, long j);

    void unregisterOnMeasurementEventListener(S s6);
}
