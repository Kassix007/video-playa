package androidx.work;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.impl.utils.DurationApi26Impl;
import androidx.work.impl.utils.NetworkRequest30;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.time.Duration;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import n5.l;
import n5.u;

/* JADX INFO: loaded from: classes.dex */
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final Constraints NONE = new Constraints(null, false, false, false, 15, null);
    private final long contentTriggerMaxDelayMillis;
    private final long contentTriggerUpdateDelayMillis;
    private final Set<ContentUriTrigger> contentUriTriggers;
    private final NetworkRequestCompat requiredNetworkRequestCompat;
    private final NetworkType requiredNetworkType;
    private final boolean requiresBatteryNotLow;
    private final boolean requiresCharging;
    private final boolean requiresDeviceIdle;
    private final boolean requiresStorageNotLow;

    public static final class Builder {
        private Set<ContentUriTrigger> contentUriTriggers;
        private NetworkRequestCompat requiredNetworkRequest;
        private NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder() {
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addContentUriTrigger(Uri uri, boolean z5) {
            m.e(uri, "uri");
            this.contentUriTriggers.add(new ContentUriTrigger(uri, z5));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Constraints build() {
            Set setE0 = l.E0(this.contentUriTriggers);
            return new Constraints(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, this.triggerContentUpdateDelay, this.triggerContentMaxDelay, setE0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setRequiredNetworkRequest(NetworkRequest networkRequest, NetworkType networkType) {
            m.e(networkRequest, "networkRequest");
            m.e(networkType, "networkType");
            int i = Build.VERSION.SDK_INT;
            if (i < 28) {
                this.requiredNetworkType = networkType;
                return this;
            }
            if (i >= 31 && NetworkRequest30.INSTANCE.getNetworkSpecifier(networkRequest) != null) {
                throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
            }
            this.requiredNetworkRequest = new NetworkRequestCompat(networkRequest);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setRequiredNetworkType(NetworkType networkType) {
            m.e(networkType, "networkType");
            this.requiredNetworkType = networkType;
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setRequiresBatteryNotLow(boolean z5) {
            this.requiresBatteryNotLow = z5;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setRequiresCharging(boolean z5) {
            this.requiresCharging = z5;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setRequiresDeviceIdle(boolean z5) {
            this.requiresDeviceIdle = z5;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setRequiresStorageNotLow(boolean z5) {
            this.requiresStorageNotLow = z5;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setTriggerContentMaxDelay(long j, TimeUnit timeUnit) {
            m.e(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(j);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setTriggerContentUpdateDelay(long j, TimeUnit timeUnit) {
            m.e(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(j);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final Builder setTriggerContentMaxDelay(Duration duration) {
            m.e(duration, "duration");
            this.triggerContentMaxDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final Builder setTriggerContentUpdateDelay(Duration duration) {
            m.e(duration, "duration");
            this.triggerContentUpdateDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public Builder(Constraints constraints) {
            LinkedHashSet linkedHashSet;
            m.e(constraints, "constraints");
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.requiresCharging();
            this.requiresDeviceIdle = constraints.requiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.requiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.requiresStorageNotLow();
            this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
            this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
            Set<ContentUriTrigger> contentUriTriggers = constraints.getContentUriTriggers();
            m.e(contentUriTriggers, "<this>");
            if (contentUriTriggers instanceof Collection) {
                linkedHashSet = new LinkedHashSet(contentUriTriggers);
            } else {
                linkedHashSet = new LinkedHashSet();
                l.z0(contentUriTriggers, linkedHashSet);
            }
            this.contentUriTriggers = linkedHashSet;
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.Constraints.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final Uri uri;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ContentUriTrigger(Uri uri, boolean z5) {
            m.e(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ContentUriTrigger.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            m.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            return m.a(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Boolean.hashCode(this.isTriggeredForDescendants) + (this.uri.hashCode() * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean isTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:androidx.work.NetworkType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:androidx.work.NetworkType:0x0004: SGET  A[WRAPPED] (LINE:1) androidx.work.NetworkType.NOT_REQUIRED androidx.work.NetworkType) : (r2v0 androidx.work.NetworkType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(androidx.work.NetworkType, boolean, boolean, boolean):void (m)] (LINE:2) call: androidx.work.Constraints.<init>(androidx.work.NetworkType, boolean, boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Constraints(NetworkType networkType, boolean z5, boolean z6, boolean z7, int i, g gVar) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z5, (i & 4) != 0 ? false : z6, (i & 8) != 0 ? false : z7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"NewApi"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Constraints.class.equals(obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && m.a(getRequiredNetworkRequest(), constraints.getRequiredNetworkRequest()) && this.requiredNetworkType == constraints.requiredNetworkType) {
            return m.a(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NetworkRequest getRequiredNetworkRequest() {
        return this.requiredNetworkRequestCompat.getNetworkRequest();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NetworkRequestCompat getRequiredNetworkRequestCompat$work_runtime_release() {
        return this.requiredNetworkRequestCompat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasContentUriTriggers() {
        return !this.contentUriTriggers.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j = this.contentTriggerUpdateDelayMillis;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j7 = this.contentTriggerMaxDelayMillis;
        int iHashCode2 = (this.contentUriTriggers.hashCode() + ((i + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31;
        NetworkRequest requiredNetworkRequest = getRequiredNetworkRequest();
        return iHashCode2 + (requiredNetworkRequest != null ? requiredNetworkRequest.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean requiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean requiresCharging() {
        return this.requiresCharging;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean requiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean requiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"NewApi"})
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public Constraints(NetworkType requiredNetworkType, boolean z5, boolean z6, boolean z7) {
        this(requiredNetworkType, z5, false, z6, z7);
        m.e(requiredNetworkType, "requiredNetworkType");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ Constraints(androidx.work.NetworkType r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.g r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            androidx.work.NetworkType r2 = androidx.work.NetworkType.NOT_REQUIRED
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Constraints.<init>(androidx.work.NetworkType, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public Constraints(NetworkType requiredNetworkType, boolean z5, boolean z6, boolean z7, boolean z8) {
        this(requiredNetworkType, z5, z6, z7, z8, -1L, 0L, null, 192, null);
        m.e(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:androidx.work.NetworkType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:androidx.work.NetworkType:0x0004: SGET  A[WRAPPED] (LINE:7) androidx.work.NetworkType.NOT_REQUIRED androidx.work.NetworkType) : (r3v0 androidx.work.NetworkType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r8v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0022: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r10v0 long))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x0027: ARITH (r13v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Set:0x002b: SGET  A[WRAPPED] (LINE:8) n5.u.q n5.u) : (r12v0 java.util.Set))
 A[MD:(androidx.work.NetworkType, boolean, boolean, boolean, boolean, long, long, java.util.Set<androidx.work.Constraints$ContentUriTrigger>):void (m)] (LINE:9) call: androidx.work.Constraints.<init>(androidx.work.NetworkType, boolean, boolean, boolean, boolean, long, long, java.util.Set):void type: THIS */
    public /* synthetic */ Constraints(NetworkType networkType, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j7, Set set, int i, g gVar) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z5, (i & 4) != 0 ? false : z6, (i & 8) != 0 ? false : z7, (i & 16) != 0 ? false : z8, (i & 32) != 0 ? -1L : j, (i & 64) != 0 ? -1L : j7, (i & 128) != 0 ? u.f15301q : set);
    }

    public Constraints(NetworkType requiredNetworkType, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j7, Set<ContentUriTrigger> contentUriTriggers) {
        m.e(requiredNetworkType, "requiredNetworkType");
        m.e(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z5;
        this.requiresDeviceIdle = z6;
        this.requiresBatteryNotLow = z7;
        this.requiresStorageNotLow = z8;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j7;
        this.contentUriTriggers = contentUriTriggers;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (r12v0 androidx.work.impl.utils.NetworkRequestCompat)
  (wrap:androidx.work.NetworkType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:20) androidx.work.NetworkType.NOT_REQUIRED androidx.work.NetworkType) : (r13v0 androidx.work.NetworkType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 boolean) : false)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0028: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r18v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 long) : (-1 long))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x0039: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] (LINE:21) n5.u.q n5.u) : (r22v0 java.util.Set))
 A[MD:(androidx.work.impl.utils.NetworkRequestCompat, androidx.work.NetworkType, boolean, boolean, boolean, boolean, long, long, java.util.Set<androidx.work.Constraints$ContentUriTrigger>):void (m)] (LINE:22) call: androidx.work.Constraints.<init>(androidx.work.impl.utils.NetworkRequestCompat, androidx.work.NetworkType, boolean, boolean, boolean, boolean, long, long, java.util.Set):void type: THIS */
    public /* synthetic */ Constraints(NetworkRequestCompat networkRequestCompat, NetworkType networkType, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j7, Set set, int i, g gVar) {
        this(networkRequestCompat, (i & 2) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 4) != 0 ? false : z5, (i & 8) != 0 ? false : z6, (i & 16) != 0 ? false : z7, (i & 32) == 0 ? z8 : false, (i & 64) != 0 ? -1L : j, (i & 128) == 0 ? j7 : -1L, (i & 256) != 0 ? u.f15301q : set);
    }

    public Constraints(NetworkRequestCompat requiredNetworkRequestCompat, NetworkType requiredNetworkType, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j7, Set<ContentUriTrigger> contentUriTriggers) {
        m.e(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        m.e(requiredNetworkType, "requiredNetworkType");
        m.e(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = requiredNetworkRequestCompat;
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z5;
        this.requiresDeviceIdle = z6;
        this.requiresBatteryNotLow = z7;
        this.requiresStorageNotLow = z8;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j7;
        this.contentUriTriggers = contentUriTriggers;
    }

    @SuppressLint({"NewApi"})
    public Constraints(Constraints other) {
        m.e(other, "other");
        this.requiresCharging = other.requiresCharging;
        this.requiresDeviceIdle = other.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = other.requiredNetworkRequestCompat;
        this.requiredNetworkType = other.requiredNetworkType;
        this.requiresBatteryNotLow = other.requiresBatteryNotLow;
        this.requiresStorageNotLow = other.requiresStorageNotLow;
        this.contentUriTriggers = other.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = other.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = other.contentTriggerMaxDelayMillis;
    }
}
