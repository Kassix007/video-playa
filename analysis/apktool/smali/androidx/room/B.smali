.class public final Landroidx/room/B;
.super Landroidx/lifecycle/G;
.source "SourceFile"


# instance fields
.field public final l:Landroidx/work/impl/WorkDatabase_Impl;

.field public final m:LZ/m;

.field public final n:Z

.field public final o:Ljava/util/concurrent/Callable;

.field public final p:Landroidx/room/d;

.field public final q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final r:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final s:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final t:Landroidx/room/A;

.field public final u:Landroidx/room/A;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;LZ/m;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/lifecycle/G;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/room/B;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/room/B;->m:LZ/m;

    .line 12
    .line 13
    iput-boolean p3, p0, Landroidx/room/B;->n:Z

    .line 14
    .line 15
    iput-object p4, p0, Landroidx/room/B;->o:Ljava/util/concurrent/Callable;

    .line 16
    .line 17
    new-instance p1, Landroidx/room/d;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    invoke-direct {p1, p5, p0, p2}, Landroidx/room/d;-><init>([Ljava/lang/String;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/room/B;->p:Landroidx/room/d;

    .line 24
    .line 25
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/room/B;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/room/B;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Landroidx/room/B;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    new-instance p1, Landroidx/room/A;

    .line 48
    .line 49
    invoke-direct {p1, p0, p2}, Landroidx/room/A;-><init>(Landroidx/room/B;I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Landroidx/room/B;->t:Landroidx/room/A;

    .line 53
    .line 54
    new-instance p1, Landroidx/room/A;

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    invoke-direct {p1, p0, p2}, Landroidx/room/A;-><init>(Landroidx/room/B;I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Landroidx/room/B;->u:Landroidx/room/A;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/B;->m:LZ/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Landroidx/room/B;->n:Z

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/room/B;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/room/w;->getTransactionExecutor()Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1}, Landroidx/room/w;->getQueryExecutor()Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    iget-object v1, p0, Landroidx/room/B;->t:Landroidx/room/A;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/B;->m:LZ/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
