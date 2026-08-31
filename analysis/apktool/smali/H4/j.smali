.class public final LH4/j;
.super LH4/f;
.source "SourceFile"


# instance fields
.field public final transient t:LH4/m;

.field public final transient u:[Ljava/lang/Object;

.field public final transient v:I


# direct methods
.method public constructor <init>(LH4/m;[Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH4/j;->t:LH4/m;

    .line 5
    .line 6
    iput-object p2, p0, LH4/j;->u:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, LH4/j;->v:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LH4/j;->t:LH4/m;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, LH4/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    return v1
.end method

.method public final d([Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LH4/f;->j()LH4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LH4/d;->d([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LH4/j;->o()LH4/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final m()LH4/d;
    .locals 1

    .line 1
    new-instance v0, LH4/i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LH4/i;-><init>(LH4/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final o()LH4/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, LH4/f;->j()LH4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, LH4/d;->k(I)LH4/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, LH4/j;->v:I

    .line 2
    .line 3
    return v0
.end method
