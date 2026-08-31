package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends d implements H5.k {
    private final boolean syntheticJavaProperty;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.d
    public H5.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return getOwner().equals(tVar.getOwner()) && getName().equals(tVar.getName()) && getSignature().equals(tVar.getSignature()) && m.a(getBoundReceiver(), tVar.getBoundReceiver());
        }
        if (obj instanceof H5.k) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H5.k
    public boolean isConst() {
        return getReflected().isConst();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H5.k
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        H5.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getReflected()LH5/b; */
    @Override // kotlin.jvm.internal.d
    public H5.k getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        H5.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (H5.k) bVarCompute;
        }
        throw new A5.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
