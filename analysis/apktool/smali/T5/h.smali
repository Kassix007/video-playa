.class public abstract LT5/h;
.super LM5/T;
.source "SourceFile"


# instance fields
.field public q:LT5/c;


# virtual methods
.method public final a0()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/h;->q:LT5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final dispatch(Lq5/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LT5/h;->q:LT5/c;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-static {p1, p2, v0}, LT5/c;->c(LT5/c;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final dispatchYield(Lq5/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LT5/h;->q:LT5/c;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {p1, p2, v0}, LT5/c;->c(LT5/c;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
