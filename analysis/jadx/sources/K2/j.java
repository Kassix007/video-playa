package K2;

import P.C0389z;
import R4.B0;
import R4.C0426a;
import R4.C0427a0;
import R4.C0484o1;
import R4.C0496r2;
import R4.C0509v;
import R4.C0521y;
import R4.C0522y0;
import R4.E0;
import R4.E2;
import R4.P1;
import R4.T0;
import R4.c3;
import R4.m3;
import Z5.C0574c;
import Z5.a0;
import android.os.StatFs;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.mikepenz.iconics.typeface.library.fontawesome.FontAwesome;
import java.io.File;
import java.util.LinkedHashMap;
import n5.y;
import q6.l;
import q6.t;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2899q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [R4.A0.<clinit>():void, R4.F1.<clinit>():void, R4.O1.<clinit>():void, R4.R1.<clinit>():void, R4.V0.<clinit>():void, R4.Y0.<clinit>():void, R4.a2.<clinit>():void, R4.f.<clinit>():void, R4.q.<clinit>():void, R4.t1.<clinit>():void, R4.w1.<clinit>():void, R4.x0.<clinit>():void, com.mikepenz.iconics.typeface.library.fontawesome.FontAwesome.<clinit>():void] */
    public /* synthetic */ j(int i) {
        this.f2899q = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.mikepenz.iconics.typeface.library.fontawesome.FontAwesome.a():java.util.Map */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        int i = 0;
        switch (this.f2899q) {
            case 0:
                t tVar = l.f16071q;
                x xVarE = l.f16072r.e("coil3_disk_cache");
                long jR = 10485760;
                try {
                    File file = xVarE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jR = D5.a.r((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new i(jR, tVar, xVarE);
            case 1:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 2:
                return FontAwesome.characters_delegate$lambda$1();
            case 3:
                return FontAwesome.INSTANCE;
            case 4:
                P4.b[] bVarArrValues = P4.b.values();
                int I6 = y.I(bVarArrValues.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(I6 >= 16 ? I6 : 16);
                int length = bVarArrValues.length;
                while (i < length) {
                    P4.b bVar = bVarArrValues[i];
                    linkedHashMap.put(bVar.name(), Character.valueOf(bVar.f6321q));
                    i++;
                }
                return linkedHashMap;
            case 5:
                return P4.c.f6323a;
            case 6:
                P4.d[] dVarArrValues = P4.d.values();
                int I7 = y.I(dVarArrValues.length);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(I7 >= 16 ? I7 : 16);
                int length2 = dVarArrValues.length;
                while (i < length2) {
                    P4.d dVar = dVarArrValues[i];
                    linkedHashMap2.put(dVar.name(), Character.valueOf(dVar.f6325q));
                    i++;
                }
                return linkedHashMap2;
            case 7:
                return P4.e.f6327a;
            case 8:
                C0389z c0389z = Q1.a.f6524a;
                return null;
            case 9:
                return Q2.c.f6527a;
            case 10:
                return new C0574c(C3.a.A(C0426a.f6909a));
            case 11:
                return new C0574c(C0521y.f7216a);
            case 12:
                return new C0574c(E2.f6753a);
            case 13:
                return new C0574c(c3.f6931a);
            case 14:
                return new C0574c(a0.f8577a);
            case 15:
                return new C0574c(C0522y0.f7217a);
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                return new C0574c(E0.f6752a);
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return new C0574c(B0.f6736a);
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                return new C0574c(C3.a.A(C0427a0.f6910a));
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                return new C0574c(C3.a.A(T0.f6860a));
            case 20:
                return new C0574c(C3.a.A(C0509v.f7197a));
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                return new C0574c(C0484o1.f7146a);
            case 22:
                return new C0574c(m3.f7131a);
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                return new C0574c(m3.f7131a);
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                return new C0574c(C3.a.A(P1.f6833a));
            case 25:
                return new C0574c(C3.a.A(C0509v.f7197a));
            case 26:
                return new C0574c(C3.a.A(C0509v.f7197a));
            case 27:
                return new C0574c(C3.a.A(P1.f6833a));
            case 28:
                return new C0574c(C3.a.A(C0427a0.f6910a));
            default:
                return new C0574c(C3.a.A(C0496r2.f7178a));
        }
    }
}
