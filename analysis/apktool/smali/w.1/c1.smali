.class public final Lw/c1;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LM5/b0;

.field public final synthetic t:Ls5/i;


# direct methods
.method public constructor <init>(LM5/b0;LB5/e;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/c1;->s:LM5/b0;

    .line 2
    .line 3
    check-cast p2, Ls5/i;

    .line 4
    .line 5
    iput-object p2, p0, Lw/c1;->t:Ls5/i;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lw/c1;

    .line 2
    .line 3
    iget-object v1, p0, Lw/c1;->s:LM5/b0;

    .line 4
    .line 5
    iget-object v2, p0, Lw/c1;->t:Ls5/i;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lw/c1;-><init>(LM5/b0;LB5/e;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lw/c1;->r:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lw/c1;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/c1;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/c1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lw/c1;->q:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lr5/a;->q:Lr5/a;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    iget-object v0, p0, Lw/c1;->r:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, LM5/w;

    .line 28
    .line 29
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lw/c1;->r:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v0, p1

    .line 39
    check-cast v0, LM5/w;

    .line 40
    .line 41
    iput-object v0, p0, Lw/c1;->r:Ljava/lang/Object;

    .line 42
    .line 43
    iput v2, p0, Lw/c1;->q:I

    .line 44
    .line 45
    iget-object p1, p0, Lw/c1;->s:LM5/b0;

    .line 46
    .line 47
    invoke-interface {p1, p0}, LM5/b0;->f(Ls5/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v3, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lw/c1;->r:Ljava/lang/Object;

    .line 56
    .line 57
    iput v1, p0, Lw/c1;->q:I

    .line 58
    .line 59
    iget-object p1, p0, Lw/c1;->t:Ls5/i;

    .line 60
    .line 61
    invoke-interface {p1, v0, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v3, :cond_4

    .line 66
    .line 67
    :goto_1
    return-object v3

    .line 68
    :cond_4
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 69
    .line 70
    return-object p1
.end method
