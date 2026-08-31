package U2;

import android.content.Context;
import com.web2native.MainActivity;
import java.util.Map;
import kotlin.jvm.internal.B;
import n5.AbstractC1397A;
import n5.t;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f7634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f7636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B5.c f7637e;
    public final B5.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B5.c f7638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V2.i f7639h;
    public V2.g i;
    public V2.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f7640k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(MainActivity mainActivity) {
        this.f7633a = mainActivity;
        this.f7634b = e.f7641o;
        this.f7635c = null;
        this.f7636d = t.f15300q;
        Y2.i iVar = Y2.i.f8214q;
        this.f7637e = iVar;
        this.f = iVar;
        this.f7638g = iVar;
        this.f7639h = null;
        this.i = null;
        this.j = null;
        this.f7640k = I2.m.f2366b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g a() {
        I2.m mVar;
        Object obj = this.f7635c;
        if (obj == null) {
            obj = l.f7685a;
        }
        Object obj2 = obj;
        Boolean bool = Boolean.FALSE;
        Map mapF = this.f7636d;
        if (kotlin.jvm.internal.m.a(mapF, bool)) {
            kotlin.jvm.internal.m.c(mapF, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            mapF = AbstractC1397A.F(B.a(mapF));
        } else if (mapF == null) {
            throw new AssertionError();
        }
        Map map = mapF;
        kotlin.jvm.internal.m.c(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        e eVar = this.f7634b;
        q6.l lVar = eVar.f7642a;
        b bVar = eVar.f7646e;
        b bVar2 = eVar.f;
        b bVar3 = eVar.f7647g;
        InterfaceC1529h interfaceC1529h = eVar.f7643b;
        InterfaceC1529h interfaceC1529h2 = eVar.f7644c;
        InterfaceC1529h interfaceC1529h3 = eVar.f7645d;
        B5.c cVar = this.f7637e;
        if (cVar == null) {
            cVar = eVar.f7648h;
        }
        B5.c cVar2 = cVar;
        B5.c cVar3 = this.f;
        if (cVar3 == null) {
            cVar3 = eVar.i;
        }
        B5.c cVar4 = cVar3;
        B5.c cVar5 = this.f7638g;
        if (cVar5 == null) {
            cVar5 = eVar.j;
        }
        B5.c cVar6 = cVar5;
        V2.i iVar = this.f7639h;
        if (iVar == null) {
            iVar = eVar.f7649k;
        }
        V2.i iVar2 = iVar;
        V2.g gVar = this.i;
        if (gVar == null) {
            gVar = eVar.f7650l;
        }
        V2.g gVar2 = gVar;
        V2.d dVar = this.j;
        if (dVar == null) {
            dVar = eVar.f7651m;
        }
        V2.d dVar2 = dVar;
        Object obj3 = this.f7640k;
        if (obj3 instanceof I2.k) {
            I2.k kVar = (I2.k) obj3;
            kVar.getClass();
            mVar = new I2.m(AbstractC1397A.F(kVar.f2363a));
        } else {
            if (!(obj3 instanceof I2.m)) {
                throw new AssertionError();
            }
            mVar = (I2.m) obj3;
        }
        return new g(this.f7633a, obj2, map, lVar, interfaceC1529h, interfaceC1529h2, interfaceC1529h3, bVar, bVar2, bVar3, cVar2, cVar4, cVar6, iVar2, gVar2, dVar2, mVar, new f(this.f7637e, this.f, this.f7638g, this.f7639h, this.i, this.j), this.f7634b);
    }

    public d(g gVar, Context context) {
        this.f7633a = context;
        this.f7634b = gVar.f7673s;
        this.f7635c = gVar.f7659b;
        this.f7636d = gVar.f7660c;
        f fVar = gVar.f7672r;
        this.f7637e = fVar.f7653a;
        this.f = fVar.f7654b;
        this.f7638g = fVar.f7655c;
        this.f7639h = fVar.f7656d;
        this.i = fVar.f7657e;
        this.j = fVar.f;
        this.f7640k = gVar.f7671q;
    }
}
