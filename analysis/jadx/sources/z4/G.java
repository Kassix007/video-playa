package Z4;

import R4.C0433b2;
import androidx.work.impl.utils.PreferenceUtils;
import java.util.Map;
import m5.C1386y;
import u2.AbstractC1686g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8453q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [B0.o.<init>(R4.k1, int):void, I2.d.invoke():java.lang.Object, a6.n.<clinit>():void, a6.x.toString():java.lang.String, androidx.work.impl.utils.PreferenceUtils.getLastCancelAllTimeMillisLiveData():androidx.lifecycle.G, com.web2native.MainActivity.onCreate(android.os.Bundle):void] */
    public /* synthetic */ G(int i) {
        this.f8453q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f8453q;
        C1386y c1386y = C1386y.f15098a;
        switch (i) {
            case 0:
                ((a6.h) obj).f9029b = true;
                return c1386y;
            case 1:
                return c1386y;
            case 2:
                a6.h Json = (a6.h) obj;
                kotlin.jvm.internal.m.e(Json, "$this$Json");
                Json.f9029b = true;
                return c1386y;
            case 3:
                X5.a buildSerialDescriptor = (X5.a) obj;
                kotlin.jvm.internal.m.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                X5.a.a(buildSerialDescriptor, "JsonPrimitive", new a6.o(new C0433b2(19)));
                X5.a.a(buildSerialDescriptor, "JsonNull", new a6.o(new C0433b2(20)));
                X5.a.a(buildSerialDescriptor, "JsonLiteral", new a6.o(new C0433b2(21)));
                X5.a.a(buildSerialDescriptor, "JsonObject", new a6.o(new C0433b2(22)));
                X5.a.a(buildSerialDescriptor, "JsonArray", new a6.o(new C0433b2(23)));
                return c1386y;
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                a6.l lVar = (a6.l) entry.getValue();
                StringBuilder sb = new StringBuilder();
                b6.k.a(sb, str);
                sb.append(':');
                sb.append(lVar);
                return sb.toString();
            case 5:
                return PreferenceUtils.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj);
            case 6:
                return c1386y;
            case 7:
                r6.h entry2 = (r6.h) obj;
                kotlin.jvm.internal.m.e(entry2, "entry");
                q6.x xVar = r6.g.f16379v;
                return Boolean.valueOf(r6.f.a(entry2.f16383a));
            case 8:
                r6.h it = (r6.h) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Boolean.TRUE;
            case 9:
                return c1386y;
            default:
                return (AbstractC1686g) obj;
        }
    }
}
