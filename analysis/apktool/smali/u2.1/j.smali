.class public final Lu2/j;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Lu2/n;


# direct methods
.method public constructor <init>(Lu2/n;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/j;->r:Lu2/n;

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
    new-instance p1, Lu2/j;

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->r:Lu2/n;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lu2/j;-><init>(Lu2/n;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Lu2/j;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu2/j;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu2/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lu2/j;->q:I

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
    new-instance p1, LI2/d;

    .line 24
    .line 25
    const/16 v0, 0x15

    .line 26
    .line 27
    iget-object v2, p0, Lu2/j;->r:Lu2/n;

    .line 28
    .line 29
    invoke-direct {p1, v0, v2}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, LP/Q0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v0, p1, v3}, LP/Q0;-><init>(LB5/a;Lq5/c;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, Lu2/m;

    .line 39
    .line 40
    invoke-direct {v6, v0}, Lu2/m;-><init>(LB5/e;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lu2/h;

    .line 44
    .line 45
    invoke-direct {p1, v2, v3}, Lu2/h;-><init>(Lu2/n;Lq5/c;)V

    .line 46
    .line 47
    .line 48
    sget v0, LP5/u;->a:I

    .line 49
    .line 50
    new-instance v5, LP5/t;

    .line 51
    .line 52
    invoke-direct {v5, p1, v3}, LP5/t;-><init>(LB5/e;Lq5/c;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, LQ5/o;

    .line 56
    .line 57
    const/4 v8, -0x2

    .line 58
    sget-object v9, LO5/a;->q:LO5/a;

    .line 59
    .line 60
    sget-object v7, Lq5/i;->q:Lq5/i;

    .line 61
    .line 62
    invoke-direct/range {v4 .. v9}, LQ5/o;-><init>(LB5/f;LP5/h;Lq5/h;ILO5/a;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lu2/i;

    .line 66
    .line 67
    invoke-direct {p1, v2}, Lu2/i;-><init>(Lu2/n;)V

    .line 68
    .line 69
    .line 70
    iput v1, p0, Lu2/j;->q:I

    .line 71
    .line 72
    invoke-virtual {v4, p1, p0}, LQ5/i;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 77
    .line 78
    if-ne p1, v0, :cond_2

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 82
    .line 83
    return-object p1
.end method
