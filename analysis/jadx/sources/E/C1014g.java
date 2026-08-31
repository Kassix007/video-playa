package e;

import b.j;
import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: e.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1014g extends AbstractC1918b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f12466e;
    public final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I1 f12467g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1014g(j jVar, String str, I1 i12, int i) {
        this.f12465d = i;
        this.f12466e = jVar;
        this.f = str;
        this.f12467g = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y4.AbstractC1918b
    public final void u(Object obj) {
        switch (this.f12465d) {
            case 0:
                j jVar = this.f12466e;
                LinkedHashMap linkedHashMap = jVar.f9874b;
                ArrayList arrayList = jVar.f9876d;
                String str = this.f;
                Object obj2 = linkedHashMap.get(str);
                I1 i12 = this.f12467g;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + i12 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    jVar.b(iIntValue, i12, obj);
                    return;
                } catch (Exception e7) {
                    arrayList.remove(str);
                    throw e7;
                }
            default:
                j jVar2 = this.f12466e;
                ArrayList arrayList2 = jVar2.f9876d;
                LinkedHashMap linkedHashMap2 = jVar2.f9874b;
                String str2 = this.f;
                Object obj3 = linkedHashMap2.get(str2);
                I1 i13 = this.f12467g;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + i13 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    jVar2.b(iIntValue2, i13, obj);
                    return;
                } catch (Exception e8) {
                    arrayList2.remove(str2);
                    throw e8;
                }
        }
    }
}
