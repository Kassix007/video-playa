package androidx.work.impl.model;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface WorkTagDao {

    public static final class DefaultImpls {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public static void insertTags(WorkTagDao workTagDao, String id, Set<String> tags) {
            m.e(id, "id");
            m.e(tags, "tags");
            WorkTagDao.super.insertTags(id, tags);
        }
    }

    void deleteByWorkSpecId(String str);

    List<String> getTagsForWorkSpecId(String str);

    List<String> getWorkSpecIdsWithTag(String str);

    void insert(WorkTag workTag);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void insertTags(String id, Set<String> tags) {
        m.e(id, "id");
        m.e(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            insert(new WorkTag((String) it.next(), id));
        }
    }
}
