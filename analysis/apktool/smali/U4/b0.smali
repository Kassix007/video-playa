.class public final LU4/b0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;


# direct methods
.method public constructor <init>(LR4/k1;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/b0;->q:LR4/k1;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1

    .line 1
    new-instance p1, LU4/b0;

    .line 2
    .line 3
    iget-object v0, p0, LU4/b0;->q:LR4/k1;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LU4/b0;-><init>(LR4/k1;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU4/b0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/b0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/b0;->q:LR4/k1;

    .line 5
    .line 6
    iget v0, p1, LR4/k1;->f:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x3

    .line 12
    .line 13
    invoke-static {p1, v0, v1}, LU4/a;->B(LR4/k1;J)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    int-to-long v0, v0

    .line 18
    invoke-static {p1, v0, v1}, LU4/a;->B(LR4/k1;J)V

    .line 19
    .line 20
    .line 21
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    return-object p1
.end method
