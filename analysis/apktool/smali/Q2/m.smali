.class public final LQ2/m;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LQ2/q;


# direct methods
.method public constructor <init>(LQ2/q;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/m;->s:LQ2/q;

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
    .locals 2

    .line 1
    new-instance v0, LQ2/m;

    .line 2
    .line 3
    iget-object v1, p0, LQ2/m;->s:LQ2/q;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LQ2/m;-><init>(LQ2/q;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LQ2/m;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LQ2/u;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LQ2/m;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LQ2/m;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LQ2/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LQ2/m;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LQ2/m;->s:LQ2/q;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LQ2/m;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LQ2/u;

    .line 13
    .line 14
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LQ2/m;->r:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v0, p1

    .line 32
    check-cast v0, LQ2/u;

    .line 33
    .line 34
    iget-object p1, v0, LQ2/u;->e:LQ2/v;

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    iput-object v0, p0, LQ2/m;->r:Ljava/lang/Object;

    .line 39
    .line 40
    iput v2, p0, LQ2/m;->q:I

    .line 41
    .line 42
    invoke-static {v1, p1, p0}, LQ2/q;->b(LQ2/q;LQ2/v;Ls5/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 47
    .line 48
    if-ne p1, v2, :cond_2

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_2
    :goto_0
    check-cast p1, LJ2/q;

    .line 52
    .line 53
    iget-object v1, v1, LQ2/q;->a:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v0, v0, LQ2/u;->d:LQ2/s;

    .line 56
    .line 57
    invoke-virtual {v0}, LQ2/s;->a()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1, v0}, LQ2/q;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, LL2/i;

    .line 66
    .line 67
    sget-object v2, LJ2/h;->t:LJ2/h;

    .line 68
    .line 69
    invoke-direct {v1, p1, v0, v2}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v0, "body == null"

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
.end method
