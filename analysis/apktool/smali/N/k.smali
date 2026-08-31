.class public final LN/k;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public q:I

.field public final synthetic r:LN/r;

.field public final synthetic s:LB5/f;


# direct methods
.method public constructor <init>(LB5/f;LN/r;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, LN/k;->r:LN/r;

    .line 2
    .line 3
    iput-object p1, p0, LN/k;->s:LB5/f;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, LN/k;

    .line 2
    .line 3
    iget-object v1, p0, LN/k;->r:LN/r;

    .line 4
    .line 5
    iget-object v2, p0, LN/k;->s:LB5/f;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1, p1}, LN/k;-><init>(LB5/f;LN/r;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LN/k;->create(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LN/k;

    .line 8
    .line 9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LN/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LN/k;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, LN/i;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iget-object v2, p0, LN/k;->r:LN/r;

    .line 27
    .line 28
    invoke-direct {p1, v2, v0}, LN/i;-><init>(LN/r;I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, LN/j;

    .line 32
    .line 33
    iget-object v3, p0, LN/k;->s:LB5/f;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v0, v3, v2, v4}, LN/j;-><init>(LB5/f;LN/r;Lq5/c;)V

    .line 37
    .line 38
    .line 39
    iput v1, p0, LN/k;->q:I

    .line 40
    .line 41
    invoke-static {p1, v0, p0}, Landroidx/compose/material3/internal/a;->a(LB5/a;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 46
    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 51
    .line 52
    return-object p1
.end method
