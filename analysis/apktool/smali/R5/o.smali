.class public final LR5/o;
.super LM5/s;
.source "SourceFile"

# interfaces
.implements LM5/C;


# instance fields
.field public final synthetic q:LM5/C;

.field public final r:LM5/s;

.field public final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(LM5/s;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LM5/s;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, LM5/C;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, LM5/C;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, LM5/A;->a:LM5/C;

    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, LR5/o;->q:LM5/C;

    .line 18
    .line 19
    iput-object p1, p0, LR5/o;->r:LM5/s;

    .line 20
    .line 21
    iput-object p2, p0, LR5/o;->s:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final dispatch(Lq5/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR5/o;->r:LM5/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LM5/s;->dispatch(Lq5/h;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatchYield(Lq5/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR5/o;->r:LM5/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LM5/s;->dispatchYield(Lq5/h;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isDispatchNeeded(Lq5/h;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LR5/o;->r:LM5/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM5/s;->isDispatchNeeded(Lq5/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final n(JLM5/v0;Lq5/h;)LM5/J;
    .locals 1

    .line 1
    iget-object v0, p0, LR5/o;->q:LM5/C;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LM5/C;->n(JLM5/v0;Lq5/h;)LM5/J;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR5/o;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z(JLM5/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR5/o;->q:LM5/C;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LM5/C;->z(JLM5/h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
