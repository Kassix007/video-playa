.class public final LI2/s;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LI2/y;

.field public final synthetic s:LU2/g;


# direct methods
.method public constructor <init>(LI2/y;LU2/g;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI2/s;->r:LI2/y;

    .line 2
    .line 3
    iput-object p2, p0, LI2/s;->s:LU2/g;

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
    .locals 2

    .line 1
    new-instance p1, LI2/s;

    .line 2
    .line 3
    iget-object v0, p0, LI2/s;->r:LI2/y;

    .line 4
    .line 5
    iget-object v1, p0, LI2/s;->s:LU2/g;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LI2/s;-><init>(LI2/y;LU2/g;Lq5/c;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, LI2/s;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LI2/s;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LI2/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LI2/s;->q:I

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
    iput v1, p0, LI2/s;->q:I

    .line 24
    .line 25
    iget-object p1, p0, LI2/s;->s:LU2/g;

    .line 26
    .line 27
    iget-object v0, p1, LU2/g;->n:LV2/i;

    .line 28
    .line 29
    instance-of v0, v0, LV2/f;

    .line 30
    .line 31
    iget-object v2, p0, LI2/s;->r:LI2/y;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    sget-object v0, LU2/i;->d:LI2/l;

    .line 36
    .line 37
    invoke-static {p1, v0}, LI2/q;->d(LU2/g;LI2/l;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroidx/lifecycle/q;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v2, p1, v1, p0}, LI2/y;->a(LU2/g;ILs5/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    :goto_0
    new-instance v0, LI2/v;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, v2, p1, v1}, LI2/v;-><init>(LI2/y;LU2/g;Lq5/c;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_1
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 62
    .line 63
    if-ne p1, v0, :cond_4

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_4
    return-object p1
.end method
