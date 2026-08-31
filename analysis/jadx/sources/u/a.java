package U;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f7488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f7489s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f7487q = i;
        this.f7488r = obj;
        this.f7489s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f7487q) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && kotlin.jvm.internal.m.a(entry.getKey(), this.f7488r) && kotlin.jvm.internal.m.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f7487q) {
        }
        return this.f7488r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f7487q) {
        }
        return this.f7489s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f7487q) {
            case 0:
                Object obj = this.f7488r;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f7487q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:IGET), 61, (wrap:java.lang.Object:INVOKE) */
    public String toString() {
        switch (this.f7487q) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f7488r);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
