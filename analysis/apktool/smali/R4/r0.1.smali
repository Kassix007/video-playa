.class public final LR4/r0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:LR4/s0;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LR4/s0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/r0;->r:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LR4/r0;->s:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LR4/r0;->t:LR4/s0;

    .line 6
    .line 7
    iput-object p4, p0, LR4/r0;->u:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, LR4/r0;->v:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, LR4/r0;->w:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Ls5/i;-><init>(ILq5/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 8

    .line 1
    new-instance v0, LR4/r0;

    .line 2
    .line 3
    iget-object v5, p0, LR4/r0;->v:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v6, p0, LR4/r0;->w:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, LR4/r0;->r:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LR4/r0;->s:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, LR4/r0;->t:LR4/s0;

    .line 12
    .line 13
    iget-object v4, p0, LR4/r0;->u:Ljava/lang/String;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, LR4/r0;-><init>(Ljava/lang/String;Ljava/lang/String;LR4/s0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V

    .line 17
    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, LR4/r0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/r0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, LR4/r0;->s:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, ";"

    .line 4
    .line 5
    iget v2, p0, LR4/r0;->q:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    move-object p1, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :try_start_1
    new-instance p1, Ljava/net/URL;

    .line 31
    .line 32
    iget-object v2, p0, LR4/r0;->r:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {p1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget-object v2, LM5/H;->a:LT5/e;

    .line 38
    .line 39
    sget-object v2, LT5/d;->q:LT5/d;

    .line 40
    .line 41
    new-instance v4, LR4/q0;

    .line 42
    .line 43
    iget-object v5, p0, LR4/r0;->v:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v6, p0, LR4/r0;->w:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-direct {v4, p1, v5, v6, v7}, LR4/q0;-><init>(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V

    .line 49
    .line 50
    .line 51
    iput v3, p0, LR4/r0;->q:I

    .line 52
    .line 53
    invoke-static {v2, v4, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 58
    .line 59
    if-ne p1, v2, :cond_2

    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_2
    :goto_0
    :try_start_2
    const-string v2, "withContext(...)"

    .line 63
    .line 64
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object v5, p1

    .line 68
    check-cast v5, Ljava/io/InputStream;

    .line 69
    .line 70
    invoke-static {v0, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    filled-new-array {v1}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {v0, p1}, LJ5/m;->d1(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    move-object v0, p1

    .line 90
    check-cast v0, Ljava/lang/String;

    .line 91
    .line 92
    :cond_3
    move-object v7, v0

    .line 93
    iget-object v3, p0, LR4/r0;->t:LR4/s0;

    .line 94
    .line 95
    iget-object v4, v3, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 96
    .line 97
    iget-object v8, p0, LR4/r0;->u:Ljava/lang/String;

    .line 98
    .line 99
    const/4 v9, 0x4

    .line 100
    const/4 v6, 0x0

    .line 101
    invoke-static/range {v3 .. v9}, LR4/s0;->e(LR4/s0;Lcom/web2native/MainActivity;Ljava/io/InputStream;[BLjava/lang/String;Ljava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 106
    .line 107
    .line 108
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 109
    .line 110
    return-object p1
.end method
