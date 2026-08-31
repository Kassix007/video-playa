package n5;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: n5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1404g extends AbstractSet implements Set, C5.d {
    public abstract int d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
