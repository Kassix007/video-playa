.class public final LP/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements LC5/a;


# instance fields
.field public A:Lr/v;

.field public q:[I

.field public r:I

.field public s:[Ljava/lang/Object;

.field public t:I

.field public u:I

.field public final v:Ljava/lang/Object;

.field public w:Z

.field public x:I

.field public y:Ljava/util/ArrayList;

.field public z:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, LP/A0;->q:[I

    .line 8
    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, LP/A0;->s:[Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LP/A0;->v:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LP/A0;->y:Ljava/util/ArrayList;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final d(LP/a;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, LP/A0;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Use active SlotWriter to determine anchor location instead"

    .line 6
    .line 7
    invoke-static {v0}, LP/p;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, LP/a;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "Anchor refers to a group that was removed"

    .line 17
    .line 18
    invoke-static {v0}, LP/j0;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget p1, p1, LP/a;->a:I

    .line 22
    .line 23
    return p1
.end method

.method public final g()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LP/A0;->z:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public final h()LP/z0;
    .locals 2

    .line 1
    iget-boolean v0, p0, LP/A0;->w:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LP/A0;->u:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, LP/A0;->u:I

    .line 10
    .line 11
    new-instance v0, LP/z0;

    .line 12
    .line 13
    invoke-direct {v0, p0}, LP/z0;-><init>(LP/A0;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "Cannot read while a writer is pending"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public final i()LP/D0;
    .locals 2

    .line 1
    iget-boolean v0, p0, LP/A0;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot start a writer when another writer is pending"

    .line 6
    .line 7
    invoke-static {v0}, LP/p;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, LP/A0;->u:I

    .line 11
    .line 12
    if-gtz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "Cannot start a writer when a reader is pending"

    .line 16
    .line 17
    invoke-static {v0}, LP/p;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, LP/A0;->w:Z

    .line 22
    .line 23
    iget v1, p0, LP/A0;->x:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    iput v1, p0, LP/A0;->x:I

    .line 27
    .line 28
    new-instance v0, LP/D0;

    .line 29
    .line 30
    invoke-direct {v0, p0}, LP/D0;-><init>(LP/A0;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, LP/J;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, LP/A0;->r:I

    .line 5
    .line 6
    invoke-direct {v0, p0, v1, v2}, LP/J;-><init>(LP/A0;II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final j(LP/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LP/a;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LP/A0;->y:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget v1, p1, LP/a;->a:I

    .line 10
    .line 11
    iget v2, p0, LP/A0;->r:I

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, LP/C0;->e(Ljava/util/ArrayList;II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, LP/A0;->y:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return p1
.end method
