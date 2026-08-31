.class public final LI2/v;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LU2/g;

.field public final synthetic t:LI2/y;


# direct methods
.method public constructor <init>(LI2/y;LU2/g;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, LI2/v;->s:LU2/g;

    .line 2
    .line 3
    iput-object p1, p0, LI2/v;->t:LI2/y;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, LI2/v;

    .line 2
    .line 3
    iget-object v1, p0, LI2/v;->s:LU2/g;

    .line 4
    .line 5
    iget-object v2, p0, LI2/v;->t:LI2/y;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1, p2}, LI2/v;-><init>(LI2/y;LU2/g;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LI2/v;->r:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LI2/v;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LI2/v;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LI2/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LI2/v;->q:I

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
    return-object p1

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
    iget-object p1, p0, LI2/v;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LM5/w;

    .line 26
    .line 27
    sget-object v0, LM5/H;->a:LT5/e;

    .line 28
    .line 29
    sget-object v0, LR5/n;->a:LN5/f;

    .line 30
    .line 31
    iget-object v0, v0, LN5/f;->t:LN5/f;

    .line 32
    .line 33
    new-instance v2, LI2/u;

    .line 34
    .line 35
    iget-object v3, p0, LI2/v;->t:LI2/y;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iget-object v5, p0, LI2/v;->s:LU2/g;

    .line 39
    .line 40
    invoke-direct {v2, v3, v5, v4}, LI2/u;-><init>(LI2/y;LU2/g;Lq5/c;)V

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-static {p1, v0, v2, v3}, LM5/y;->d(LM5/w;LN5/f;LB5/e;I)LM5/B;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput v1, p0, LI2/v;->q:I

    .line 49
    .line 50
    invoke-virtual {p1, p0}, LM5/i0;->r(Ls5/i;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 55
    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    return-object p1
.end method
