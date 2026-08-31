.class public final LN/n;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public q:I

.field public final synthetic r:LN/r;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:LB5/g;


# direct methods
.method public constructor <init>(LN/r;Ljava/lang/Object;LB5/g;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/n;->r:LN/r;

    .line 2
    .line 3
    iput-object p2, p0, LN/n;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LN/n;->t:LB5/g;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, LN/n;

    .line 2
    .line 3
    iget-object v1, p0, LN/n;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LN/n;->t:LB5/g;

    .line 6
    .line 7
    iget-object v3, p0, LN/n;->r:LN/r;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p1}, LN/n;-><init>(LN/r;Ljava/lang/Object;LB5/g;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LN/n;->create(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LN/n;

    .line 8
    .line 9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LN/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LN/n;->q:I

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
    iget-object p1, p0, LN/n;->s:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v0, p0, LN/n;->r:LN/r;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, LN/r;->h(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, LN/i;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {p1, v0, v2}, LN/i;-><init>(LN/r;I)V

    .line 34
    .line 35
    .line 36
    new-instance v2, LN/m;

    .line 37
    .line 38
    iget-object v3, p0, LN/n;->t:LB5/g;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v2, v3, v0, v4}, LN/m;-><init>(LB5/g;LN/r;Lq5/c;)V

    .line 42
    .line 43
    .line 44
    iput v1, p0, LN/n;->q:I

    .line 45
    .line 46
    invoke-static {p1, v2, p0}, Landroidx/compose/material3/internal/a;->a(LB5/a;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 51
    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 56
    .line 57
    return-object p1
.end method
