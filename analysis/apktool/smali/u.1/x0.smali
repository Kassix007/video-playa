.class public final Lu/x0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LU5/c;

.field public r:LO3/D0;

.field public s:I

.field public final synthetic t:LO3/D0;


# direct methods
.method public constructor <init>(LO3/D0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/x0;->t:LO3/D0;

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
    new-instance p1, Lu/x0;

    .line 2
    .line 3
    iget-object v0, p0, Lu/x0;->t:LO3/D0;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lu/x0;-><init>(LO3/D0;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Lu/x0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/x0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/x0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lu/x0;->s:I

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
    iget-object v0, p0, Lu/x0;->r:LO3/D0;

    .line 9
    .line 10
    iget-object v1, p0, Lu/x0;->q:LU5/c;

    .line 11
    .line 12
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lu/x0;->t:LO3/D0;

    .line 28
    .line 29
    move-object p1, v0

    .line 30
    check-cast p1, Lu/d0;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v2, Lu/y0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-interface {v2}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, La0/t;

    .line 42
    .line 43
    sget-object v3, Lu/m0;->t:Lu/m0;

    .line 44
    .line 45
    iget-object v4, p1, Lu/d0;->x:LA0/d;

    .line 46
    .line 47
    invoke-virtual {v2, p1, v3, v4}, La0/t;->c(Ljava/lang/Object;LB5/c;LB5/a;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Lu/d0;->A:LU5/c;

    .line 51
    .line 52
    iput-object p1, p0, Lu/x0;->q:LU5/c;

    .line 53
    .line 54
    iput-object v0, p0, Lu/x0;->r:LO3/D0;

    .line 55
    .line 56
    iput v1, p0, Lu/x0;->s:I

    .line 57
    .line 58
    invoke-virtual {p1, p0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 63
    .line 64
    if-ne v1, v2, :cond_2

    .line 65
    .line 66
    return-object v2

    .line 67
    :cond_2
    move-object v1, p1

    .line 68
    :goto_0
    const/4 p1, 0x0

    .line 69
    :try_start_0
    move-object v2, v0

    .line 70
    check-cast v2, Lu/d0;

    .line 71
    .line 72
    invoke-virtual {v0}, LO3/D0;->k()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iput-object v3, v2, Lu/d0;->u:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v2, v0

    .line 79
    check-cast v2, Lu/d0;

    .line 80
    .line 81
    iget-object v2, v2, Lu/d0;->z:LM5/h;

    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0}, LO3/D0;->k()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v2, v3}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :goto_1
    check-cast v0, Lu/d0;

    .line 96
    .line 97
    iput-object p1, v0, Lu/d0;->z:LM5/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    invoke-virtual {v1, p1}, LU5/c;->g(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 103
    .line 104
    return-object p1

    .line 105
    :goto_2
    invoke-virtual {v1, p1}, LU5/c;->g(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw v0
.end method
