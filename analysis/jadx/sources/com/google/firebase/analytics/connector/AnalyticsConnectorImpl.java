package com.google.firebase.analytics.connector;

import N3.a;
import O3.K0;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0768a0;
import com.google.android.gms.internal.measurement.C0824l0;
import com.google.android.gms.internal.measurement.C0834n0;
import com.google.android.gms.internal.measurement.C0863t0;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzc;
    final a zza;
    final Map zzb;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AnalyticsConnectorImpl(a aVar) {
        AbstractC1887A.g(aVar);
        this.zza = aVar;
        this.zzb = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void zza(Event event) {
        boolean z5 = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            AnalyticsConnector analyticsConnector = zzc;
            AbstractC1887A.g(analyticsConnector);
            C0863t0 c0863t0 = ((AnalyticsConnectorImpl) analyticsConnector).zza.f4031a;
            c0863t0.c(new C0824l0(c0863t0, z5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: zzb(Ljava/lang/String;)Z */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final boolean zzb(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.zzb;
        return map.containsKey(str) && map.get(str) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzc.zzb(str2, bundle)) {
            C0863t0 c0863t0 = this.zza.f4031a;
            c0863t0.c(new C0768a0(c0863t0, str, str2, bundle));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.zza.f4031a.g(str, str2)) {
            int i = zzc.zza;
            AbstractC1887A.g(bundle);
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
            String str3 = (String) K0.e(bundle, FirebaseAnalytics.Param.ORIGIN, String.class, null);
            AbstractC1887A.g(str3);
            conditionalUserProperty.origin = str3;
            String str4 = (String) K0.e(bundle, "name", String.class, null);
            AbstractC1887A.g(str4);
            conditionalUserProperty.name = str4;
            conditionalUserProperty.value = K0.e(bundle, FirebaseAnalytics.Param.VALUE, Object.class, null);
            conditionalUserProperty.triggerEventName = (String) K0.e(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.triggerTimeout = ((Long) K0.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.timedOutEventName = (String) K0.e(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.timedOutEventParams = (Bundle) K0.e(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.triggeredEventName = (String) K0.e(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.triggeredEventParams = (Bundle) K0.e(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.timeToLive = ((Long) K0.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.expiredEventName = (String) K0.e(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.expiredEventParams = (Bundle) K0.e(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.active = ((Boolean) K0.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.creationTimestamp = ((Long) K0.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.triggeredTimestamp = ((Long) K0.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public int getMaxUserProperties(String str) {
        return this.zza.f4031a.b(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public Map<String, Object> getUserProperties(boolean z5) {
        return this.zza.f4031a.a(null, null, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (zzc.zza(str) && zzc.zzb(str2, bundle2) && zzc.zze(str, str2, bundle2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle2.putLong("_r", 1L);
            }
            C0863t0 c0863t0 = this.zza.f4031a;
            c0863t0.c(new C0834n0(c0863t0, null, str, str2, bundle2, true, true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        AbstractC1887A.g(analyticsConnectorListener);
        if (zzc.zza(str) && !zzb(str)) {
            a aVar = this.zza;
            com.google.firebase.analytics.connector.internal.zza zzeVar = "fiam".equals(str) ? new zze(aVar, analyticsConnectorListener) : "clx".equals(str) ? new zzg(aVar, analyticsConnectorListener) : null;
            if (zzeVar != null) {
                this.zzb.put(str, zzeVar);
                return new AnalyticsConnector.AnalyticsConnectorHandle(this) { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
                    final /* synthetic */ AnalyticsConnectorImpl zzb;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        Objects.requireNonNull(this);
                        this.zzb = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void registerEventNames(Set<String> set) {
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (!analyticsConnectorImpl.zzb(str2) || !str2.equals("fiam") || set == null || set.isEmpty()) {
                            return;
                        }
                        ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzb(set);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public final void unregister() {
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (analyticsConnectorImpl.zzb(str2)) {
                            Map map = analyticsConnectorImpl.zzb;
                            AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListenerZza = ((com.google.firebase.analytics.connector.internal.zza) map.get(str2)).zza();
                            if (analyticsConnectorListenerZza != null) {
                                analyticsConnectorListenerZza.onMessageTriggered(0, null);
                            }
                            map.remove(str2);
                        }
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void unregisterEventNames() {
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (analyticsConnectorImpl.zzb(str2) && str2.equals("fiam")) {
                            ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzc();
                        }
                    }
                };
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        int i = zzc.zza;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return;
        }
        Object obj = conditionalUserProperty.value;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
            try {
                Object object = objectInputStream.readObject();
                objectOutputStream.close();
                objectInputStream.close();
                obj2 = object;
                if (obj2 == null) {
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (objectInputStream == null) {
                    throw th;
                }
                objectInputStream.close();
                throw th;
            }
        }
        if (zzc.zza(str) && zzc.zzd(str, conditionalUserProperty.name)) {
            String str2 = conditionalUserProperty.expiredEventName;
            if (str2 == null || (zzc.zzb(str2, conditionalUserProperty.expiredEventParams) && zzc.zze(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
                String str3 = conditionalUserProperty.triggeredEventName;
                if (str3 == null || (zzc.zzb(str3, conditionalUserProperty.triggeredEventParams) && zzc.zze(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
                    String str4 = conditionalUserProperty.timedOutEventName;
                    if (str4 == null || (zzc.zzb(str4, conditionalUserProperty.timedOutEventParams) && zzc.zze(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams))) {
                        a aVar = this.zza;
                        Bundle bundle = new Bundle();
                        String str5 = conditionalUserProperty.origin;
                        if (str5 != null) {
                            bundle.putString(FirebaseAnalytics.Param.ORIGIN, str5);
                        }
                        String str6 = conditionalUserProperty.name;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj3 = conditionalUserProperty.value;
                        if (obj3 != null) {
                            K0.d(bundle, obj3);
                        }
                        String str7 = conditionalUserProperty.triggerEventName;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", conditionalUserProperty.triggerTimeout);
                        String str8 = conditionalUserProperty.timedOutEventName;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = conditionalUserProperty.timedOutEventParams;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = conditionalUserProperty.triggeredEventName;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = conditionalUserProperty.triggeredEventParams;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", conditionalUserProperty.timeToLive);
                        String str10 = conditionalUserProperty.expiredEventName;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = conditionalUserProperty.expiredEventParams;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", conditionalUserProperty.creationTimestamp);
                        bundle.putBoolean("active", conditionalUserProperty.active);
                        bundle.putLong("triggered_timestamp", conditionalUserProperty.triggeredTimestamp);
                        C0863t0 c0863t0 = aVar.f4031a;
                        c0863t0.c(new Z(c0863t0, bundle, 0));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setUserProperty(String str, String str2, Object obj) {
        if (zzc.zza(str) && zzc.zzd(str, str2)) {
            C0863t0 c0863t0 = this.zza.f4031a;
            c0863t0.c(new Y(c0863t0, str, str2, obj, true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        AbstractC1887A.g(firebaseApp);
        AbstractC1887A.g(context);
        AbstractC1887A.g(subscriber);
        AbstractC1887A.g(context.getApplicationContext());
        if (zzc == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (zzc == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.isDefaultApp()) {
                            subscriber.subscribe(DataCollectionDefaultChange.class, zzb.zza, zza.zza);
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                        }
                        zzc = new AnalyticsConnectorImpl(C0863t0.e(context, bundle).f11037b);
                    }
                } finally {
                }
            }
        }
        return zzc;
    }
}
