.class public abstract LM5/s;
.super Lq5/a;
.source "SourceFile"

# interfaces
.implements Lq5/e;


# static fields
.field public static final Key:LM5/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LM5/r;

    .line 2
    .line 3
    new-instance v1, LI5/m;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    invoke-direct {v1, v2}, LI5/m;-><init>(I)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lq5/d;->q:Lq5/d;

    .line 11
    .line 12
    invoke-direct {v0, v2, v1}, LM5/r;-><init>(Lq5/g;LB5/c;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LM5/s;->Key:LM5/r;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lq5/d;->q:Lq5/d;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lq5/a;-><init>(Lq5/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic limitedParallelism$default(LM5/s;ILjava/lang/String;ILjava/lang/Object;)LM5/s;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, LM5/s;->limitedParallelism(ILjava/lang/String;)LM5/s;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: limitedParallelism"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public abstract dispatch(Lq5/h;Ljava/lang/Runnable;)V
.end method

.method public dispatchYield(Lq5/h;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LR5/b;->i(LM5/s;Lq5/h;Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public get(Lq5/g;)Lq5/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq5/f;",
            ">(",
            "Lq5/g;",
            ")TE;"
        }
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v1, p1, LM5/r;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    check-cast p1, LM5/r;

    .line 12
    .line 13
    invoke-interface {p0}, Lq5/f;->getKey()Lq5/g;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    if-eq v1, p1, :cond_1

    .line 21
    .line 22
    iget-object v0, p1, LM5/r;->r:Lq5/g;

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v2

    .line 28
    :cond_1
    :goto_0
    iget-object p1, p1, LM5/r;->q:LB5/c;

    .line 29
    .line 30
    invoke-interface {p1, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lq5/f;

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_2
    sget-object v0, Lq5/d;->q:Lq5/d;

    .line 40
    .line 41
    if-ne v0, p1, :cond_3

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_3
    return-object v2
.end method

.method public final interceptContinuation(Lq5/c;)Lq5/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq5/c<",
            "-TT;>;)",
            "Lq5/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, LR5/g;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LR5/g;-><init>(LM5/s;Lq5/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public isDispatchNeeded(Lq5/h;)Z
    .locals 0

    .line 1
    instance-of p1, p0, LM5/x0;

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    return p1
.end method

.method public synthetic limitedParallelism(I)LM5/s;
    .locals 1
    .annotation runtime Lm5/c;
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, LM5/s;->limitedParallelism(ILjava/lang/String;)LM5/s;

    move-result-object p1

    return-object p1
.end method

.method public limitedParallelism(ILjava/lang/String;)LM5/s;
    .locals 1

    .line 1
    invoke-static {p1}, LR5/b;->a(I)V

    .line 2
    new-instance v0, LR5/h;

    invoke-direct {v0, p0, p1, p2}, LR5/h;-><init>(LM5/s;ILjava/lang/String;)V

    return-object v0
.end method

.method public minusKey(Lq5/g;)Lq5/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq5/g;",
            ")",
            "Lq5/h;"
        }
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v1, p1, LM5/r;

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, LM5/r;

    .line 11
    .line 12
    invoke-interface {p0}, Lq5/f;->getKey()Lq5/g;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    if-eq v1, p1, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, LM5/r;->r:Lq5/g;

    .line 22
    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object p0

    .line 27
    :cond_1
    :goto_0
    iget-object p1, p1, LM5/r;->q:LB5/c;

    .line 28
    .line 29
    invoke-interface {p1, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lq5/f;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    sget-object v0, Lq5/d;->q:Lq5/d;

    .line 39
    .line 40
    if-ne v0, p1, :cond_3

    .line 41
    .line 42
    :goto_1
    sget-object p1, Lq5/i;->q:Lq5/i;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_3
    return-object p0
.end method

.method public final plus(LM5/s;)LM5/s;
    .locals 0
    .annotation runtime Lm5/c;
    .end annotation

    .line 1
    return-object p1
.end method

.method public final releaseInterceptedContinuation(Lq5/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq5/c<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LR5/g;

    .line 7
    .line 8
    sget-object v0, LR5/g;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, LR5/b;->c:LE4/f;

    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of v0, p1, LM5/h;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p1, LM5/h;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    :goto_0
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, LM5/h;->l()V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x40

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, LM5/y;->m(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method
