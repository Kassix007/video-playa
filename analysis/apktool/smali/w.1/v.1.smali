.class public final Lw/v;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lw/C;

.field public final synthetic t:Lv0/o;

.field public final synthetic u:LF/p;

.field public final synthetic v:LA/J;

.field public final synthetic w:Lw/w;

.field public final synthetic x:Lw/w;

.field public final synthetic y:LB0/j0;


# direct methods
.method public constructor <init>(Lw/C;Lv0/o;LF/p;LA/J;Lw/w;Lw/w;LB0/j0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/v;->s:Lw/C;

    .line 2
    .line 3
    iput-object p2, p0, Lw/v;->t:Lv0/o;

    .line 4
    .line 5
    iput-object p3, p0, Lw/v;->u:LF/p;

    .line 6
    .line 7
    iput-object p4, p0, Lw/v;->v:LA/J;

    .line 8
    .line 9
    iput-object p5, p0, Lw/v;->w:Lw/w;

    .line 10
    .line 11
    iput-object p6, p0, Lw/v;->x:Lw/w;

    .line 12
    .line 13
    iput-object p7, p0, Lw/v;->y:LB0/j0;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Ls5/i;-><init>(ILq5/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 9

    .line 1
    new-instance v0, Lw/v;

    .line 2
    .line 3
    iget-object v6, p0, Lw/v;->x:Lw/w;

    .line 4
    .line 5
    iget-object v7, p0, Lw/v;->y:LB0/j0;

    .line 6
    .line 7
    iget-object v1, p0, Lw/v;->s:Lw/C;

    .line 8
    .line 9
    iget-object v2, p0, Lw/v;->t:Lv0/o;

    .line 10
    .line 11
    iget-object v3, p0, Lw/v;->u:LF/p;

    .line 12
    .line 13
    iget-object v4, p0, Lw/v;->v:LA/J;

    .line 14
    .line 15
    iget-object v5, p0, Lw/v;->w:Lw/w;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lw/v;-><init>(Lw/C;Lv0/o;LF/p;LA/J;Lw/w;Lw/w;LB0/j0;Lq5/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lw/v;->r:Ljava/lang/Object;

    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2}, Lw/v;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/v;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lw/v;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    iget-object v2, p0, Lw/v;->s:Lw/C;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v3, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lw/v;->r:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v3, v0

    .line 15
    check-cast v3, LM5/w;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :catch_0
    move-exception v0

    .line 22
    :goto_0
    move-object p1, v0

    .line 23
    goto :goto_3

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lw/v;->r:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, LM5/w;

    .line 38
    .line 39
    :try_start_1
    iget-object v7, v2, Lw/C;->G:Lw/d0;

    .line 40
    .line 41
    iget-object v0, p0, Lw/v;->t:Lv0/o;

    .line 42
    .line 43
    iget-object v8, p0, Lw/v;->u:LF/p;

    .line 44
    .line 45
    iget-object v11, p0, Lw/v;->v:LA/J;

    .line 46
    .line 47
    iget-object v10, p0, Lw/v;->w:Lw/w;

    .line 48
    .line 49
    iget-object v5, p0, Lw/v;->x:Lw/w;

    .line 50
    .line 51
    iget-object v9, p0, Lw/v;->y:LB0/j0;

    .line 52
    .line 53
    iput-object p1, p0, Lw/v;->r:Ljava/lang/Object;

    .line 54
    .line 55
    iput v3, p0, Lw/v;->q:I

    .line 56
    .line 57
    sget v3, Lw/u;->a:F

    .line 58
    .line 59
    new-instance v6, Lkotlin/jvm/internal/x;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lw/t;

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    invoke-direct/range {v4 .. v12}, Lw/t;-><init>(Lw/w;Lkotlin/jvm/internal/x;Lw/d0;LF/p;LB0/j0;Lw/w;LA/J;Lq5/c;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v4, p0}, Lw/p0;->c(Lv0/o;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 75
    .line 76
    if-ne p1, v0, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-object p1, v1

    .line 80
    :goto_1
    if-ne p1, v0, :cond_4

    .line 81
    .line 82
    return-object v0

    .line 83
    :goto_2
    move-object v3, p1

    .line 84
    goto :goto_0

    .line 85
    :catch_1
    move-exception v0

    .line 86
    goto :goto_2

    .line 87
    :goto_3
    iget-object v0, v2, Lw/C;->K:LO5/e;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    sget-object v2, Lw/o;->a:Lw/o;

    .line 92
    .line 93
    invoke-interface {v0, v2}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-static {v3}, LM5/y;->r(LM5/w;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    :cond_4
    return-object v1

    .line 103
    :cond_5
    throw p1
.end method
