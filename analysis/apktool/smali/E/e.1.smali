.class public final LE/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/k;


# instance fields
.field public q:Z

.field public r:LM5/h;


# virtual methods
.method public final f(Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, LE/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LE/d;

    .line 7
    .line 8
    iget v1, v0, LE/d;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LE/d;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LE/d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LE/d;-><init>(LE/e;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LE/d;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LE/d;->t:I

    .line 28
    .line 29
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object v0, v0, LE/d;->q:LM5/h;

    .line 37
    .line 38
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-boolean p1, p0, LE/e;->q:Z

    .line 54
    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, LE/e;->r:LM5/h;

    .line 58
    .line 59
    iput-object p1, v0, LE/d;->q:LM5/h;

    .line 60
    .line 61
    iput v3, v0, LE/d;->t:I

    .line 62
    .line 63
    new-instance v1, LM5/h;

    .line 64
    .line 65
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {v1, v3, v0}, LM5/h;-><init>(ILq5/c;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, LM5/h;->s()V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, LE/e;->r:LM5/h;

    .line 76
    .line 77
    invoke-virtual {v1}, LM5/h;->r()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 82
    .line 83
    if-ne v0, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    move-object v0, p1

    .line 87
    :goto_1
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-interface {v0, v2}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    return-object v2
.end method
