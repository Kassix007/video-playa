.class public final LM5/j0;
.super LM5/B;
.source "SourceFile"


# instance fields
.field public final u:Lq5/c;


# direct methods
.method public constructor <init>(Lq5/h;LB5/e;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, p1, v0, v1}, LM5/B;-><init>(Lq5/h;ZI)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p0, p0}, Ln5/A;->p(LB5/e;Lq5/c;Lq5/c;)Lq5/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LM5/j0;->u:Lq5/c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final T()V
    .locals 2

    .line 1
    iget-object v0, p0, LM5/j0;->u:Lq5/c;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 8
    .line 9
    invoke-static {v1, v0}, LR5/b;->h(Ljava/lang/Object;Lq5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    instance-of v1, v0, LM5/D;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, LM5/D;

    .line 19
    .line 20
    iget-object v0, v0, LM5/D;->q:Ljava/lang/Throwable;

    .line 21
    .line 22
    :cond_0
    invoke-static {v0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0, v1}, LM5/a;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
